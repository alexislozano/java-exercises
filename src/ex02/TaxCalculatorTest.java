package ex02;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TaxCalculatorTest {

	@Test
	void ttc1() {
		assertEquals(10.2, TaxCalculator.ttc(new Item(10.0, ItemType.Drug)));
	}
	
	@Test
	void ttc2() {
		assertEquals(10.5, TaxCalculator.ttc(new Item(10.0, ItemType.Food)));
	}
	
	@Test
	void ttc3() {
		assertEquals(11.0, TaxCalculator.ttc(new Item(10.0, ItemType.Crop)));
	}
	
	@Test
	void ttc4() {
		assertEquals(12.0, TaxCalculator.ttc(new Item(10.0, ItemType.Other)));
	}
	
	@Test
	void ht1() {
		assertEquals(10.0, TaxCalculator.ht(new Item(10.2, ItemType.Drug)));
	}
	
	@Test
	void ht2() {
		assertEquals(10.0, TaxCalculator.ht(new Item(10.5, ItemType.Food)));
	}
	
	@Test
	void ht3() {
		assertEquals(10.0, TaxCalculator.ht(new Item(11.0, ItemType.Crop)));
	}
	
	@Test
	void ht4() {
		assertEquals(10.0, TaxCalculator.ht(new Item(12.0, ItemType.Other)));
	}
}
