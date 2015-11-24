/* 
 * Exercise 3A
 * Description : 24 Hour Clock ... 
 * Mike Twohig
 */

import java.util.Scanner;

public class Ex3PartA {
	public static void main(String[] args) {
		// Get the time
		System.out.println("Please enter the Time : hours followed by minutes");
    		Scanner sc = new Scanner(System.in);
		int hours=sc.nextInt();
		int mins=sc.nextInt();
		// Only Execute if the hour/minute values are valid
		if (( ( hours<24 && hours>=0 ) ) && ( ( mins>=0 ) && ( mins<60 ) )) {
			// Check for Noon and Midnight first
			if (( hours==12 ) && ( mins==0 ))
				System.out.println("Noon");
			else if (( hours == 0 ) && ( mins==0 ))
				System.out.println("Midnight");
			// Check for AM/PM based on hours
			else if ( hours < 12 )
				System.out.println(hours + ":" + mins + " AM");
			else
				System.out.println(hours-12 + ":" + mins + " PM");
		}
		else {
			System.out.println("You need to enter a valid time : Hours followed by Minutes");
		}
	}
}
