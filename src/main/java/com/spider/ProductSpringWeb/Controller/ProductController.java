package com.spider.ProductSpringWeb.Controller;

import com.spider.ProductSpringWeb.Entity.Product;
import com.spider.ProductSpringWeb.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    ProductService service;

    @GetMapping("product")
    public List<Product> getAllProducts(){
        return service.getAllProducts();
    }
}
