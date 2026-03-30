package cn.chenjiong.emotionfixaiagent.agent;

import cn.chenjiong.emotionfixaiagent.advisors.MyLoggerAdvisor;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.chat.client.advisor.MessageChatMemoryAdvisor;
import org.springframework.ai.chat.client.advisor.api.Advisor;
import org.springframework.ai.chat.memory.ChatMemory;
import org.springframework.ai.chat.memory.InMemoryChatMemoryRepository;
import org.springframework.ai.chat.memory.MessageWindowChatMemory;
import org.springframework.ai.chat.model.ChatModel;
import org.springframework.ai.chat.model.ChatResponse;
import org.springframework.ai.tool.ToolCallback;
import org.springframework.ai.tool.ToolCallbackProvider;
import org.springframework.ai.vectorstore.VectorStore;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Flux;

import java.util.List;

@Component
@Slf4j
public class EmotionFixAiAgent {

    private final ChatClient chatClient;

    private static final String SYSTEM_PROMPT = """
            你是一位专业的情感修复顾问，名叫"心桥"。你的使命是帮助用户修复和维护重要的人际关系，包括夫妻关系、恋人关系、朋友关系等。
            
            【核心原则】
            1. 保持中立客观，不偏袒任何一方
            2. 深度倾听，先理解情绪再分析问题
            3. 提供建设性建议，而非直接替用户做决定
            4. 尊重所有当事人的感受和选择权
            5. 涉及暴力、违法或极端危险情况时，必须建议寻求专业机构帮助
            
            【回复风格】
            - 语气温和、耐心、真诚
            - 先表达理解和共情，再引导思考
            - 使用开放式问题帮助用户梳理思绪
            - 适当使用比喻帮助用户理解复杂情感
            - 每段回复控制在150-200字，便于用户消化
            
            【禁止行为】
            - 绝对不鼓励报复、冷战、语言暴力
            - 不替用户做重大决定（如是否离婚、分手）
            - 不承诺100%修复关系
            - 不给出非黑即白的简单判断
            - 不泄露任何用户隐私信息
            
            【典型回复结构】
            1. 情感认同："我能感受到你现在的[情绪]，这确实很不容易。"
            2. 问题澄清："你提到的这个情况，我想多了解一点..."
            3. 视角拓展："或许我们可以换个角度看..."
            4. 行动建议："如果你愿意，可以尝试..."
            5. 情感支持："无论结果如何，你都不是一个人在面对。
            """;

    /**
     * 初始化 ChatClient
     *
     * @param dashscopeChatModel
     */
    public EmotionFixAiAgent(
            ChatModel dashscopeChatModel,
            Advisor loveAppRagCloudAdvisor,
            ToolCallback[] allTools,
            ToolCallbackProvider toolCallbackProvider
            ) {
        // 初始化基于内存的对话记忆
        MessageWindowChatMemory chatMemory = MessageWindowChatMemory.builder()
                .chatMemoryRepository(new InMemoryChatMemoryRepository())
                .maxMessages(20)
                .build();
        chatClient = ChatClient.builder(dashscopeChatModel)
                // 自定义 系统提示词
                .defaultSystem(SYSTEM_PROMPT)
                // 系统拦截器（顾问）
                .defaultAdvisors(
                        MessageChatMemoryAdvisor.builder(chatMemory).build(),
                        // 自定义日志 Advisor，可按需开启
                        new MyLoggerAdvisor(),
                        // RAG 云知识库
                        loveAppRagCloudAdvisor
                )
                // 默认工具
                .defaultToolCallbacks(allTools)
                // 注册 MCP 服务
                .defaultToolCallbacks(toolCallbackProvider)
                .build();
    }

    /**
     * AI 基础对话（支持多轮对话记忆）
     *
     * @param userInput
     * @param chatId
     * @return
     */
    public String doChat(String userInput, String chatId) {
        ChatResponse chatResponse = chatClient
                .prompt()
                .user(userInput)
                .advisors(spec -> spec.param(ChatMemory.CONVERSATION_ID, chatId))
                .call()
                .chatResponse();
        String content = chatResponse.getResult().getOutput().getText();
        return content;
    }

    /**
     * AI 基础对话（支持多轮对话记忆，SSE 流式传输）
     *
     * @param userInput
     * @param chatId
     * @return
     */
    public Flux<String> doChatByStream(String userInput, String chatId) {
        return chatClient
                .prompt()
                .user(userInput)
                .advisors(spec -> spec.param(ChatMemory.CONVERSATION_ID, chatId))
                .stream()
                .content();
    }
}
