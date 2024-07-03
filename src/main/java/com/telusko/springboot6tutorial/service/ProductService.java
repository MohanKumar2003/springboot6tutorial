package com.telusko.springboot6tutorial.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.telusko.springboot6tutorial.model.Product;

@Service
public class ProductService {

	List<Product> products = Arrays.asList(
		new Product(1, "Mouse", 350),
		new Product(2, "Keyboard", 500),
		new Product(3, "Laptop", 90000)
	);

	public List<Product> getProducts() {
		return products;
	}
}
