package com.bqy.zhilian.common;

import lombok.Getter;

@Getter
public class OPSException extends RuntimeException {
    private final int code;

    public OPSException(int code, String message) {
        super(message);
        this.code = code;
    }

    public OPSException(ResponseCode responseCode) {
        super(responseCode.getMessage());
        this.code = responseCode.getCode();
    }

    public OPSException(ResponseCode responseCode, String message) {
        super(message);
        this.code = responseCode.getCode();
    }
}
