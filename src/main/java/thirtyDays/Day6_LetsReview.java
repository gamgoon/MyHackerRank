package main.java.thirtyDays;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Day6_LetsReview {
    public static void main(String[] args) {
    	Scanner scan = new Scanner(System.in);
    	int n = scan.nextInt();
    	List<String> strings = new LinkedList<>();
    	for (int i=0; i<n; i++) {
    		String s = scan.next();
    		strings.add(s);
    	}
    	printEvenAndOddChars(strings);
    }

	public static void printEvenAndOddChars(List<String> strings) {
		for (int i=0;i<strings.size();i++) {
			char[] chars = strings.get(i).toCharArray();
			StringBuilder even = new StringBuilder();
			StringBuilder odd = new StringBuilder();
			for (int j=0;j<chars.length;j++) {
				if (j == 0 || j%2 == 0) {
					even.append(chars[j]);
				} else {
					odd.append(chars[j]);
				}
			}
			System.out.println(even.toString() + " " + odd.toString());
		}
	}
}
