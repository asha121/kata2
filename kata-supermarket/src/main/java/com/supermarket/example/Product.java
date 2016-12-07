package com.supermarket.example;

public class Product {
	private int quanity = 0;
	private String name = "";
	private float basePrice = 0;

	
	public float getBasePrice() {
		return basePrice;
	}

	public void setBasePrice(float basePrice) {
		this.basePrice = basePrice;
	}

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
