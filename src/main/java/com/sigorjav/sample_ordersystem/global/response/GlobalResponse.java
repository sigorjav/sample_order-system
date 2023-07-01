package com.sigorjav.sample_ordersystem.global.response;

import jakarta.annotation.Nullable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class GlobalResponse <T>{
    private int code;
    private String message;
    @Nullable
    private T data;
}
