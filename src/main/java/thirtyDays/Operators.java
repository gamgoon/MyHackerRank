package main.java.thirtyDays;

import java.util.Scanner;

public class Operators {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double mealCost = scan.nextDouble(); // original meal price
        int tipPercent = scan.nextInt(); // tip percentage
        int taxPercent = scan.nextInt(); // tax percentage
        scan.close();
      
        // Write your calculation code here.
        double tip = mealCost * (tipPercent / 100.0);
        double tax = mealCost * (taxPercent / 100.0);
        double total = mealCost + tip + tax;
        // cast the result of the rounding operation to an int and save it as totalCost 
        int totalCost = (int) Math.round(total);
      
        // Print your result
        System.out.println(String.format("The total meal cost is %d dollars.", totalCost));
    }
}
