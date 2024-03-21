package controlflow.statements;

import java.util.Scanner;

/*
 * Find the average test scores for each student in the class.
 * There are 24 students and 4 tests.
 */

public class NestedLoops {

	public static void main(String[] args) {
		//Initialize the known values
		int numberOfStudents = 24;
		int numberOfSubjects = 4;
		
		Scanner scanner = new Scanner(System.in);
		
		//Find the average
		for(int i=0; i<numberOfStudents; i++) {
			
			double total = 0;
			for(int j=0; j<numberOfSubjects; j++) {
				System.out.println("Enter the score for Test #" +(j+1));
				double score = scanner.nextDouble();
				total = total + score;	
				
			}
								
			double average = total/numberOfSubjects;
			System.out.println("The test average for student #" +(i+1) +" is " +average);
		}
		
		scanner.close();

	}

}
