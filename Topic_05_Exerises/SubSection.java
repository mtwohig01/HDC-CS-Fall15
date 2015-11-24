/* 
 * Exercise 4
 * Reads in start index and end indext and prints the sentance
 * from start to end
*/

import java.util.Scanner;

public class SubSection {
	public static void main(String[] args) {
		// Get the Sentance from the Useri
		System.out.println("Please Enter start and End");
		Scanner sc = new Scanner(System.in);
		
		int startPos = sc.nextInt();
		int endPos = sc.nextInt();
		String sentance = "The cat sat on the mat";
		String [] words = sentance.split(" ");
		for ( int i=startPos; i<endPos; i++ ) {
			// Need to check if within the bounds of the array
			if (i<words.length) {
				System.out.print(words[i] + " ");
			}
		}
		System.out.println(" ");
	}
}
