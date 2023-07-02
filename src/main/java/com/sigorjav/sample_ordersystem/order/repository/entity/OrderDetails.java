package com.sigorjav.sample_ordersystem.order.repository.entity;

import com.sigorjav.sample_ordersystem.product.repository.entity.Products;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@Builder
@Entity
@Table(name = "order_details")
@AllArgsConstructor
@RequiredArgsConstructor
@IdClass(OrderDetailId.class)
public class OrderDetails {

    @Id
    private Long orderNumber;

    @Id
    private String productCode;

    @ManyToOne
    @JoinColumn(name = "order_number")
    private Orders orders;

    @ManyToOne
    @JoinColumn(name = "product_code")
    private Products products;

    @Column(name = "quantity_ordered")
    private Integer quantityOrdered;

    @Column(name = "price_each")
    private Double priceEach;

    @Column(name = "order_line_number")
    private Integer orderLineNumber;

}
