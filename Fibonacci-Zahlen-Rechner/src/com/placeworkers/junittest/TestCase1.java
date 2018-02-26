package com.placeworkers.junittest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestCase1 {

	@Test
	public void test() {
		assertEquals(1, com.placeworkers.tools.FibonacciRekursiv.berechne(1));
		assertEquals(1, com.placeworkers.tools.FibonacciRekursiv.berechne(2));
		assertEquals(2, com.placeworkers.tools.FibonacciRekursiv.berechne(3));
		assertEquals(3, com.placeworkers.tools.FibonacciRekursiv.berechne(4));
		assertEquals(5, com.placeworkers.tools.FibonacciRekursiv.berechne(5));
		assertEquals(8, com.placeworkers.tools.FibonacciRekursiv.berechne(6));
		
		

	}


}
