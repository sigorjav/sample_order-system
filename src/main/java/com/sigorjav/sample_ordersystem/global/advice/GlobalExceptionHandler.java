package com.sigorjav.sample_ordersystem.global.advice;

import com.sigorjav.sample_ordersystem.global.exception.BaseException;
import com.sigorjav.sample_ordersystem.global.response.BaseResponse;
import com.sigorjav.sample_ordersystem.global.response.GlobalResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.annotation.Order;
import org.springframework.core.Ordered;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.UndeclaredThrowableException;

@Slf4j
@ControllerAdvice
@RequiredArgsConstructor
public class GlobalExceptionHandler {

    @Order(Ordered.LOWEST_PRECEDENCE)
    @ExceptionHandler(Exception.class)
    @ResponseBody
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    protected ResponseEntity<GlobalResponse<?>> handleException(Exception e){
        log.error(e.getMessage(), e);

        return errorWithWebHook(e);
    }

    private ResponseEntity<GlobalResponse<?>> errorWithWebHook(Exception e){
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        e.printStackTrace(pw);
        return ResponseEntity.internalServerError().build();
    }
}

