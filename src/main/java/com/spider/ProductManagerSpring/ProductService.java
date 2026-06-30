package com.spider.ProductManagerSpring;

import java.util.ArrayList;
import java.util.List;

public class ProductService{

    public void show(){
        System.out.println("in show");
    }

//    public void addProduct(Product p){
//        db.save(p);
//    }
//
    public List<Product> getAllProducts() {
        return db.getAll();
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
