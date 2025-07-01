package com.shing.knospherebackend.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Knife4jConfig {

    /**
     * 自定义OpenAPI配置
     * 包含项目基本信息、作者联系方式和许可证信息
     */
    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Knosphere 后端服务 API")  // 项目标题
                        .description("Knosphere 平台后端接口文档")  // 项目描述
                        .version("1.0.0")  // API版本
                        .contact(new Contact()
                                .name("Shing")  // 作者姓名
                                .url("https://github.com/Shingbb"))  // 作者网址
                        .license(new License()
                                .name("Apache 2.0")  // 许可证名称
                                .url("https://www.apache.org/licenses/LICENSE-2.0")));  // 许可证URL
    }
}