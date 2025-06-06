package com.shing.knospherebackend.common;


import com.shing.knospherebackend.exception.ErrorCode;
import lombok.Data;

import java.io.Serializable;

/**
 * 通用返回类
 *
 * @param <T>
 * @author shing
 */
@Data
public class BaseResponse<T> implements Serializable {

    private int code;

    // 标记为 transient 以避免序列化
    private transient T data;

    private String message;

    public BaseResponse(int code, T data, String message) {
        this.code = code;
        this.data = data;
        this.message = message;
    }

    public BaseResponse(int code, T data) {
        this(code, data, "");
    }

    public BaseResponse(ErrorCode errorCode) {
        this(errorCode.getCode(), null, errorCode.getMessage());
    }
}
