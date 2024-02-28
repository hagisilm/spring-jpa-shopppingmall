package com.nhnacademy.jpashoppingmall.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@NoArgsConstructor
@Table(name = "Customers")
@Getter
@Setter
public class Customer {
    @Id
    @Column(name = "CustomerID")
    private int customerId;
    @Column(name = "Name")
    private String name;
    @Column(name = "EmailAddress")
    private String emailAddress;
    @Column(name = "Password")
    private String password;
}
