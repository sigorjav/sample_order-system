package com.sigorjav.sample_ordersystem.order.mapper;

import com.sigorjav.sample_ordersystem.order.dto.OrderDto;
import com.sigorjav.sample_ordersystem.order.repository.entity.Orders;
import org.springframework.stereotype.Component;

@Component
public class OrderMapper {
    public static OrderDto.Response toOrderResponseDto(Orders orders){
        return OrderDto.Response.builder()
                .id(orders.getOrderNumber())
                .status(orders.getStatus())
                .orderDate(orders.getOrderDate())
                .requiredDate(orders.getRequiredDate())
                .shippedDate(orders.getShippedDate())
                .build();
    }
}
