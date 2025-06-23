package com.shing.knospherebackend.demo.invoke;

import lombok.extern.slf4j.Slf4j;
import org.springframework.ai.chat.messages.UserMessage;
import org.springframework.ai.chat.model.ChatResponse;
import org.springframework.ai.chat.prompt.Prompt;
import org.springframework.ai.ollama.OllamaChatModel;
import org.springframework.boot.CommandLineRunner;
import reactor.core.publisher.Flux;

import java.util.List;

/**
 * ollaama 本地模型调用
 *
 * @author Shing
 * date 17/6/2025
 */
// 取消注释即可在 SpringBoot 项目启动时执行
//@Component
@Slf4j
public class OllamaAiInvoke implements CommandLineRunner {

    private final OllamaChatModel ollamaChatModel;

    public OllamaAiInvoke(OllamaChatModel ollamaChatModel) {
        this.ollamaChatModel = ollamaChatModel;
    }

    @Override
    public void run(String... args) {
        try {
            System.out.println("=".repeat(80));
            System.out.println("模型: deepseek-r1:8b");
            System.out.println("=".repeat(80));

            // 方法1：使用非流式API调用
            nonStreamingCall();
            
            // 方法2：使用流式API调用
            streamingCall();

        } catch (Exception e) {
            System.err.println("调用失败: " + e.getMessage());
            e.printStackTrace();
        }
    }

    private void nonStreamingCall() {
        try {
            System.out.println("\n非流式调用结果:");
            
            // 创建消息
            UserMessage userMessage = new UserMessage("你好，你是谁，能做什么？");
            
            // 调用模型
            ChatResponse response = ollamaChatModel.call((Prompt) List.of(userMessage));
            
            // 输出响应内容
            System.out.println(response.getResult().toString());
            System.out.println("=".repeat(80));
        } catch (Exception e) {
            System.err.println("非流式调用失败: " + e.getMessage());
            e.printStackTrace();
        }
    }

    private void streamingCall() {
        try {
            System.out.println("\n流式调用结果:");
            
            // 创建消息
            UserMessage userMessage = new UserMessage("解释一下量子计算的基本原理");
            
            // 使用响应式API进行流式调用
            Flux<ChatResponse> responseFlux = ollamaChatModel.stream((Prompt) List.of(userMessage));
            
            // 处理流式响应
            StringBuilder fullResponse = new StringBuilder();
            responseFlux.subscribe(
                    response -> {
                        String content = response.getResult().toString();
                        System.out.print(content);
                        fullResponse.append(content);
                    },
                    error -> {
                        System.err.println("流式调用错误: " + error.getMessage());
                        error.printStackTrace();
                    },
                    () -> {
                        System.out.println("\n流式响应完成");
                        System.out.println("=".repeat(80));
                    }
            );
            
            // 等待流式响应完成
            Thread.sleep(10000);
        } catch (Exception e) {
            System.err.println("流式调用失败: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
