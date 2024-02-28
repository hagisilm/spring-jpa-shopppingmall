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
@Table(name = "Categories")
@Getter
@Setter
public class Category {
    @Id
    @Column(name = "CategoryID")
    private int categoryId;
    @Column(name = "CategoryName")
    private String categoryName;
}
