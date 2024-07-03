package com.telusko.springboot6tutorial.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.telusko.springboot6tutorial.model.Product;
import com.telusko.springboot6tutorial.service.ProductService;

@RestController
public class ProductController {

	@Autowired
	private ProductService service;
	
	// get all products
	@GetMapping("/products")
	public List<Product> getProducts() {
		return service.getProducts();
	}

	// get specific product
	@GetMapping("/product/{prodId}")
	public Product getProduct(@PathVariable int prodId) {
		return service.getProductByID(prodId);
	}

	// post/add product
	@PostMapping("/product")
	public void addProduct(@RequestBody Product product) {
		service.addProduct(product);
	}

	// Put / Update product
	@PutMapping("/product")
	public void updateProduct(@RequestBody Product product) {
		service.updateProduct(product);
	}

	// Delete Product
	@DeleteMapping("/product/{prodId}")
	public void deleteProduct(@PathVariable int prodId) {
		service.deleteProduct(prodId);
	}
}
