package com.supermarket.example;

public class CheckoutItem {
private String item;	

	public CheckoutItem(String item) {
		this.item=item;
	}

	public Float Totalprice() {
		// TODO Auto-generated method stub
		if (item.equals("A")) {
			return new Float(0.50);	
		}
		return new Float(0.30);
	}

}
