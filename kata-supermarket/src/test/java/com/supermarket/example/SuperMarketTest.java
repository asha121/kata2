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
	@Test
	public void test_total_price_for_A_item_B() {
		CheckoutItem co = new CheckoutItem("A");
		co.addItem("B");
		assertEquals(new Float(0.80), co.totalprice());

	}
	@Test
	public void test_total_price_for_A_item_C() {
		CheckoutItem co = new CheckoutItem("A");
		co.addItem("C");
		assertEquals(new Float(0.70), co.totalprice());

	}
	@Test
	public void test_total_price_for_B_item_C() {
		CheckoutItem co = new CheckoutItem("B");
		co.addItem("C");
		assertEquals(new Float(0.50), co.totalprice());

	}
	@Test
	public void test_total_price_for_C_item_C() {
		CheckoutItem co = new CheckoutItem("C");
		co.addItem("C");
		assertEquals(new Float(0.40), co.totalprice());

	}
	@Test
	public void test_total_price_for_two_b_items() {
		CheckoutItem co = new CheckoutItem("B");
		co.addItem("B");
		assertEquals(new Float(0.45), co.totalprice());

	}
	
}
