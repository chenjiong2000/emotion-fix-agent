package cn.chenjiong.emotionfixaiagent.tools;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PDFGenerationToolTest {

    @Test
    void generatePDF() {
        PDFGenerationTool pdfGenerationTool = new PDFGenerationTool();
        String result = pdfGenerationTool.generatePDF("粤语学习宝典.pdf", "九声六调");
        assertFalse(result.toLowerCase().contains("error"));
    }
}