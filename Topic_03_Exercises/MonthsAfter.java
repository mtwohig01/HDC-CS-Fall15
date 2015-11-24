/* 
 * Exercise 8
*/

import java.util.Scanner;

public class MonthsAfter {
    

	public static void main(String[] args) {
        	int i;
		String [] months = {"January", "Febuary", "March" , "April",
		"May", "June", "July", "August", "September", "October",
		"November", "December"};	
		Scanner sc = new Scanner(System.in);
		System.out.println( "Please enter a number" );
		int x = sc.nextInt();
		if ( (x>=0) && (x<12) ) {
			for(i=x;i<12;i++) { 
				System.out.println( months[i] + " " );
			}
		}
		else {
			System.out.println("Enter a number between 0 and 11");
		}
	}

}
