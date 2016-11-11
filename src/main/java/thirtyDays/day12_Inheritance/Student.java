package main.java.thirtyDays.day12_Inheritance;

import java.util.Arrays;
import java.util.OptionalDouble;

public class Student extends Person {
	private int[] testScores;
	Student(String firstName, String lastName, int id, int[] scores) {
		super(firstName, lastName, id);
		this.testScores = scores;
	}	   
	
	public char calculate() {
		OptionalDouble average = getAverage();
		if (average.isPresent()) {
			double avg = average.getAsDouble();
			if (avg >= 90 && avg <= 100) {
				return 'O';
			} else if (avg >= 80 && avg < 90) {
				return 'E';
			} else if (avg >= 70 && avg < 80) {
				return 'A';
			} else if (avg >= 55 && avg < 70) {
				return 'P';
			} else if (avg >= 40 && avg < 55) {
				return 'D';
			} else {
				return 'T';
			}	
		} else {
			return 'T';
		}
	}
	
	private OptionalDouble getAverage() {
		return Arrays.stream(this.testScores).average();
	}
}
