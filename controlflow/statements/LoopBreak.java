package controlflow.statements;
import java.util.Scanner;
/*
 * A program that searches a string to determine if it 
 * contains the letter A
 */

public class LoopBreak {

	public static void main(String[] args) {
		
		// Get text from user
		System.out.println("Enter your text");
		Scanner scanner = new Scanner(System.in);
		String textEntered = scanner.next();
		scanner.close();
		
		boolean letterFound = false;
		
		//Search for letter A
		for(int i=0; i<textEntered.length(); i++) {
			char currentLetter = textEntered.charAt(i);
			if(currentLetter == 'A' || currentLetter == 'a'){
				letterFound = true;
				break;
			}
		}
		
		if(letterFound) {
			System.out.println("This text contains the letter A");
		}
		else {
			System.out.println("This text does not contains the letter A");
		}

	}

}
