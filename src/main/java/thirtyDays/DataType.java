package main.java.thirtyDays;

import java.util.Scanner;

public class DataType {
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
		
        Scanner scan = new Scanner(System.in);
        
        /* Declare second integer, double, and String variables. */
        int first;
        double second;
        String third;
        
        /* Read and save an integer, double, and String to your variables.*/
        first = scan.nextInt();
        second = scan.nextDouble();
        scan.nextLine();
        third = scan.nextLine();
        
        /* Print the sum of both integer variables on a new line. */
        System.out.println(i + first);
        /* Print the sum of the double variables on a new line. */
        System.out.println(d + second);
        /* Concatenate and print the String variables on a new line; 
        	the 's' variable above should be printed first. */
        System.out.println(s + third);
        
        scan.close();
    }
}
