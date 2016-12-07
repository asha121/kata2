package com.supermarket.example;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SuperMarketTest {

	@Test
	public void test_total_price_for_single_item_A() {
		assertEquals(new Float(0.50), new CheckoutItems().Totalprice());

	}

}
