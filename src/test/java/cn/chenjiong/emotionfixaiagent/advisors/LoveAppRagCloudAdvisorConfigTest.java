package cn.chenjiong.emotionfixaiagent.advisors;

import jakarta.annotation.Resource;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.chat.client.advisor.api.Advisor;
import org.springframework.ai.chat.model.ChatModel;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class LoveAppRagCloudAdvisorConfigTest {

    @Resource
    ChatModel dashscopeChatModel;

    @Resource
    Advisor loveAppRagCloudAdvisor;

    @Test
    void loveAppRagCloudAdvisor() {
        ChatClient chatClient = ChatClient.builder(dashscopeChatModel).build();
        String result = chatClient
                .prompt()
                .user("你好，我是陈囧，我背叛了我的朋友，该怎么进行情感修复？")
                .advisors(loveAppRagCloudAdvisor)
                .call()
                .content();
        System.out.println(result);
        Assertions.assertNotNull(result);
    }
}