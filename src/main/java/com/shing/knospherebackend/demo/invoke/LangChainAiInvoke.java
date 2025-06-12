package com.shing.knospherebackend.demo.invoke;

import dev.langchain4j.model.chat.ChatLanguageModel;
import dev.langchain4j.community.model.dashscope.QwenChatModel;
import lombok.extern.slf4j.Slf4j;

/**
 * LangChain4j  调用
 * @author Shing
 * date 12/6/2025
 */
@Slf4j
public class LangChainAiInvoke {

    public static void main(String[] args) {
        ChatLanguageModel qwenModel = QwenChatModel.builder()
                .apiKey(TestApiKey.API_KEY)
                .modelName("qwen-max")
                .build();
        String answer = qwenModel.chat("我是一个程序员alex, 请帮我写解决bug");
        log.info(answer);

    }
}
