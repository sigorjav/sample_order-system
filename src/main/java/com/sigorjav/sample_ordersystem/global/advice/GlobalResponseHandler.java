package com.sigorjav.sample_ordersystem.global.advice;

import com.sigorjav.sample_ordersystem.global.annotation.EscapedGlobalResponse;
import com.sigorjav.sample_ordersystem.global.enumerator.GlobalResponseCode;
import com.sigorjav.sample_ordersystem.global.response.GlobalResponse;
import org.springframework.core.MethodParameter;
import org.springframework.core.annotation.AnnotatedElementUtils;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;

@RestControllerAdvice
public class GlobalResponseHandler implements ResponseBodyAdvice<Object> {
    @Override
    public boolean supports(MethodParameter returnType, Class<? extends HttpMessageConverter<?>> converterType) {
        return !AnnotatedElementUtils.hasAnnotation(returnType.getDeclaringClass(), EscapedGlobalResponse.class);
    }

    @Override
    public Object beforeBodyWrite(Object body, MethodParameter returnType, MediaType selectedContentType, Class<? extends HttpMessageConverter<?>> selectedConverterType, ServerHttpRequest request, ServerHttpResponse response) {
        if(body instanceof GlobalResponse<?>){
            return body;
        }
        String path = request.getURI().getPath();
        if(path.startsWith("/api")){
            return GlobalResponseCode.OK.createGlobalResponse(body);
        } else {
            return body;
        }
    }
}
