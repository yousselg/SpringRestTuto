package com.example.Rest.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.Rest.model.Product;
import com.example.Rest.service.ProductServices;

@RestController
@RequestMapping("/products")
@CrossOrigin
public class ProductController {

	@Autowired
	private ProductServices ps;
	
	@RequestMapping( method = RequestMethod.GET)
    public ResponseEntity<List<Product>> listAllProducts() {
        List<Product> products = (List<Product>) ps.getAllProducts();
        if(products.isEmpty()){
            return new ResponseEntity<List<Product>>(HttpStatus.NO_CONTENT);//You many decide to return HttpStatus.NOT_FOUND
        }
        return new ResponseEntity<List<Product>>(products, HttpStatus.OK);
    }
	
	@RequestMapping(method = RequestMethod.POST)
	ResponseEntity<?> add(@RequestBody Product input) {
		
		ps.addProduct(input);

		return new ResponseEntity<>(HttpStatus.CREATED);

	}
	
	@RequestMapping(method = RequestMethod.DELETE)
	ResponseEntity<?> delete(@RequestBody Product product)
	{
		ps.deleteProduct(product);
		return null;
		
	}
}
