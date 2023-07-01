package com.sigorjav.sample_ordersystem.global.exception;

import com.sigorjav.sample_ordersystem.global.enumerator.GlobalResponseCode;
import com.sigorjav.sample_ordersystem.global.response.BaseResponse;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

public class BaseException extends Exception {
    public BaseResponse baseResponse;

    public BaseException(){
        super();
    }

    public BaseException(BaseResponse baseResponse){
        super(baseResponse.getMessage());
        this.baseResponse = baseResponse;
    }

    public BaseException(BaseResponse baseResponse, Exception e){
        super(e);
        this.baseResponse = baseResponse;
    }

    public BaseException(String message) {
        super(message);
    }

    public BaseException(String message, Exception e) {
        super(message,e);
    }
}
