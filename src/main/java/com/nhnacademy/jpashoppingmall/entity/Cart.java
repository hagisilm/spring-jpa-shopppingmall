package com.nhnacademy.jpashoppingmall.entity;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@NoArgsConstructor
@Table(name = "ShoppingCart")
@Getter
@Setter
public class Cart {
    @Id
    @Column(name = "RecordID")
    private int recordId;

    @Column(name = "CartID")
    private String cartId;

    @Column(name = "Quantity")
    private int quantity;

    @ManyToOne
    @JoinColumn(name = "ProductID")
    private Product product;

    @Column(name = "DateCreated")
    private LocalDateTime dateCreated;

}
