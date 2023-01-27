package com.calculator.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.calculator.Calculator;

public class CalculatorTest3 {

	@Test
	public void testSum() {
		Calculator calculator = new Calculator();
		assertEquals(50, calculator.sum(10, 20, 30));	
	}

}
