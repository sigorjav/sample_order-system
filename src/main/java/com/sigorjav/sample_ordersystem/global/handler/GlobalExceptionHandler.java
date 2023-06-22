package com.sigorjav.sample_ordersystem.global.handler;

import com.sigorjav.sample_ordersystem.global.enumerator.ErrorCode;
import com.sigorjav.sample_ordersystem.global.exception.EmailDuplicateException;
import com.sigorjav.sample_ordersystem.global.response.ErrorResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@Slf4j
@RestControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(EmailDuplicateException.class)
    public ResponseEntity<ErrorResponse> handleEmailDuplicateException(EmailDuplicateException exception){
        log.error("handleEmailDuplicateException", exception);
        ErrorResponse response = new ErrorResponse(exception.getErrorCode());
        return new ResponseEntity<>(response, HttpStatus.valueOf(exception.getErrorCode().getStatus()));
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<ErrorResponse> handleException(Exception exception) {
        log.error("handleException", exception);
        ErrorResponse response = new ErrorResponse(ErrorCode.INTER_SERVER_ERROR);
        return new ResponseEntity<>(response, HttpStatus.INSUFFICIENT_STORAGE);
    }
}
