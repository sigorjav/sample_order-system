package com.sigorjav.sample_ordersystem.order.controller;

import com.sigorjav.sample_ordersystem.global.annotation.EscapedGlobalResponse;
import com.sigorjav.sample_ordersystem.order.dto.OrderDto;
import com.sigorjav.sample_ordersystem.order.repository.entity.Orders;
import com.sigorjav.sample_ordersystem.order.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/orders")
@RequiredArgsConstructor
//@EscapedGlobalResponse()
public class OrderController {
    private final OrderService orderService;
    @GetMapping("/list")
    public Page<OrderDto.Response> getOrderList(Pageable pageable){
        return orderService.getOrderList(pageable);
    }
}
