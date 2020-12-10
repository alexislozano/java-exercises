package ex01;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorTest {

	@Test
	void add1() {
		assertEquals(0, Calculator.add(0, 0));
	}
	
	@Test
	void add2() {
		assertEquals(10, Calculator.add(2, 8));
	}
	
	@Test
	void add3() {
		assertEquals(-6, Calculator.add(-14, 8));
	}
	
	@Test
	void substract1() {
		assertEquals(0, Calculator.substract(6, 6));
	}
	
	@Test
	void substract2() {
		assertEquals(10, Calculator.substract(12, 2));
	}
	
	@Test
	void substract3() {
		assertEquals(-6, Calculator.substract(10, 16));
	}
	
	@Test
	void multiply1() {
		assertEquals(0, Calculator.multiply(6, 0));
	}
	
	@Test
	void multiply2() {
		assertEquals(10, Calculator.multiply(5, 2));
	}
	
	@Test
	void multiply3() {
		assertEquals(-6, Calculator.multiply(3, -2));
	}
	
	@Test
	void divide1() {
		assertEquals(0, Calculator.divide(0, 3));
	}
	
	@Test
	void divide2() {
		assertEquals(10, Calculator.divide(20, 2));
	}
	
	@Test
	void divide3() {
		assertEquals(-6, Calculator.divide(12, -2));
	}
	
	@Test
	void divide4() {
		assertEquals(0, Calculator.divide(6, 0));
	}
}
