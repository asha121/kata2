package com.supermarket.example;

import java.util.ArrayList;
import java.util.List;

public class CheckoutItem {
	private List<Product> items = new ArrayList<Product>();
	private Product product;

	public CheckoutItem(String item) {
	    product = new Product(1, item);
		items.add(product);
		
	}

	public Float totalprice() {
		Float totalPrice = new Float(0);
		for (Product item : items) {
			this.product=item;
			totalPrice = totalPrice + unitPrice();
		}
		return totalPrice;
	}

	private Float unitPrice() {
		Float totalPrice;
		switch (this.product.getName()) {
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

	public void addItem(String item, int qty) {
		items.add(new Product(qty,item));
	}

}
