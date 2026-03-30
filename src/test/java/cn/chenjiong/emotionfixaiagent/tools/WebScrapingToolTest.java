package cn.chenjiong.emotionfixaiagent.tools;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WebScrapingToolTest {

    @Test
    void scrapeWebPage() {
        WebScrapingTool webScrapingTool = new WebScrapingTool();
        String result = webScrapingTool.scrapeWebPage("https://docs.spring.io/spring-ai/reference/index.html");
        System.out.println(result);
        Assertions.assertFalse(result.toLowerCase().contains("error"));
    }
}