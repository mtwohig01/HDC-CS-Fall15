/* 
 *   Exercise 2B
 *   Description : Read in 5 numbers from a user and compute the frequency
 *                 of positive numbers entered
 *   Mike Twohig
 */


import java.util.Scanner;

public class Ex2PartB {
	public static void main(String[] args) {
		// Same as Exercise 2 A, Read in the 5 numbers (no error checking)
		System.out.println("Please Enter in 5 numbers");
    		Scanner sc = new Scanner(System.in);		
		// Initialize an array to store the 5 numbers
		int nums [] = new int[5];
		// Setup a counter variable
		int numPositiveInts=0;
		// Loop from 0 to 4
		for ( int i=0; i<5; i++ ) {
			// read in the number one by one into the array
			nums[i] = sc.nextInt();
			// check if it is positive
			// Im assuming in this program 0 is positive
			if (nums[i]>=0)
				numPositiveInts++;
		}
		// Finally print out the number of positive numbers previously
		// counted in the loop
		System.out.println("The Frequency of the positive 5 numbers is " + numPositiveInts );
	}
}
