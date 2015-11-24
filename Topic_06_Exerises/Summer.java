/* 
 * 	Exercise 7
 *	Sum and display an array using a method 
 *	Mike Twohig
 */

import java.util.Scanner;

public class Summer {
	
	// define the method
	public static int calculateSum( int [] x ) {
		int sum=0;
		for (int i=0; i<x.length ; i++) {
			sum=sum+x[i];
		}
		return sum;
	}
	public static void main(String [] args) {
		// Create the Array
		int myIntArray [] = {1,2,3,4,5,6,7,8,9,10};
		System.out.println("The sum of the first Ten numbers is " + calculateSum(myIntArray) );
	}
}
