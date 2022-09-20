package com.genspark.shoppingapp.model.product;

import com.genspark.shoppingapp.model.user.User;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Product {
    @Id
    private Long id;
    private String name;
    private double price;

    @ManyToOne
    private User user;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object otherProduct) {
        if(this == otherProduct) {
            return true;
        }
        if(otherProduct == null) {
            return false;
        }
        Product p = (Product) otherProduct;
        if(getId() == p.getId()) {
            return true;
        }
        return false;
    }
}
