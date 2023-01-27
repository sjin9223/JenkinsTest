package com.calculator.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.calculator.Calculator;

public class CalculatorTest2 {

	@Test
	public void testSum() {
		Calculator calculator = new Calculator();
		assertEquals(60, calculator.sum(10, 20, 30));	
	}

}
