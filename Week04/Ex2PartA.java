/* 
 * Exercise 2A
 * Description: Read in 5 numbers from a user, and compute & print their product
 * Mike Twohig
 */

import java.util.Scanner;

public class Ex2PartA {
	public static void main(String[] args) {
		// use Scanner class to read in numbers from the user
		// the numbers can be either carrige return, tab or space
		// delimited
		// it will not check for erronious user input such as words
		// an exception (InputMismatchException) will be thrown if
		// the user enters in data that is non numerical
		// if the user do not enter in any numbers the answer will be 1.

		System.out.println("Please Enter in 5 numbers");
    		Scanner sc = new Scanner(System.in);		
		// need to initialize product outside the loop
		int product=1;
		for ( int i=0; i<5; i++ ) {
			product = product * sc.nextInt();
		}
		// Finally print the result
		System.out.println("The Product of the 5 numbers is " + product );	
	}
}
