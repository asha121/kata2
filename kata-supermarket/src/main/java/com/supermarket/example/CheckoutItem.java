package com.supermarket.example;

public class CheckoutItem {
	private String item;

	public CheckoutItem(String item) {
		this.item = item;
	}

	public Float Totalprice() {
		if (item.equals("A")) {
			return new Float(0.50);
		}
		if (item.equals("B")) {
			return new Float(0.30);
		}
		return new Float(0.20);
	}

}
