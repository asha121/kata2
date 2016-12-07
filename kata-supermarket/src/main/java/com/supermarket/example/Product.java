package com.supermarket.example;

public class Product {
	private int quanity =0;
	private String name="";
	public int getQuanity() {
		return quanity;
	}
	public void setQuanity(int quanity) {
		this.quanity = quanity;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Product(int quanity, String name) {
		super();
		this.quanity = quanity;
		this.name = name;
	}

}
