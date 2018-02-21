package main.java.datastructures.arrays;

import java.util.Scanner;

public class LeftRotation {
    static int[] leftRotation(int[] a, int d) {
        if (d == a.length)
            return a;
        int[] resultArray = new int[a.length];
        for (int i = a.length - 1; i >= 0; i--) {
            resultArray[(i - d + a.length) % a.length] = a[i];
        }
        return resultArray;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int d = in.nextInt();
        int[] a = new int[n];
        for(int a_i = 0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        int[] result = leftRotation(a, d);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
        }
        System.out.println("");


        in.close();
    }
}
