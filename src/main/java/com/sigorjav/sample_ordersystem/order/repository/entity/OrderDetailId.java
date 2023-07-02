package com.sigorjav.sample_ordersystem.order.repository.entity;

import jakarta.persistence.Column;
import jakarta.persistence.IdClass;
import lombok.*;

import java.io.Serializable;

@Data
@Builder
@EqualsAndHashCode
@IdClass(OrderDetails.class)
@NoArgsConstructor
@AllArgsConstructor
public class OrderDetailId implements Serializable {
    @Column(name = "order_number")
    private Long orderNumber;

    @Column(name = "product_code")
    private String productCode;
}
