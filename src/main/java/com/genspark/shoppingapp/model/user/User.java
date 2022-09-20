package com.genspark.shoppingapp.model.user;

import com.genspark.shoppingapp.model.product.Product;
import javax.persistence.*;
import java.util.List;

@Entity
public class User {
    @Id
    private Long id;
    private String username;

    @OneToMany(mappedBy = "user")
    private List<Product> products;

    public Long getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}
