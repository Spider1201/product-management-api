package com.spider.ProductManagerSpring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class ProductManagerSpringApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(ProductManagerSpringApplication.class, args);

		ProductService service = context.getBean(ProductService.class);
//		service.show();


//		List<Product> products = service.getAllProducts();
//		for(Product p : products){
//			System.out.println(p);
//		}

	}
}
