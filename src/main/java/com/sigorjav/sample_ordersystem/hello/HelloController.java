package com.sigorjav.sample_ordersystem.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/error")
    public void test(){
        throw new IllegalArgumentException("Hello");
    }
}
