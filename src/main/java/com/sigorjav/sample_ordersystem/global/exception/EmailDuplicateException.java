package com.sigorjav.sample_ordersystem.global.exception;

import com.sigorjav.sample_ordersystem.global.enumerator.ErrorCode;
import lombok.Getter;


@Getter
public class EmailDuplicateException extends RuntimeException {
    private ErrorCode errorCode;

    public EmailDuplicateException(String message, ErrorCode errorCode){
        super(message);
        this.errorCode = errorCode;
    }
}
