package com.shing.knospherebackend.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Tag(name = "健康检查", description = "系统健康状态检查接口")
@RestController
@RequestMapping("/health")
public class HealthController {

    @Operation(summary = "健康状态检查", description = "返回系统运行状态")
    @GetMapping
    public String healthCheck() {
        return "ok";
    }
}
