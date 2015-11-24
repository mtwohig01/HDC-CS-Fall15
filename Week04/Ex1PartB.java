/* 
 * Exercise 1B
 * Description : Write a program to print the numbers from 100 to 1 
 * Mike Twohig
 */

public class Ex1PartB {
	public static void main(String[] args) {
		System.out.println("The numbers from 100 to 1");
		// Loop starts at 100 and then post-decrement down to 1 
		for ( int i=100;i>0; i-- ) {
			System.out.println( i );
		}
	
	}
}
