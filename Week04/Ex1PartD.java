/* 
 * Exercise 1D
 * Description : Write a program to print numbers from 1 to 100, in rows of ten values 
 * Mike Twohig
 */

public class Ex1PartD {
	public static void main(String[] args) {
		System.out.println("The numbers from 1 to 100 in rows of 10");
		System.out.println("with 2 lines between each row");
		// Nested loops of 10 to print out 1 to 100 in rows of 10
		for ( int i=0;i<10; i++ ) {
			for ( int j=0;j<10;j++) {
				// Print the number by calculating it based
				// on the two loop variables i and j
				System.out.print( (i*10+j+1) + " " );
			}
		// Print two lines of spaces inside the first loop
		System.out.print("\n\n");
		}
	}
}
