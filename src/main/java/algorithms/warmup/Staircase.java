package main.java.algorithms.warmup;

import java.util.Scanner;

public class Staircase {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	sc.close();
    	
    	for (int i=1; i<=n; i++) {
    		print(" ", n - i);
    		print("#", i);
    		System.out.println();
    	}
    }

	private static void print(String symbol, int n) {
		for (int i=0;i<n;i++){
			System.out.print(symbol);
		}
	}
}
