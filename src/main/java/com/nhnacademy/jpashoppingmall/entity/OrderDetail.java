package com.nhnacademy.jpashoppingmall.entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;

@Entity
@NoArgsConstructor
@Table(name = "OrderDetails")
@Getter
@Setter
@IdClass(OrderDetail.Pk.class)
public class OrderDetail {

    @Id
    @ManyToOne
    @JoinColumn(name = "OrderID", referencedColumnName = "OrderID")
    private Order order;

    @Id
    @ManyToOne
    @JoinColumn(name = "ProductID",referencedColumnName = "ProductID")
    private Product product;

    @Column(name = "Quantity")
    private int quantity;

    @Column(name = "UnitCost")
    private BigDecimal unitCost;
    @NoArgsConstructor
    @AllArgsConstructor
    @EqualsAndHashCode
    @Getter
    @Setter
    public static class Pk implements Serializable {
        private Order order;
        private Product product;
    }
}
