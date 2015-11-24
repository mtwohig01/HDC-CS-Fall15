/* 
 *   Exercise 5
 *   Lists all the vowels in a sentance
 *   Michael Twohig
 */

public class Vowels {

	public static int countVowels( String word ) {
		int count=0;
		for (int i = 0; i < word.length(); i++)
			if ( (word.charAt(i)=='A') ||
			     (word.charAt(i)=='E') ||
			     (word.charAt(i)=='I') ||
			     (word.charAt(i)=='O') ||
			     (word.charAt(i)=='U') ||
			     (word.charAt(i)=='a') ||
			     (word.charAt(i)=='e') ||
			     (word.charAt(i)=='i') ||
			     (word.charAt(i)=='o') ||
			     (word.charAt(i)=='u') ) {
				count++;
			}
		return count;
	}


	public static void main(String[] args) {
		// generate a new string and assing the sentance to it.
		String thecat = new String("The cat needs a nap"); 
		System.out.println("Prints out the vowels in \"The cat needs a nap\"");
		for ( int i = 0; i < thecat.length() ; i++) {
			// check for the capital and lower case vowels
			if  (   (thecat.charAt(i)=='A') ||
				(thecat.charAt(i)=='E') ||
				(thecat.charAt(i)=='I') ||
				(thecat.charAt(i)=='O') ||
				(thecat.charAt(i)=='U') ||
				(thecat.charAt(i)=='a') ||
				(thecat.charAt(i)=='e') ||
				(thecat.charAt(i)=='i') ||
				(thecat.charAt(i)=='o') ||
				(thecat.charAt(i)=='u')     ) {
					// Prints the vowel
					System.out.print(thecat.charAt(i) + " ");
			}
			
		}
		// print a new line
		System.out.println(" ");

		String [] words =thecat.split(" ");
		for ( int j = 0; j < words.length ; j++) {
			int numofvowels = countVowels( words[j] );
			if (numofvowels == 1) {
				System.out.println("[" + j +"] " + words[j] + " : " + numofvowels + " vowel");
			}
			else if (numofvowels>1) {
				System.out.println("[" + j +"] " + words[j] + " : " + numofvowels + " vowels");
			}
			else {
				System.out.println("[" + j +"] " + words[j] + " : " + " no vowels");
			}
	
		}
	}
}
