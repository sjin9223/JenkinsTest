package com.calculator.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.calculator.Calculator;

public class CalculatorTest2 {

	@Test
	public void testSum() {
		Calculator calculator = new Calculator();
		assertEquals(30, calculator.sum(15, 20));	
	}

}
