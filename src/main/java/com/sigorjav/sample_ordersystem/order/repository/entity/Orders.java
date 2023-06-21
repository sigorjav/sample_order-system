package com.sigorjav.sample_ordersystem.order.repository.entity;

import com.sigorjav.sample_ordersystem.order.enumerator.OrderEnum;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Builder
@Entity
@Table(name = "orders")
@AllArgsConstructor
@RequiredArgsConstructor
public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "order_number")
    private Long orderNumber;

    @Column(name = "status")
    @Enumerated(EnumType.STRING)
    private OrderEnum status;

    @Column(name = "comments")
    private String comments;

    @NotNull
    @Column(name = "order_date")
    private LocalDateTime orderDate;

    @NotNull
    @Column(name = "required_date")
    private LocalDateTime requiredDate;

    @Column(name = "shipped_date")
    private LocalDateTime shipped_date;

}
