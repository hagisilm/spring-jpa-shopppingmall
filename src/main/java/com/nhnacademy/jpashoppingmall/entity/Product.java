package com.nhnacademy.jpashoppingmall.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@NoArgsConstructor
@Table(name = "Products")
@Getter
@Setter
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ProductID")
    private int productId;
    @ManyToOne
    @JoinColumn(name = "CategoryID")
    private Category category;
    @Column(name = "ModelNumber")
    private String modelNumber;
    @Column(name = "ModelName")
    private String modelName;
    @Column(name = "ProductImage")
    private String productImage;
    @Column(name = "UnitCost")
    private BigDecimal unitCost;
    @Column(name = "Description")
    private String description;
}
