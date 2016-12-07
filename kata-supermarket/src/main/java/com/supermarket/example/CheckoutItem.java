package com.supermarket.example;

import java.util.ArrayList;
import java.util.List;

public class CheckoutItem {
	private List<String> items = new ArrayList<String>();
	private String product;

	public CheckoutItem(String item) {
		items.add(item);
		this.product = item;
	}

	public Float totalprice() {
		Float totalPrice = new Float(0);
		for (String item : items) {
			this.product = item;
			totalPrice = totalPrice + unitPrice();
		}
		return totalPrice;
	}

	private Float unitPrice() {
		Float totalPrice;
		switch (this.product) {
		case "A":
			totalPrice = new Float(0.50);
			break;
		case "B":
			totalPrice = new Float(0.30);
			break;
		case "C":
			totalPrice = new Float(0.20);
			break;
		default:
			totalPrice = new Float(0.15);
			break;
		}
		return totalPrice;
	}

	public void addItem(String item) {
		items.add(item);
	}

}
