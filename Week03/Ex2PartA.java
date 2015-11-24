/* 
 * Exercise 2A
 * Description : Multiple of 3 ... 
 * Mike Twohig
 */

import java.util.Scanner;

public class Ex2PartA {
	public static void main(String[] args) {
		// Read in number from the user
		System.out.println("Please Enter a Number");
    		Scanner sc = new Scanner(System.in);
		int mynum=sc.nextInt();
		// Check if the number is a multiple of 3
		if ( mynum%3==0 )
			System.out.println("This number is a muliple of 3");
		else
			System.out.println("This number is a not muliple of 3");
		}	
	}
