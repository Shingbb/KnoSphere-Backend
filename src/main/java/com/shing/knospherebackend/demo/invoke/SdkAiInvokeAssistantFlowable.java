package com.shing.knospherebackend.demo.invoke;

import com.alibaba.dashscope.aigc.generation.Generation;
import com.alibaba.dashscope.aigc.generation.GenerationParam;
import com.alibaba.dashscope.aigc.generation.GenerationResult;
import com.alibaba.dashscope.common.Message;
import com.alibaba.dashscope.common.Role;
import com.alibaba.dashscope.exception.ApiException;
import com.alibaba.dashscope.exception.InputRequiredException;
import com.alibaba.dashscope.exception.NoApiKeyException;
import com.alibaba.dashscope.utils.JsonUtils;
import io.reactivex.Flowable;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

/**
 * 阿里云灵积 AI SDK 流式调用(添加助手)
 *
 * @author Shing
 * date 6/6/2025
 */
@Slf4j
public class SdkAiInvokeAssistantFlowable {
    /**
     * 处理生成结果的方法
     * 将生成结果对象序列化为JSON字符串并打印到控制台
     *
     * @param message 生成结果对象
     */
    private static void handleGenerationResult(GenerationResult message) {
        log.info(JsonUtils.toJson(message));
    }

    /**
     * 使用流式调用方式进行生成任务的调用
     * 此方法构建生成参数，并调用AI模型进行生成，处理结果
     *
     * @param gen     生成对象，用于调用AI模型
     * @param userMsg 用户消息对象，包含用户的问题或请求
     * @throws NoApiKeyException      如果未提供API Key则抛出此异常
     * @throws ApiException           如果API调用失败则抛出此异常
     * @throws InputRequiredException 如果输入参数不符合要求则抛出此异常
     */
    public static void streamCallWithMessage(Generation gen, Message systemMsg, Message userMsg)
            throws NoApiKeyException, ApiException, InputRequiredException {
        GenerationParam param = buildGenerationParam(systemMsg,userMsg);
        Flowable<GenerationResult> result = gen.streamCall(param);
        result.blockingForEach(SdkAiInvokeAssistantFlowable::handleGenerationResult);
    }

    /**
     * 构建生成参数的方法
     * 根据用户消息构建生成参数对象，包括API Key、模型名称等
     *
     * @param systemMsg 系统消息，定义 AI 的角色和上下文
     * @param userMsg   用户消息，包含用户的问题或请求
     * @return 生成参数对象
     */
    private static GenerationParam buildGenerationParam(Message systemMsg, Message userMsg) {
        return GenerationParam.builder()
                // 若没有配置环境变量，请用百炼API Key将下行替换为：.apiKey("sk-xxx")
                .apiKey(TestApiKey.API_KEY)
                // 此处以qwen-plus为例，可按需更换模型名称。模型列表：https://help.aliyun.com/zh/model-studio/getting-started/models
                .model("qwen-plus")
                .messages(List.of(systemMsg, userMsg))
                .resultFormat(GenerationParam.ResultFormat.MESSAGE)
                .incrementalOutput(true)
                .build();
    }

    /**
     * 程序入口
     * 创建生成对象和用户消息，并调用流式调用方法
     *
     * @param args 命令行参数
     */
    public static void main(String[] args) {
        // 1. 创建系统消息（设定 AI 角色）
        Message systemMsg = Message.builder()
                .role(Role.SYSTEM.getValue())
                .content("你是一位专业的 AI 助手，用简洁专业的方式回答问题")
                .build();
        // 2. 创建用户消息
        Message userMsg = Message.builder()
                .role(Role.USER.getValue())
                .content("你是谁,你能干什么？")
                .build();
        try {
            // 3. 创建生成器实例
            Generation gen = new Generation();
            // 4. 调用流式接口
            streamCallWithMessage(gen, systemMsg,userMsg);
        } catch (ApiException | NoApiKeyException | InputRequiredException e) {
            log.error("An exception occurred: {}", e.getMessage());
        }
        System.exit(0);
    }

}
