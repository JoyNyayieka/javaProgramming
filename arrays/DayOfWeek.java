package arrays;

import java.util.Scanner;

/*
 * Make an array that holds the textual values of the days of the week.
 * Have a user input a number corresponding to the day of the week. Assume the week starts on Monday.
 * The program should output the String of the day of the week. 
 * eg if user inputs the number 1, program should output Monday.
 */

public class DayOfWeek {
	
	public static void main(String[] args) {
		
		//Declaring the array that hold the textual values of the week
		String[] dayOfWeek = new String[7];
		
		//Initializing the elements of the array
		dayOfWeek[0] = "Monday";
		dayOfWeek[1] = "Tuesday";
		dayOfWeek[2] = "Wednesday";
		dayOfWeek[3] = "Thursday";
		dayOfWeek[4] = "Friday";
		dayOfWeek[5] = "Saturday";
		dayOfWeek[6] = "Sunday";
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of the day of the week: ");
		 int dayNumber = scanner.nextInt();
		 scanner.close();
		
		
		System.out.println("The day is " + dayOfWeek[dayNumber -1]);
	}
}


