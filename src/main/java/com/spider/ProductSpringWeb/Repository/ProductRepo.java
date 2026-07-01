package com.spider.ProductSpringWeb.Repository;

import com.spider.ProductSpringWeb.Entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepo extends JpaRepository<Product, Integer> {

}
