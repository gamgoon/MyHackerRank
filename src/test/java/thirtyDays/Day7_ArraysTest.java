package test.java.thirtyDays;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import main.java.thirtyDays.Day7_Arrays;
import test.java.PrintTestConfig;

public class Day7_ArraysTest extends PrintTestConfig{

	@Test
	public void test() {
		int[] arr = new int[]{1,2,3,4,5};
		Day7_Arrays.printReversed(arr);
		assertEquals("5 4 3 2 1\n", outContent.toString());
	}

}
