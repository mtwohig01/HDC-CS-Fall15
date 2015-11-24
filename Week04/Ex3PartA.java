/* 
 *  Exercise 2C
 *
 *  Part A: Write a program that reads several real numbers entered by the user,
 *  until they enter “End”, computes their average, and finds the largest and
 *  smallest values among them. Display these values, along with the numbers that
 *  were read.
 *
 *  Mike Twohig
 */

import java.util.Scanner;

public class Ex3PartA {
	public static void main(String[] args) {
		
		System.out.println("Please Enter numbers and finish with the word \"End\"");
    		// Read in the first word into a String
		Scanner sc = new Scanner(System.in);	
		String userInput = sc.next();
		// initialize the variables used for the calculations
		int count=0, sum=0, userValue=0;
		float average=0;
		// initialize the integers to the extremities;
		int maxNum=Integer.MIN_VALUE;
		int minNum=Integer.MAX_VALUE;
		// Loop untill the string "End" is entered
		while ( !userInput.equals("End" ) ) {
			
			// convert the string to an Integer
			// Assume the user is going to enter in numbers
			// Otherwise a Number format exception will be thrown
			// by the Integer.parseInt method if a non-numerical
			// string is entered
			// I could try and catch the exception but thats outside
			// the scope of this exercise.

			userValue = Integer.parseInt(userInput);
			// setup a counter for the averaging calculation
			count++;
			// accumulate the values
			sum = sum + userValue;
			// check min and max
			if (userValue > maxNum)
				maxNum= userValue;
			if (userValue < minNum)
				minNum = userValue;
			userInput = sc.next();
		}
		// The user could just type End and count=0, causing an exception
		// because its a divide by zero
		if ( count>0 ) {
			average = (float)sum/count;
			}
		// Finally print out the results
		System.out.println( "Average is " + average );
		System.out.println( "Maximum is " + maxNum );
		System.out.println( "Minimum is " + minNum );
	}
}
