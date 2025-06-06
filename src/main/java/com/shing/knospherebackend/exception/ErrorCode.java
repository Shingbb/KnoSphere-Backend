package com.shing.knospherebackend.exception;

import lombok.Getter;

/**
 * 自定义错误码
 *
 * @author shing
 */
@Getter
public enum ErrorCode {

    /**
     * 操作成功
     */
    SUCCESS(0, "操作成功"),

    /**
     * 请求参数错误
     */
    PARAMS_ERROR(40000, "请求参数错误"),

    /**
     * 用户未登录
     */
    NOT_LOGIN_ERROR(40100, "用户未登录"),

    /**
     * 无权限访问
     */
    NO_AUTH_ERROR(40101, "无权限访问"),

    /**
     * 请求的数据不存在
     */
    NOT_FOUND_ERROR(40400, "请求数据不存在"),

    /**
     * 禁止访问
     */
    FORBIDDEN_ERROR(40300, "禁止访问"),

    /**
     * 系统内部异常
     */
    SYSTEM_ERROR(50000, "系统内部异常"),

    /**
     * 操作失败
     */
    OPERATION_ERROR(50001, "操作失败");

    /**
     * 错误码
     * 错误码范围：0 - 成功，4XXXX - 客户端错误，5XXXX - 服务器错误
     */
    private final int code;

    /**
     * 错误信息
     * 说明了错误的详细信息，帮助用户或者开发者理解具体的错误原因。
     */
    private final String message;

    /**
     * 构造函数，初始化错误码和错误信息
     *
     * @param code    错误码
     * @param message 错误信息
     */
    ErrorCode(int code, String message) {
        this.code = code;
        this.message = message;
    }

}
