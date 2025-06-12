package com.shing.knospherebackend.demo.invoke;

import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.jetbrains.annotations.NotNull;
import org.springframework.ai.chat.messages.AssistantMessage;
import org.springframework.ai.chat.model.ChatModel;
import org.springframework.ai.chat.prompt.Prompt;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

/**
 * Spring AI 框架调用 AI 大模型（阿里）
 *
 * @author Shing
 * date 6/6/2025
 */
@Slf4j
@Component
public class SpringAiAiInvoke  implements ApplicationListener<ContextRefreshedEvent> {

    @Resource
    private ChatModel dashscopeChatModel;

    @Override
    public void onApplicationEvent(@NotNull ContextRefreshedEvent event) {
        AssistantMessage assistantMessage = dashscopeChatModel.call(new Prompt("你好"))
                .getResult()
                .getOutput();
        log.info(assistantMessage.getText());
    }
}
