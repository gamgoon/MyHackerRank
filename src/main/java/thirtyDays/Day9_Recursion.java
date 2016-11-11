package main.java.thirtyDays;

import java.util.Scanner;

public class Day9_Recursion {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		in.close();
		int result = factorial(n);
		System.out.println(result);
	}

	public static int factorial(int n) {
		if (n <= 0)
			return 1;
		return n * factorial(n-1);
	}
}
