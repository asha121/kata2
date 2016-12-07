package com.supermarket.example;

public class CheckoutItem {
	private String item;

	public CheckoutItem(String item) {
		this.item = item;
	}

	public Float Totalprice() {
		Float totalPrice;
		switch (this.item) {
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

}
