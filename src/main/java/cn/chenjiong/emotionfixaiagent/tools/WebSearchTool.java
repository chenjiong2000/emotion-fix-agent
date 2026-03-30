package cn.chenjiong.emotionfixaiagent.tools;

import cn.hutool.core.util.StrUtil;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.springframework.ai.tool.annotation.Tool;
import org.springframework.ai.tool.annotation.ToolParam;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

/**
 * 联网搜索工具 - 基于 SearchAPI.io 的 Bing 搜索引擎
 */
public class WebSearchTool {

    private static final String SEARCH_API_URL = "https://www.searchapi.io/api/v1/search";

    private final String apiKey;
    private final OkHttpClient httpClient;
    private final ObjectMapper objectMapper;
    
    public WebSearchTool(String apiKey) {
        this.apiKey = apiKey;
        this.httpClient = new OkHttpClient.Builder()
                .connectTimeout(30, TimeUnit.SECONDS)
                .readTimeout(30, TimeUnit.SECONDS)
                .build();
        this.objectMapper = new ObjectMapper();
    }
    
    /**
     * 通用搜索方法
     *
     * @param query    搜索关键词
     * @param location 地理位置（可选，格式：邮编,城市,国家，如 "10003,New York,United States"）
     * @param limit    返回结果数量（默认10）
     * @return 格式化的搜索结果
     */
    @Tool(description = "Search the web using Bing engine. Returns organic results, local results, and related searches.")
    public String search(
            @ToolParam(description = "Search query, e.g., 'Restaurants near me'") String query,
            @ToolParam(description = "Location in format 'zipcode,city,country', e.g., '10003,New York,United States'", required = false) String location,
            @ToolParam(description = "Maximum number of results to return, default is 10", required = false) Integer limit) {
        
        if (StrUtil.isBlank(apiKey)) {
            return "Error: SearchAPI API key is not configured. Please set searchapi.api-key in application.yml or environment variable SEARCHAPI_API_KEY.";
        }
        
        if (StrUtil.isBlank(query)) {
            return "Error: Search query cannot be empty.";
        }
        
        int resultLimit = (limit == null || limit <= 0) ? 10 : Math.min(limit, 20);
        
        try {
            // 构建请求URL
            HttpUrl.Builder urlBuilder = HttpUrl.parse(SEARCH_API_URL).newBuilder();
            urlBuilder.addQueryParameter("engine", "bing");
            urlBuilder.addQueryParameter("q", query);
            
            if (StrUtil.isNotBlank(location)) {
                urlBuilder.addQueryParameter("location", location);
            }
            
            // 添加API密钥到请求头
            Request request = new Request.Builder()
                    .url(urlBuilder.build())
                    .addHeader("Authorization", "Bearer " + apiKey)
                    .addHeader("Content-Type", "application/json")
                    .build();
            
            // 执行请求
            try (Response response = httpClient.newCall(request).execute()) {
                if (!response.isSuccessful()) {
                    return String.format("Search API error: HTTP %d - %s", 
                            response.code(), response.message());
                }
                
                String responseBody = response.body().string();
                return formatSearchResults(responseBody, resultLimit);
            }
            
        } catch (IOException e) {
            return "Search error: " + e.getMessage();
        }
    }
    
    /**
     * 简化搜索（使用默认参数）
     */
    @Tool(description = "Quick web search with just a query. Uses default location and returns top 5 results.")
    public String quickSearch(
            @ToolParam(description = "Search query") String query) {
        return search(query, null, 5);
    }
    
    /**
     * 本地搜索（带位置信息）
     */
    @Tool(description = "Search for places near a specific location. Great for finding restaurants, shops, etc.")
    public String localSearch(
            @ToolParam(description = "What to search for, e.g., 'restaurants', 'cafes'") String query,
            @ToolParam(description = "Location in format 'zipcode,city,country'") String location,
            @ToolParam(description = "Number of results, default 10", required = false) Integer limit) {
        return search(query, location, limit);
    }
    
    /**
     * 格式化搜索结果
     */
    private String formatSearchResults(String jsonResponse, int limit) {
        try {
            JsonNode root = objectMapper.readTree(jsonResponse);
            
            // 检查是否有错误
            if (root.has("error")) {
                return "API Error: " + root.path("error").path("message").asText("Unknown error");
            }
            
            StringBuilder result = new StringBuilder();
            
            // 1. 搜索元数据
            result.append("📊 Search Info:\n");
            JsonNode searchInfo = root.path("search_information");
            if (!searchInfo.isMissingNode()) {
                result.append("  - Query: ").append(searchInfo.path("query_displayed").asText("")).append("\n");
                result.append("  - Location: ").append(searchInfo.path("detected_location").asText("Unknown")).append("\n");
            }
            result.append("\n");
            
            // 2. 本地结果（优先展示）
            JsonNode localResults = root.path("local_results");
            if (localResults.isArray() && localResults.size() > 0) {
                result.append("📍 Local Results:\n");
                int count = 0;
                for (JsonNode local : localResults) {
                    if (count >= limit) break;
                    result.append(formatLocalResult(local));
                    count++;
                }
                result.append("\n");
            }
            
            // 3. 有机搜索结果
            JsonNode organicResults = root.path("organic_results");
            if (organicResults.isArray() && organicResults.size() > 0) {
                result.append("🔗 Web Results:\n");
                int count = 0;
                for (JsonNode organic : organicResults) {
                    if (count >= limit) break;
                    result.append(formatOrganicResult(organic));
                    count++;
                }
                result.append("\n");
            }
            
            // 4. 相关搜索
            JsonNode relatedSearches = root.path("related_searches");
            if (relatedSearches.isArray() && relatedSearches.size() > 0) {
                result.append("💡 Related Searches:\n");
                int count = 0;
                for (JsonNode related : relatedSearches) {
                    if (count >= 5) break;
                    result.append("  - ").append(related.path("query").asText("")).append("\n");
                    count++;
                }
            }
            
            // 如果没有任何结果
            if (result.length() == 0) {
                return "No results found for your search query.";
            }
            
            return result.toString();
            
        } catch (Exception e) {
            return "Error parsing search results: " + e.getMessage();
        }
    }
    
    /**
     * 格式化本地搜索结果
     */
    private String formatLocalResult(JsonNode result) {
        StringBuilder sb = new StringBuilder();
        sb.append("  • ").append(result.path("title").asText("Unknown"));
        
        // 添加评分
        if (result.has("rating")) {
            sb.append(" ⭐ ").append(result.path("rating").asDouble(0));
            if (result.has("reviews")) {
                sb.append(" (").append(result.path("reviews").asInt(0)).append(" reviews)");
            }
        }
        
        // 添加价格
        if (result.has("price")) {
            sb.append(" ").append(result.path("price").asText(""));
        }
        
        sb.append("\n");
        
        // 添加类型
        if (result.has("type")) {
            sb.append("    Type: ").append(result.path("type").asText("")).append("\n");
        }
        
        // 添加地址/坐标
        if (result.has("gps_coordinates")) {
            JsonNode coords = result.path("gps_coordinates");
            sb.append("    Location: ").append(coords.path("latitude").asText(""))
              .append(", ").append(coords.path("longitude").asText("")).append("\n");
        }
        
        // 添加扩展信息（如：Delivery, Takeout等）
        if (result.has("extensions") && result.path("extensions").isArray()) {
            sb.append("    Features: ");
            for (JsonNode ext : result.path("extensions")) {
                sb.append(ext.asText()).append(" · ");
            }
            sb.setLength(sb.length() - 2);
            sb.append("\n");
        }
        
        return sb.toString();
    }
    
    /**
     * 格式化有机搜索结果
     */
    private String formatOrganicResult(JsonNode result) {
        StringBuilder sb = new StringBuilder();
        sb.append("  • ").append(result.path("title").asText("Unknown")).append("\n");
        sb.append("    Link: ").append(result.path("link").asText("")).append("\n");
        
        String snippet = result.path("snippet").asText("");
        if (StrUtil.isNotBlank(snippet)) {
            // 截取前200个字符
            if (snippet.length() > 200) {
                snippet = snippet.substring(0, 200) + "...";
            }
            sb.append("    Summary: ").append(snippet).append("\n");
        }
        
        return sb.toString();
    }
}