package com.example.Rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.Rest.model.Product;
import com.example.Rest.service.ProductServices;

@SpringBootApplication
public class RestApplication {
	
	@Autowired
	private ProductServices productServices;

	public static void main(String[] args) {
		SpringApplication.run(RestApplication.class, args);
	}

	@Bean
	public CommandLineRunner init() {
		
		

		return new CommandLineRunner() {
			@Override
			public void run(String... strings) throws Exception {
				for(Long i=0L;i<20L;i++)
				productServices.addProduct(new Product(i, "Product#"+i, 10.00+i, null));
			}
		};

	}
	
}
