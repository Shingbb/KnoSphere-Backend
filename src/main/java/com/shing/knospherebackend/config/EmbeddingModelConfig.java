package com.shing.knospherebackend.config;

import com.alibaba.cloud.ai.dashscope.embedding.DashScopeEmbeddingModel;
import org.springframework.ai.embedding.EmbeddingModel;
import org.springframework.ai.ollama.OllamaEmbeddingModel;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

/**
 * @author Shing
 * date 17/6/2025
 */
@Configuration
public class EmbeddingModelConfig {

     // 使用 DashScope 作为主用模型
    @Bean
    @Primary
    public EmbeddingModel primaryEmbeddingModel(DashScopeEmbeddingModel dashscope) {
        return dashscope;
    }

//     // 或者使用 Ollama 作为主用模型
//     @Bean
//     @Primary
//     public EmbeddingModel primaryEmbeddingModel(OllamaEmbeddingModel ollama) {
//        return ollama;
//     }
}
