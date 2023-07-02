package com.sigorjav.sample_ordersystem.order.controller;

import com.sigorjav.sample_ordersystem.global.exception.BaseException;
import com.sigorjav.sample_ordersystem.order.dto.OrderDetailDto;
import com.sigorjav.sample_ordersystem.order.dto.OrderDto;
import com.sigorjav.sample_ordersystem.order.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/orders")
@RequiredArgsConstructor
//@EscapedGlobalResponse()
public class OrderController {
    private final OrderService orderService;

    @GetMapping("/list")
    public Page<OrderDto.Response> getOrderList(Pageable pageable) {
        return orderService.getOrderList(pageable);
    }

    @GetMapping("/info/{orderId}/{productId}")
    public OrderDetailDto.Response getOrderInfo(
            @PathVariable(value = "orderId") Long orderId,
            @PathVariable(value = "productId") String productId) throws BaseException {
        return orderService.getOrderDetailInfo(orderId, productId);
    }
}
