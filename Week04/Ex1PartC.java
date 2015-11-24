/* 
 * Exercise 1C
 * Description : Write a program to print the multiples of 3 less than 100 
 * Mike Twohig
 */

public class Ex1PartC {
	public static void main(String[] args) {
		System.out.println("The numbers from 1 to 100 in multiples of 3");
		// Loop starts at 3 and increments by 3 every iteration while
		// it is less than 100 (99 should be the last value)
		for ( int i=3; i<=100; i=i+3 ) {
			System.out.println( i );
		}
	}
}
