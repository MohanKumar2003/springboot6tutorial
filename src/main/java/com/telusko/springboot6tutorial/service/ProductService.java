package com.telusko.springboot6tutorial.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.telusko.springboot6tutorial.model.Product;
import com.telusko.springboot6tutorial.repository.ProductRepo;

@Service
public class ProductService {

	@Autowired
	ProductRepo repo;

	public List<Product> getProducts() {
		return repo.findAll();
	}

	public Product getProductByID(int prodId) {
		return repo.findById(prodId).orElse(new Product());
	}

	public void addProduct(Product product) {
		repo.save(product);
	}

	public void updateProduct(Product product) {
		repo.save(product);
	}

	public void deleteProduct(int prodId) {
		repo.deleteById(prodId);
	}

}
