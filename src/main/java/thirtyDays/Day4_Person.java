package main.java.thirtyDays;

import java.util.Scanner;

public class Day4_Person {
	private int age;
	
	public Day4_Person(int initialAge) {
		if (initialAge < 0) {
			initialAge = 0;
			System.out.println("Age is not valid, setting age to 0.");
		}
		this.age = initialAge;
	}
	
	public void amIOld() {
		if (this.age < 13) {
			System.out.println("You are young.");
		} else if (this.age >= 13 && this.age < 18) {
			System.out.println("You are a teenager.");
		} else {
			System.out.println("You are old.");
		}
	}
	
	public void yearPasses() {
		this.age++;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int i = 0; i < T; i++) {
			int age = sc.nextInt();
			Day4_Person p = new Day4_Person(age);
			p.amIOld();
			for (int j = 0; j < 3; j++) {
				p.yearPasses();
			}
			p.amIOld();
			System.out.println();
        }
		sc.close();
	}
}
