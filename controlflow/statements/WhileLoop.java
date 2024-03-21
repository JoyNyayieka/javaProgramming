package controlflow.statements;

import java.util.Scanner;

/*
 * Each store employee makes $15 an hour. Write a program
 * that allows a manager to enter the number of weekly hours worked
 * for each employee, and calculate their pay. Do not allow
 * for overtime. 
 */

public class WhileLoop {

	public static void main(String[] args) {
		
		//Initialize known variables
		int paymentRate = 15;
		int maxHours = 40;
		
		//Get inputs for unkown variables
		System.out.println("How many hours did you work this week?");
		Scanner scanner = new Scanner(System.in);
		double hoursWorked = scanner.nextDouble();
		
		//Check if the input is valid
		while(hoursWorked > maxHours) {
			System.out.println("Invalid input. Your hours must be under 40 hours.Try again.");
			hoursWorked = scanner.nextDouble();
		}
		
		scanner.close();
		
		//Calculate the salary
		double salary = paymentRate * hoursWorked;
		System.out.println("The total salary of this employee is " +salary);
	}

}
