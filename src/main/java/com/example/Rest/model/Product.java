package com.example.Rest.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Product {

	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String name;
	private Double price;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="USER_ID")
	private User user;

	public Product(Long id, String name, Double price, User user) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.user = user;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
}
