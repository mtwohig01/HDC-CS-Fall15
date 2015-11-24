/* 
 * Exercise 5
 * Range Example pass in an int and return a boolean
*/

import java.util.Scanner;

public class FirstForty {
	
	// define the method
	public static Boolean isPrime( int n ) {
		for ( int i = 2; i < n ; i++ ) {
			if ((n%i)==0)
				return false;
		}
		if (n==1)
			return false;
		else
			return true;
	}
	public static void main(String [] args) {
		// Get the Number from the User
		System.out.println("Please Enter a Number");
		Scanner sc = new Scanner(System.in);
		int userInput = sc.nextInt();
		if (isPrime( userInput ) == true ) {
			System.out.println("the number is Prime");
		}
		else {
			System.out.println("the number is not Prime");
		}
		System.out.println("Prining the first 40 based on calling the isPrime method");
		int count=0;
		int i=1;
		while (count<40) {
			if (isPrime(i)) {
				System.out.println(i);
				count++;
			}
			i++;
		}
	}
}
