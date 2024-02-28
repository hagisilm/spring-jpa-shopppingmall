package com.nhnacademy.jpashoppingmall.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@Table(name = "product_category")
@Getter
@Setter
public class Reviews {
    @Id
    @Column(name = "ReviewID")
    private int reviewId;
    @ManyToOne
    @JoinColumn(name = "ProductID")
    private Product product;
    @ManyToOne
    @JoinColumn(name = "CustomerID")
    private Customer customer;
    @Column(name = "Rating")
    private int rating;
    @Column(name = "Comments")
    private String comments;
}
