package main.java.algorithms.implementation;

import java.util.Scanner;

public class AngryProfessor {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testCount = sc.nextInt();
		for (int i=0;i<testCount; i++) {
			int studentCount = sc.nextInt();
			int threshold = sc.nextInt();
			int attendanceCount = 0;
			for (int j=0;j<studentCount;j++) {
				int arrivalTime = sc.nextInt();
				if (arrivalTime <= 0) {
					attendanceCount++;
				}
			}
			if (attendanceCount >= threshold) {
				System.out.println("NO");
			}else{
				System.out.println("YES");
			}
		}
		sc.close();
	}
}
