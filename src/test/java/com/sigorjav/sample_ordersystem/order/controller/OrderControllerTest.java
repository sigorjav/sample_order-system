package com.sigorjav.sample_ordersystem.order.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.junit.jupiter.api.Assertions.*;

@WebMvcTest
class OrderControllerTest {

    @Autowired
    MockMvc mockMvc;

    @Test
    void getOrderList()  {
    }
}