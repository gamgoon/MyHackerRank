package main.java.datastructures.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayManipulation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long[] list = new long[n];
        int m = in.nextInt();
        long max = 0;
        for (int i=0; i<m; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int k = in.nextInt();
            list[a-1] += k;
            if (b < n)
                list[b] -= k;
        }

        long temp = 0;
        for (int i=0; i<n; i++) {
            temp += list[i];
            if (temp > max)
                max = temp;
        }

        // System.out.println(Arrays.toString(list));
        System.out.println(max);
        in.close();
    }
}
