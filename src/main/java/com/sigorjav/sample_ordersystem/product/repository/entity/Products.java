package com.sigorjav.sample_ordersystem.product.repository.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@Builder
@Entity
@Table(name = "products")
@AllArgsConstructor
@RequiredArgsConstructor
public class Products {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "product_code")
    private String productCode;

    @Column(name = "product_name")
    private String productName;

    @ManyToOne
    @JoinColumn(name = "product_line")
    private ProductLines productLine;

    @Column(name = "product_scale")
    private String productScale;
    @Column(name = "product_vendor")
    private String productVendor;
    @Column(name = "product_description")
    private String productDescription;

    @Column(name = "quantity_in_stock")
    private Integer quantityInStock;
    @Column(name = "buy_price")
    private Double buyPrice;
    @Column(name = "MSRP")
    private Double MSRP;


}
