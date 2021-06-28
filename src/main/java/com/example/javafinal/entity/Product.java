package com.example.javafinal.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@Getter
@Setter
public class Product {
    @Id
    private int Id;
    private String name;
    private String description;
    private Long DateOfManf;
    private double price;

    @OneToMany(mappedBy = "product", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<Sale> sales;

    public void setSales(Set<Sale> sales) {
        this.sales = sales;

        for (Sale c : sales) {
            c.setProduct(this);
        }
    }

    public Product() {
    }

    public Product(String name, String description, Long dateOfManf, double price) {
        this.name = name;
        this.description = description;
        DateOfManf = dateOfManf;
        this.price = price;
    }
}
