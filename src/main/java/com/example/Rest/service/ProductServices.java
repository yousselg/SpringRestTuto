package com.example.Rest.service;

import java.util.List;

import com.example.Rest.model.Product;


public interface ProductServices {
	
	public void addProduct(Product p);
	public List<Product> getAllProducts();
	public void deleteProduct(Product p);
}
