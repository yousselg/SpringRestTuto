package com.example.Rest.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Rest.model.Product;
import com.example.Rest.repositories.ProductRepository;
import com.example.Rest.service.ProductServices;

@Service
public class ProductServicesImpl implements ProductServices {
	
	@Autowired
	private ProductRepository er;
	

	@Override
	public void addProduct(Product p) {
		er.save(p);
	}

	@Override
	public List<Product> getAllProducts() {	
		return (List<Product>) er.findAll();
	}

	@Override
	public void deleteProduct(Product p) {
		er.delete(p);
	}

}
