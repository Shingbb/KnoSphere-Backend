package com.shing.knospherebackend.config;

import com.alibaba.cloud.ai.dashscope.chat.DashScopeChatModel;
import com.alibaba.cloud.ai.dashscope.embedding.DashScopeEmbeddingModel;
import org.springframework.ai.chat.model.ChatModel;
import org.springframework.ai.embedding.EmbeddingModel;
import org.springframework.ai.ollama.OllamaChatModel;
import org.springframework.ai.ollama.OllamaEmbeddingModel;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;


/**
 * 模型配置
 */
@Configuration
public class AiModelConfig {

    // DashScope模型配置
    @Bean(name = "dashScopeEmbedding")
    @Primary
    public EmbeddingModel dashScopeEmbeddingModel(DashScopeEmbeddingModel dashscope) {
        return dashscope;
    }
    
    @Bean(name = "dashScopeChat")
    public ChatModel dashscopeChatModel(DashScopeChatModel dashScopeChatModel) {
        return dashScopeChatModel;
    }
    
    // Ollama模型配置
    @Bean(name = "ollamaEmbedding")
    public EmbeddingModel ollamaEmbeddingModel(OllamaEmbeddingModel ollama) {
        return ollama;
    }
    
    @Bean(name = "ollamaChat")
    public ChatModel ollamaChatModel(OllamaChatModel ollamaChatModel) {
        return ollamaChatModel;
    }
}
