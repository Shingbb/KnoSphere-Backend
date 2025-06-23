package com.shing.knospherebackend.demo.invoke;

import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.ai.chat.messages.AssistantMessage;
import org.springframework.ai.chat.model.ChatModel;
import org.springframework.ai.chat.prompt.Prompt;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * Spring AI 框架调用 AI 大模型（阿里）
 *
 * @author Shing
 * date 6/6/2025
 */
@Slf4j
// 取消注释即可在 SpringBoot 项目启动时执行
@Component
public class SpringAiAiInvoke  implements CommandLineRunner {

    @Resource
    @Qualifier("dashscopeChatModel")
    private ChatModel dashscopeChatModel;

    @Override
    public void run(String... args) throws Exception {
        AssistantMessage assistantMessage = dashscopeChatModel.call(new Prompt("你好，你是谁,能干些什么"))
                .getResult()
                .getOutput();
        log.info(assistantMessage.getText());

    }
}
