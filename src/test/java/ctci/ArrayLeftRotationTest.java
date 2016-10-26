package test.java.ctci;

import static org.junit.Assert.*;

import org.junit.Test;

import main.java.ctci.ArrayLeftRotation;

public class ArrayLeftRotationTest {

	@Test
	public void test_getResultArray() {
		int[] input = {1,2,3,4,5};
		int offset = 2;
		int[] output = {3,4,5,1,2};
		int[] result = ArrayLeftRotation.getResultArray(input, offset);
		assertArrayEquals(output, result);
	}
	
	@Test 
	public void test_getStringFromArray() {
		int[] input = {1,2,3,4,5};
		String output = "1 2 3 4 5";
		String result = ArrayLeftRotation.test_getStringFromArray(input);
		assertEquals(output, result);
	}
}
