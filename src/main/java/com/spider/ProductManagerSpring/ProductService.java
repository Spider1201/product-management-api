package com.spider.ProductManagerSpring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ProductService{

    @Autowired
    ProductRepo db;

    public List<Product> getAllProducts() {
        return db.findAll();
    }

//    public Product getProduct(String name) {
//        for(Product p : products){
//            if(p.getName().equals(name)){
//                return p;
//            }
//
//        }
//        return null;
//    }
}
