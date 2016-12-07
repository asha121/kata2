package com.supermarket.example;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SuperMarketTest {

	@Test
	public void test_total_price_for_single_item_A() {

		assertEquals(new Float(0.50), new CheckoutItem("A").totalprice());

	}

	@Test
	public void test_total_price_for_single_item_B() {
		assertEquals(new Float(0.30), new CheckoutItem("B").totalprice());

	}

	@Test
	public void test_total_price_for_single_item_C() {
		assertEquals(new Float(0.20), new CheckoutItem("C").totalprice());

	}

	@Test
	public void test_total_price_for_single_item_D() {
		assertEquals(new Float(0.15), new CheckoutItem("D").totalprice());

	}
	
	@Test
	public void test_total_price_for_two_item_A() {
		CheckoutItem co = new CheckoutItem("A");
		co.addItem("A");
		assertEquals(new Float(1.00), co.totalprice());

	}
}
