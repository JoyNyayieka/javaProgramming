package string;

/*
 * Write a method that counts the number of words in a string and prints them individually on a new line.
 */
public class TextProcessor {
	
	public static void main(String[] args) {
		//countWords("I enjoy programming in Java");
		//reverseString("What programming language do you like?");
		addSpaces("LearningToCodeTakesPractise!");
	}
	
	/**
	 * Splits the String into an array by tokenizing it.
	 * Counts words and prints them
	 * @param text Full string to be split
	 */
	public static void countWords(String text) {
		var words = text.split(" ");
		int numberOfWords = words.length;
		
		String message = String.format("Your text has %d words.", numberOfWords);
		System.out.println(message);
		
		for(int i=0; i<numberOfWords; i++) {
			System.out.println(words[i]);
		}
	}
	
	/**
	 * Prints string in reverse order
	 * @param text String to reverse
	 */
	public static void reverseString(String text) {
		for(int i=text.length()-1; i>=0; i--) {
			System.out.print(text.charAt(i));
		}
	}

	/**
	 * Adds spaces before each uppercase letter
	 * @param text text without spaces
	 */
	public static void addSpaces(String text) {
		
		var modifiedText = new StringBuilder(text);
		
		for(int i=0; i<modifiedText.length(); i++) {
			if(i!=0 && Character.isUpperCase(modifiedText.charAt(i))) {
				modifiedText.insert(i, " ");
				i++;
			}
		}
		System.out.print(modifiedText);
	}
}
