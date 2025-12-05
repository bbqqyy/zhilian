package com.bqy.zhilian.common;

import lombok.Getter;

@Getter
public enum ResponseCode {
    SUCCESS(200, "success"),
    FAILED(0, "FAILED");
    private final String message;
    private final int code;

    ResponseCode(int code, String message) {
        this.message = message;
        this.code = code;
    }


}
