package main.java.thirtyDays.day13_Abstract_Classes;

public class MyBook extends Book {
	private int price;
	MyBook(String title, String author, int price) {
		super(title, author);
		this.price = price;
	}

	@Override
	void display() {
		System.out.println("Title: " + this.title);
		System.out.println("Author: " + this.author);
		System.out.println("Price: " + this.price);
	}

}
