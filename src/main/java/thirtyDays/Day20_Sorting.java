package main.java.thirtyDays;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Day20_Sorting {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		int numberOfSwaps = 0;
		for (int i = 0; i < n; i++) {
			// Track number of elements swapped during a single array traversal

			for (int j = 0; j < n - 1; j++) {
				// Swap adjacent elements if they are in decreasing order
				if (a[j] > a[j + 1]) {
					int tmp = a[j];
					a[j] = a[j+1];
					a[j+1] = tmp;
					numberOfSwaps++;
				}
			}

			// If no elements were swapped during a traversal, array is sorted
			if (numberOfSwaps == 0) {
				break;
			}
		}
		
		System.out.println("Array is sorted in " + numberOfSwaps + " swaps.");
		System.out.println("First Element: " + a[0]);
		System.out.println("Last Element: " + a[n-1]);
	}

}
