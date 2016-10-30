package main.java.thirtyDays;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Day5_Loops {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		printFirst10Multiples(n);
	}

	private static void printFirst10Multiples(int n) {
		IntStream.rangeClosed(1, 10).forEach(i -> System.out.println(n + " x " + i + " = " + n * i));
	}
}
