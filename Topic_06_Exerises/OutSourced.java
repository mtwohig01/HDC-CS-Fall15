/* 
 *	Exercise 9
 *	Define a method to ask for a number and return it
 *	in main call the method and display the returned value.
 */

import java.util.Scanner;

public class OutSourced {

	public static int getUserInput() {
		System.out.println("Please Enter a Number");
		Scanner sc = new Scanner(System.in);
		return sc.nextInt();
	}
	
	public static void main ( String [] args ) {
		System.out.println(getUserInput());
	}

}
