package com.sigorjav.sample_ordersystem.global.enumerator;

import com.sigorjav.sample_ordersystem.global.response.BaseResponse;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
@AllArgsConstructor
public enum GlobalResponseCode implements BaseResponse {
    OK(HttpStatus.OK, 0, "OK"),
    ORDER_NOT_FOUND(HttpStatus.INTERNAL_SERVER_ERROR,-1000,"Order Not Found"),
    ;


    private final HttpStatus httpStatus;
    private final int code;
    private final String message;

    @Override
    public HttpStatus getStatus() {
        return this.httpStatus;
    }

    @Override
    public int getCode() {
        return this.code;
    }

    @Override
    public String getMessage() {
        return this.message;
    }
}
