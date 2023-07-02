package com.sigorjav.sample_ordersystem.product.repository.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "product_lines")
public class ProductLines {
    @Id
    @Column(name = "product_line")
    private String productLine;
}
