package com.telusko.springboot6tutorial.model;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
public class Product {

	private int prodId;
	private String prodName;
	private int price;

}
