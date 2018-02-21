package main.java.datastructures.arrays;

import java.util.Scanner;

public class ArraysDs {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<n;i++) {
            arr[i] = in.nextInt();
        }

        for (int i=n-1;i>=0;i--) {
            System.out.printf("%d ", arr[i]);
        }
    }
}

