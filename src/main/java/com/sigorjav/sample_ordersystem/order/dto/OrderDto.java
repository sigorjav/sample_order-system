package com.sigorjav.sample_ordersystem.order.dto;

import com.sigorjav.sample_ordersystem.order.enumerator.OrderStatus;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@AllArgsConstructor
public class OrderDto {

    @Getter
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Res {
        private Long id;
        private OrderStatus status;
        private LocalDateTime orderDate;
        private LocalDateTime requiredDate;
        private LocalDateTime shippedDate;
        private String comments;
    }
}
