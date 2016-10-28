package test.java.ctci;

import static org.junit.Assert.*;

import org.junit.Test;

import main.java.ctci.MakingAnagrams;

public class MakingAnagramsTest {

	@Test
	public void test() {
		String first = "aaaa";
		String second = "aaaaaa";
		int count = MakingAnagrams.numberOfSameChar(first, second);
		System.out.println(count);
		assertTrue(4 == count);
	}

}
