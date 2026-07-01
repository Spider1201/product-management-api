package com.spider.ProductSpringWeb.Service;

import com.spider.ProductSpringWeb.Entity.Product;
import com.spider.ProductSpringWeb.Repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ProductService {

    @Autowired
    ProductRepo db;

    public List<Product> getAllProducts() {
        return db.findAll();
    }

    public Product getProduct(String name) {
        return db.findByName(name);
    }

    public void addProduct(Product p) {
        db.save(p);
    }
}
