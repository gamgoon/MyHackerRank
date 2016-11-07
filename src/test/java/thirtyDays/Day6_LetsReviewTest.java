package test.java.thirtyDays;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.LinkedList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import main.java.thirtyDays.Day6_LetsReview;

public class Day6_LetsReviewTest {
	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();

	@Before
	public void setUpStreams() {
	    System.setOut(new PrintStream(outContent));
	    System.setErr(new PrintStream(errContent));
	}

	@After
	public void cleanUpStreams() {
	    System.setOut(null);
	    System.setErr(null);
	}
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
