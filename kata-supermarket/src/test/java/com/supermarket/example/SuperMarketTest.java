package com.supermarket.example;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SuperMarketTest {

	@Test
	public void test_total_price_for_single_item() {
		CheckoutItems chkOut = new CheckoutItems();
		assertEquals(new Float(0.50), chkOut.Totalprice());

	}

}
