package com.supermarket.example;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SuperMarketTest {

	@Test
	public void test_total_price_for_single_item_A() {
		
		assertEquals(new Float(0.50), new CheckoutItem("A").Totalprice());

	}
	@Test
	public void test_total_price_for_single_item_B() {
		assertEquals(new Float(0.30), new CheckoutItem("B").Totalprice());

	}

	@Test
	public void test_total_price_for_single_item_C() {
		assertEquals(new Float(0.20), new CheckoutItem("C").Totalprice());

	}
}
