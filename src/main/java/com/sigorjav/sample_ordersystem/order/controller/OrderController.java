package com.sigorjav.sample_ordersystem.order.controller;

import com.sigorjav.sample_ordersystem.order.repository.entity.Orders;
import com.sigorjav.sample_ordersystem.order.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/orders")
@RequiredArgsConstructor
public class OrderController {
    private final OrderService orderService;
    @GetMapping("/list")
    public List<Orders> getOrderList(){
        return orderService.getOrderList();
    }
}
