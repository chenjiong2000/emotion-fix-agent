package cn.chenjiong.emotionfixaiagent.controller;

import cn.chenjiong.emotionfixaiagent.agent.EmotionFixAiAgent;
import cn.chenjiong.emotionfixaiagent.common.BaseResponse;
import cn.chenjiong.emotionfixaiagent.common.ResultUtils;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/ai/chat")
public class ChatController {

    EmotionFixAiAgent emotionFixAiAgent;

    public ChatController(EmotionFixAiAgent emotionFixAiAgent) {
        this.emotionFixAiAgent = emotionFixAiAgent;
    }

    @PostMapping("/emotion-fix-agent/")
    public BaseResponse<String> chatWithEmotionFixAgent(String userInput, String chatId) {
        String result = emotionFixAiAgent.doChat(userInput, chatId);
        return ResultUtils.success(result);
    }

    @PostMapping(value = "/emotion-fix-agent/sse", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public Flux<String> chatWithEmotionFixAgentSSE(String userInput, String chatId) {
        return emotionFixAiAgent.doChatByStream(userInput, chatId);
    }
}
