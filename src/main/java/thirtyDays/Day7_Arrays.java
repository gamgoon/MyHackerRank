package main.java.thirtyDays;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Day7_Arrays {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = in.nextInt();
		}
		in.close();
		// for (int i = n-1; i>=0; i--) {
		// System.out.print(arr[i]);
		// if (i > 0)
		// System.out.print(" ");
		// }
		printReversed(arr);
	}

	public static void printReversed(int[] arr) {
		List<String> list = Arrays.stream(arr).mapToObj(Integer::toString).collect(Collectors.toList());
		Collections.reverse(list);
		System.out.println(list.stream().collect(Collectors.joining(" ")));
	}
}
