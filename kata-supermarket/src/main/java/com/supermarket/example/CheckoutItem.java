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
			this.product = item;
			totalPrice = totalPrice + productPrice(item);
		}
		return totalPrice;
	}

	private Float productPrice(Product item) {
		Float totalPrice;
		int qty = item.getQuanity();
		switch (item.getName()) {
		case "A":
			totalPrice = new Float(((qty / 3) * 1.30) + ((qty % 3) * 0.50));
			break;
		case "B":
			totalPrice = new Float(((qty / 2) * 0.45) + ((qty % 2) * 0.30));
			break;
		case "C":
			totalPrice = new Float(item.getQuanity() * 0.20);
			break;
		default:
			totalPrice = new Float(item.getQuanity() * 0.15);
			break;
		}
		return totalPrice;
	}

	public void addItem(String item, int qty) {
		if (product.getName().equals(item)) {
			product.setQuanity(product.getQuanity() + qty);
			// items.add(product);
		} else {
			items.add(new Product(qty, item));
		}

	}

}
