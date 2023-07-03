package com.isaac;

import java.util.List;

public class Product {

	
	private Integer id;
	private String name;
	private String short_description;	
	private Integer price;
	private String quantity;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getShort_description() {
		return short_description;
	}
	public void setShort_description(String short_description) {
		this.short_description = short_description;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	public String getQuantity() {
		return quantity;
	}
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}
	
	public static int calculateTotalPrice(List<Product> productList) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
}
