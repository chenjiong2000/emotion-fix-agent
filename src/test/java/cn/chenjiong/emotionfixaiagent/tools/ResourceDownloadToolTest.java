package cn.chenjiong.emotionfixaiagent.tools;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ResourceDownloadToolTest {

    @Test
    void downloadResource() {
        ResourceDownloadTool resourceDownloadTool = new ResourceDownloadTool();
        String result = resourceDownloadTool.downloadResource(
                "https://springdoc.springframework.org.cn/#Introduction",
                "springdoc-openapi-intro.md"
        );
        assertFalse(result.toLowerCase().contains("error"));
    }
}