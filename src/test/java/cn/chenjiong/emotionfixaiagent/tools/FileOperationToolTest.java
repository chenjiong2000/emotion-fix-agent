package cn.chenjiong.emotionfixaiagent.tools;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class FileOperationToolTest {


    @Test
    void testReadFile() {
        FileOperationTool fileOperationTool = new FileOperationTool();
        String result = fileOperationTool.readFile("粤语学习宝典.md");
        System.out.println(result);
        Assertions.assertEquals("九声六调", result);
    }

    @Test
    void testWriteFile() {
        FileOperationTool fileOperationTool = new FileOperationTool();
        String result = fileOperationTool.writeFile("粤语学习宝典.md", "九声六调");
        System.out.println(result);
        Assertions.assertFalse(result.toLowerCase().contains("error"));
    }
}