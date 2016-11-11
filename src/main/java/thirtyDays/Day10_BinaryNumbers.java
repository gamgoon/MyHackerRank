package main.java.thirtyDays;

import java.util.Scanner;

public class Day10_BinaryNumbers {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		in.close();
		
		int maxCount = 0;
		int unitCount = 0;

		for (int i=n;i>=0;i=i>>1) {
			int remainder;
			if (i > 1) {
				remainder = i % 2;
			} else {
				remainder = i;
			}
			if (remainder == 1) {
				unitCount++;
			} else if(remainder == 0) {
				if (unitCount > maxCount) {
					maxCount = unitCount;
				}
				unitCount = 0;
			}
//			System.out.println(remainder + " " + unitCount);
			if (i == 0) {
				break;
			}
		}
		System.out.println(maxCount);
		
//		printBinary(n);
	}

    private static void printBinary(int number) {
        int remainder;

        if (number <= 1) {
            System.out.print(number);
            return;
        }

        remainder = number %2; 
        printBinary(number >> 1);
        System.out.print(remainder);
    }
}
