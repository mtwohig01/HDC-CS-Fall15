/* 
 * Exercise 3
 * Reads in user input and splits the sentance into words on seperate lines
*/

import java.util.Scanner;

public class Upper {
	public static void main(String[] args) {
		// Get the Sentance from the Useri
		System.out.println("Please Enter a Sentance");
		Scanner sc = new Scanner(System.in);
		String userInput = sc.nextLine();
		String [] words = userInput.split(" ");
		for ( int i=0;i<words.length;i++) {
			if ( (words[i].equals("and") ) || (words[i].equals("on"))
			 || ( words[i].equals("of") ) || (words[i].equals("in")))
				System.out.print( words[i].toUpperCase() + " ");
			else
				System.out.print( words[i] + " " );
		}
		System.out.println(" ");
	}
}
