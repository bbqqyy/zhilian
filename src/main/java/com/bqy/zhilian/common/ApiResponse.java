package com.bqy.zhilian.common;

import lombok.Data;

@Data
public class ApiResponse<T> {
    private int code;
    private T data;
    private String message;

    public ApiResponse(int code, T data, String message) {
        this.code = code;
        this.data = data;
        this.message = message;
    }

    public ApiResponse(int code, T data) {
        this(code, data, "");
    }

    public ApiResponse(ResponseCode responseCode) {
        this(responseCode.getCode(), null, responseCode.getMessage());
    }

    public static <T> ApiResponse<T> success() {
        return new ApiResponse<>(ResponseCode.SUCCESS);
    }

    public static <T> ApiResponse<T> success(T data) {
        return new ApiResponse<>(ResponseCode.SUCCESS.getCode(), data);
    }

    public static <T> ApiResponse<T> fail() {
        return new ApiResponse<>(ResponseCode.FAILED);
    }
}
