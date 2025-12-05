package com.bqy.zhilian.util;

import com.bqy.zhilian.common.OPSException;
import com.bqy.zhilian.common.ResponseCode;

public class ThrowUtils {
    public static void throwIf(boolean condition, RuntimeException e) {
        if (condition) {
            throw e;
        }
    }

    public static void throwIf(boolean condition, ResponseCode responseCode) {
        throwIf(condition, new OPSException(responseCode));
    }

    public static void throwIf(boolean condition, ResponseCode responseCode, String message) {
        throwIf(condition, new OPSException(responseCode, message));
    }

    public static void throwIf(boolean condition, String message) {
        throwIf(condition, new RuntimeException(message));
    }
}
