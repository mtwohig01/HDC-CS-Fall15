/* 
 *   Exercise 2C
 *   Description :  Read in numbers from the user until the user enters -1,
 *		 and compute the frequency of the even numbers from the user
 *   Mike Twohig
 */

import java.util.Scanner;

public class Ex2PartC {
	public static void main(String[] args) {
		System.out.println("Please Enter numbers, finish by entering -1");
    		Scanner sc = new Scanner(System.in);		
		// initialize a counter
		int numEven=0;
		// read in an initial number
		int nums = sc.nextInt();
		// loop continiously until -1 is read in from the user
		while ( nums != -1 ) {
			// check if its even , if so increment a counter
			if ( (nums % 2) == 0 ) {
				numEven++;
				}
			// read in the next value
			nums=sc.nextInt();			
		}
		// finally print out the result
		System.out.println("The Frequency of the Even 5 numbers entered is " + numEven );
	}
}
