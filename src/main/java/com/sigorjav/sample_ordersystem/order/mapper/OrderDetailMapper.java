package com.sigorjav.sample_ordersystem.order.mapper;

import com.sigorjav.sample_ordersystem.order.dto.OrderDetailDto;
import com.sigorjav.sample_ordersystem.order.dto.OrderDto;
import com.sigorjav.sample_ordersystem.order.repository.entity.OrderDetails;
import com.sigorjav.sample_ordersystem.order.repository.entity.Orders;
import com.sigorjav.sample_ordersystem.product.repository.entity.Products;
import org.springframework.stereotype.Component;

@Component
public class OrderDetailMapper {
    public static OrderDetailDto.Response toOrderDetailResponseDto(OrderDetails orderDetails, Orders orders, Products products){
        return OrderDetailDto.Response.builder()
                .id(orderDetails.getOrderNumber())
                .status(orders.getStatus())
                .orderDate(orders.getOrderDate())
                .requiredDate(orders.getRequiredDate())
                .shippedDate(orders.getShippedDate())
                .productCode(products.getProductCode())
                .productName(products.getProductName())
                .productVendor(products.getProductVendor())
                .price(orderDetails.getPriceEach() * orderDetails.getQuantityOrdered())
                .build();
    }
}
