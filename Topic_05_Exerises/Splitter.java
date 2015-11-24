/* 
 * Exercise 2
 * Reads in user input and splits the sentance into words on seperate lines
*/

import java.util.Scanner;

public class Splitter {
	public static void main(String[] args) {
		// Get the Sentance from the Useri
		System.out.println("Please Enter a Sentance");
		Scanner sc = new Scanner(System.in);
		String userInput = sc.nextLine();
		String [] words = userInput.split(" ");
		for ( int i=0; i<words.length; i++ ) {
			System.out.println( i + " : " + words[i] );
		}
		sc.close();
	}
}
