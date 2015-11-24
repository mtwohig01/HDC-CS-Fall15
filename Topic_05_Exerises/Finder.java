/* 
 * Exercise 2
 * Reads in user input and splits the sentance into words on seperate lines
*/

import java.util.Scanner;

public class Finder {
	public static void main(String[] args) {
		// Get the Sentance from the User
		Scanner sc = new Scanner(System.in);
		String userInput = sc.nextLine();
		System.out.println(userInput);
		for (int i = 0; i < userInput.length(); i++)
			if ( (userInput.charAt(i)=='A') ||
			     (userInput.charAt(i)=='E') ||
			     (userInput.charAt(i)=='I') ||
			     (userInput.charAt(i)=='O') ||
			     (userInput.charAt(i)=='U') ||
			     (userInput.charAt(i)=='a') ||
			     (userInput.charAt(i)=='e') ||
			     (userInput.charAt(i)=='i') ||
			     (userInput.charAt(i)=='o') ||
			     (userInput.charAt(i)=='u') ) {	
				System.out.println( "index "+i+" : "+userInput.charAt(i) );
			}
		}
	}
