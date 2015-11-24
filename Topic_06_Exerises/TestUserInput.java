/* 
 * Exercise 5
 * Range Example pass in an int and return a boolean
*/

import java.util.Scanner;

public class TestUserInput {
	
	// define the method
	public static Boolean InputInRange(int n) {
		int max=20;
		int min=10;
		if (( n<=max ) && (n>=min)) {
			return true;
		}
		else {
			return false;
		}
	}
	public static void main(String [] args) {
		// Get the Number from the User
		System.out.println("Please Enter a Number");
		Scanner sc = new Scanner(System.in);
		int userInput = sc.nextInt();
		if (InputInRange( userInput ) == true ) {
			System.out.println("the number is in Range");
		}
		else {
			System.out.println("the number is not in Range");
		}
	}
}
