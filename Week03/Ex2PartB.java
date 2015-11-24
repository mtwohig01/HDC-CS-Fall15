/* 
 * Exercise 2B
 * Description : Assending Order ...
 * Mike Twohig
*/

import java.util.Scanner;

public class Ex2PartB {
	public static void main(String[] args) {
		// Read in two numbers from the user
		System.out.println("Please Enter two Numbers");
    		Scanner sc = new Scanner(System.in);
		int firstNum=sc.nextInt();
		int secondNum=sc.nextInt();
		// Print in Assending order
		// If the two numbers are equal it will just print out the two numbers
		if (firstNum<=secondNum)
			System.out.println(firstNum + " " + secondNum);
		else
			System.out.println(secondNum + " " + firstNum);
		}	
	}
