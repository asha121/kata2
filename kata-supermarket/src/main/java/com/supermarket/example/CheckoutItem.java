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
			totalPrice = totalPrice + item.productPrice();
		}
		return totalPrice;
	}

	public void addItem(String item, int qty) {

		if (product.getName().equals(item)) {
			product.setQuanity(product.getQuanity() + qty);
		} else {
			items.add(new Product(qty, item));
		}

	}

}
