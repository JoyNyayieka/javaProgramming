package methods;

import java.util.Scanner;

/*
 * Write a method that asks users for their names and greets them
 * by name.
 */

public class Greetings {

	public static void main(String[] args) {
		
		System.out.println("What is your name?");
		Scanner scanner = new Scanner(System.in);
		String name = scanner.next();
		
		scanner.close();
		
		greetUser(name);
		
	}
	
	public static void greetUser(String name) {
		System.out.println("Hi there, " +name);
	}
	
}
