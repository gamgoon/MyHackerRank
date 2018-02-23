package main.java.datastructures.arrays;

import java.util.Scanner;

public class SparsArrays {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] strings = new String[n];
        for (int i=0; i<n; i++) {
            strings[i] = in.next();
        }
        int q = in.nextInt();
        String[] queries = new String[q];
        for (int i=0; i<q; i++) {
            queries[i] = in.next();
        }

        int[] countPerQuery = new int[q];
        for (int i=0; i<n; i++) {
            String string = strings[i];
            for (int j=0; j<q; j++) {
                if (string.equals(queries[j])) {
                    countPerQuery[j]++;
                }
            }
        }

        for (int count : countPerQuery) {
            System.out.println(count);
        }
    }
}
