package methods;

import java.util.Scanner;

/*
 * VARIABLE SCOPE
 * Write an 'instance credit check' program that approves anyone who 
 * makes more than Ksh25,000 and has a credit score of 700 or better.
 * Reject all others.  
 */

public class InstantCreditCheck {
	
	//Initialize what we know
	static int requiredSalary = 25000;
	static int requiredCreditScore = 700;
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		//Get what we don't
		double salary = getSalary();
		int creditScore = getCreditScore();
		
		scanner.close();
		
		//Check if the user is qualified
		boolean qualified = isUserQualified(salary, creditScore);
		
		//Notify the user
		notifyUser(qualified);
		
	}
	
	public static double getSalary() {
		System.out.println("Enter your salary:");
		double salary = scanner.nextDouble();
		return salary;
				
	}
	
	public static int getCreditScore() {
		System.out.println("Enter your credit score?:");
		int creditScore = scanner.nextInt();
		return creditScore;
		
	}	
	
	public static boolean isUserQualified(double salary, int creditScore) {

		if(salary >= requiredSalary && creditScore >= requiredCreditScore) {
			return true;
		}
		else {
			return false;
		}
		
	}
	
	public static void notifyUser(boolean isQualified) {
		if(isQualified) {
			System.out.println("Congrats! You've been approved.");
		}
		else {
			System.out.println("Sorry. You've been declined.");
		}
	}
	

}
