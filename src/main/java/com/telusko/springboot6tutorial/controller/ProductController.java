package com.telusko.springboot6tutorial.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.telusko.springboot6tutorial.model.Product;
import com.telusko.springboot6tutorial.service.ProductService;

@RestController
public class ProductController {

	@Autowired
	private ProductService productService;
	
	@GetMapping("/")
	public List<Product> getProducts() {
		return productService.getProducts();
	}
		
	@GetMapping("blog")
	public String blog() {
		return "Hii this is blog";
	}
}
