package com.supermarket.example;

public class Product {
	private int quanity = 0;
	private String name = "";

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

	public Float productPrice() {
		Float totalPrice;
		int qty = getQuanity();
		switch (getName()) {
		case "A":
			totalPrice = new Float(((qty / 3) * 1.30) + ((qty % 3) * 0.50));
			break;
		case "B":
			totalPrice = new Float(((qty / 2) * 0.45) + ((qty % 2) * 0.30));
			break;
		case "C":
			totalPrice = new Float(getQuanity() * 0.20);
			break;
		default:
			totalPrice = new Float(getQuanity() * 0.15);
			break;
		}
		return totalPrice;
	}

	public Product(int quanity, String name) {
		super();
		this.quanity = quanity;
		this.name = name;
	}

}
