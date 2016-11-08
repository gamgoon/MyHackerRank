package test.java.thirtyDays;

import static org.junit.Assert.*;

import org.junit.Test;

import main.java.thirtyDays.Day9_Recursion;

public class Day9_RecursionTest {

	@Test
	public void test() {
		int result = Day9_Recursion.factorial(1);
		assertTrue(result == 1);
		
		result = Day9_Recursion.factorial(2);
		assertTrue(result == 2);
		
		result = Day9_Recursion.factorial(3);
		assertTrue(result == 6);
		
		result = Day9_Recursion.factorial(4);
		assertTrue(result == 24);
	}

}
