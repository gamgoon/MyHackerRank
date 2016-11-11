package test.java.thirtyDays;

import static org.junit.Assert.assertEquals;

import java.util.LinkedList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import main.java.thirtyDays.Day6_LetsReview;
import test.java.PrintTestConfig;

public class Day6_LetsReviewTest extends PrintTestConfig{

	List<String> strings = new LinkedList<>();
	@Before
	public void setUp() {
		strings.add("Hacker");
		strings.add("Rank");
		strings.add("Gamgoon");
	}
	@Test
	public void test() {
		Day6_LetsReview.printEvenAndOddChars(strings);
		assertEquals("Hce akr\nRn ak\nGmon ago\n", outContent.toString());
	}

}
