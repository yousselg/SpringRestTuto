package com.example.Rest.repositories;

import org.springframework.data.repository.CrudRepository;

import com.example.Rest.model.Product;

public interface ProductRepository extends CrudRepository<Product, Long> {

}
