/* 
 * Exercise 1
 * Prints out user input
*/

import java.util.Scanner;

public class Repeat {
	public static void main(String[] args) {
		// Get the Sentance from the User
		System.out.println("Please Enter a Sentance");
		Scanner sc = new Scanner(System.in);
		String userInput = sc.nextLine();
		// Print it out to the console
		System.out.println( userInput );
		}
}
