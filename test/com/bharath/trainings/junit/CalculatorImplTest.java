package com.bharath.trainings.junit;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculatorImplTest {
	private Calculator calculate;

	@Before
	public void setup() {
		calculate = new CalculatorImpl();
	}

	@Test
	public void calculateAddShouldReturnValidOutput() {
		int result = calculate.add(10, 20);
		assertEquals(30, result);
	}

	@Test
	public void calculateSubtractShouldReturnValidOutput() {
		int result = calculate.subtract(10, 20);
		assertEquals(10, result);
	}

	@Test
	public void multiplyShouldReturnValidOutput() {
		int result = calculate.multiply(10, 20);
		assertEquals(200, result);
	}

	@Test
	public void quotientShouldReturnValidOutput() {
		int result = calculate.quotient(5, 20);
		assertEquals(4, result);
	}

	@Test(expected = ArithmeticException.class)
	public void quotientShouldThrowAnExceptionForNum1ToBeZero() {
		calculate.quotient(0, 20);
	}

	@Test(expected = ArithmeticException.class)
	public void quotientShouldThrowAnExcpetionForNum2ToBeZero() {
		calculate.quotient(20, 0);
	}

	@Test
	public void remainderShouldReturnValidOutput() {
		int result = calculate.remainder(5, 20);
		assertEquals(0, result);
	}

	@Test(expected = ArithmeticException.class)
	public void remainderShouldThrowAnExceptionForNum1ToBeZero() {
		calculate.remainder(0, 20);
	}

	@Test(expected = ArithmeticException.class)
	public void remainderShouldThrowAnExcpetionForNum2ToBeZero() {
		calculate.remainder(20, 0);
	}

	@After
	public void teardown() {
		calculate = null;
	}

}
