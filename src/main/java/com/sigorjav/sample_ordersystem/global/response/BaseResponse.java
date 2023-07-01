package com.sigorjav.sample_ordersystem.global.response;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public interface BaseResponse {
    HttpStatus getStatus();
    int getCode();
    String getMessage();

    default GlobalResponse<?> createGlobalResponse(){
        return new GlobalResponse<>(this.getCode(), this.getMessage(),null);
    }

    default <T> GlobalResponse<T> createGlobalResponse(T data){
        return new GlobalResponse<T>(this.getCode(),this.getMessage(),data);
    }

    default ResponseEntity<GlobalResponse<?>> createGlobalEntity(){
        GlobalResponse<?> globalResponse = new GlobalResponse<>();
        HttpHeaders headers = new HttpHeaders();
        headers.add("Content-Type","application/json");
        return new ResponseEntity<>(globalResponse, headers, HttpStatus.OK);
    }

}
