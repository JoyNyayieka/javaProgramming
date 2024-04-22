package conditional.statements;

import java.util.Scanner;

/*
 * NESTED IFS
 * To qualify for a loan, a person must make at least $30,000
 * and have at least 2 years of experience
 */
public class LoanQualifier {

	public static void main(String[] args) {

		//Initialize what you know
		int requiredSalary = 30000;
		int requiredYears = 2;
		
		//Get what we don't
		System.out.println("How much do you earn?");
		Scanner scanner = new Scanner(System.in);
		double salary = scanner.nextDouble();
		
		System.out.println("How many years have you been employed?");
		double yearsWorked = scanner.nextDouble();
		
		scanner.close();
		
		//Make decision
		if(salary >= requiredSalary) {
			if(yearsWorked >= requiredYears) {
				System.out.println("You qualify for a loan!");
			}
			else {
				System.out.println("You must have worked for a minimum of "+requiredYears +"years");
			}
		}
		else {
			System.out.println("Your salary must be above " +requiredSalary +"shillings");
		}
		
	}
}
