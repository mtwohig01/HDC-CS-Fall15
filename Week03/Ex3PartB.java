/* 
 * Exercise 3B
 * Description : Exam Results ... 
 * Mike Twohig
 */

import java.util.Scanner;

public class Ex3PartB {
	public static void main(String[] args) {

		// Read in the Result from the user
		System.out.println("Please Enter the Exam Result out of 100");
    		Scanner sc = new Scanner(System.in);
		int result=sc.nextInt();

		// main Checking for the Award
		if (( result <=100 ) &&  ( result>=80 ))
			System.out.println("Distinction");
		else if (( result <=79 ) && ( result >=65 ))
			System.out.println("Merit");
		else if (( result <=64 ) && ( result >=50 )) 
			System.out.println("Pass");
		else if (( result <=49 )&& ( result >=0 ))
			System.out.println("Fail");

		// Error Checking
		else if ( result < 0 )
			System.out.println("Need to Enter a grade over 0 to be valid");
		else
			System.out.println("Need to Enter a grade under 100 to be valid");
			
		}
	}
