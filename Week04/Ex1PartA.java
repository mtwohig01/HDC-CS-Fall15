/* 
 *   Exercise 1A
 *   Description : Write a program to print the even numbers from 1 to 100 
 *   Mike Twohig
 */

public class Ex1PartA {
	public static void main(String[] args) {
		System.out.println("The Even numbers from 1 to 100");
		// Loop starting at 2 and increments in multiples of 2 and stops
		// when the number is greater than 100
		for ( int i=2;i<=100; i=i+2 ) {
			System.out.println( i );
		}
	
	}
}
