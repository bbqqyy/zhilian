package com.bqy.zhilian.common;

import io.swagger.v3.oas.annotations.Hidden;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@Hidden
@RestControllerAdvice
@Slf4j
public class GlobalExceptionHandler {
    @ExceptionHandler(exception = OPSException.class)
    public ApiResponse<?> handleOPSException(OPSException e) {
        log.error(e.getMessage());
        return ApiResponse.success();
    }

    @ExceptionHandler(exception = RuntimeException.class)
    public ApiResponse<?> handleRuntimeException(RuntimeException e) {
        log.error(e.getMessage());
        return ApiResponse.fail();
    }
}
