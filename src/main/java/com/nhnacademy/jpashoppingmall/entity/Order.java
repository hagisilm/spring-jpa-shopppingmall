package com.nhnacademy.jpashoppingmall.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@NoArgsConstructor
@Table(name = "Orders")
@Getter
@Setter
public class Order {
    @Id
    @Column(name = "OrderID")
    private int orderId;
    @ManyToOne
    @JoinColumn(name = "CustomerID")
    private Customer customer;
    @Column(name = "OrderDate")
    private LocalDateTime orderDate;
    @Column(name = "ShipDate")
    private LocalDateTime shipDate;
}
