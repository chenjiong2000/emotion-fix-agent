package cn.chenjiong.emotionfixaiagent.tools;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class WebSearchToolTest {

    @Value("${searchapi.api-key}")
    String apiKey;
    @Test
    void search() {
        WebSearchTool webSearchTool = new WebSearchTool(apiKey);
        String result = webSearchTool.quickSearch("csgo 历史上最牛的5个人");
        System.out.println(result);
        Assertions.assertFalse(result.contains("error"));

        result = webSearchTool.search("Restaurants near me", "10003,New York,United States", 5);
        System.out.println(result);
        Assertions.assertFalse(result.toLowerCase().contains("error"));
    }
}