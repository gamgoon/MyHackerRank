package main.java.datastructures.arrays;

import java.util.Scanner;

public class Arrays2DDs {
    public static void main(String[] args) {
        int si = 6;
        int sj = 6;

        int[][] arr2d = new int[si][sj];
        Scanner in = new Scanner(System.in);
        for (int i=0;i<si;i++) {
            String line = in.nextLine();
            String[] lineNumbers = line.split(" ");
            for (int j=0;j<sj;j++) {
                arr2d[i][j] = Integer.valueOf(lineNumbers[j]);
            }
        }

        int line1 = 0;
        int line2 = 1;
        int line3 = 2;
        int col1 = 0;
        int col2 = 1;
        int col3 = 2;
        int middle = 1;
        int maxSum = 0;
        for (int i=0;i<si;i++) {
            if (line3 + i > sj - 1)
                break;
            for (int j=0;j<sj;j++) {
                int a = arr2d[line1+i][col1+j];
                int b = arr2d[line1+i][col2+j];
                int c = arr2d[line1+i][col3+j];
                int d = arr2d[line2+i][middle+j];
                int e = arr2d[line3+i][col1+j];
                int f = arr2d[line3+i][col2+j];
                int g = arr2d[line3+i][col3+j];
                int sum = a + b + c + d + e + f + g;
                if (i==0 && j==0)
                    maxSum = sum;
                else
                    maxSum = sum > maxSum ? sum : maxSum;
                if (col3 + j == sj - 1)
                    break;
            }
        }
        System.out.println(maxSum);
        in.close();
    }
}

