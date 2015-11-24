/*
 *  Exercise 7
 *  Groups email providers from a list of email addresses
 *  Mike Twohig
 */

/*  Note: The code in the example/exercise is incorrect in the assignment of the String array
 *        the String emails[] = ... etc below is the correct way to assign an array
 *	 the notes are misleading
 */


public class GroupBy {
	public static void main(String[] args) {
		// Assign the email addresses
		String emails[] = {"karl.oleary@gcc.ie", "bruce@hotmail.com",
		"john@hotmail.com", "user123@gmail.com", "jake@hotmail.com",
		"info@nsa.gov.com", "enda@gov.ie" };
		// setup a counter to check if strings are equal
		int [] count = new int [7];
		// setup flags if the strings are equal and another flag so not to print out twice
		int foundflag=0, alreadyfound=0;
		// cycle through the list of emails
		for (int i=0; i< emails.length; i++) {
			// look for the @ sign
			int newindex1=emails[i].indexOf("@");
			int lastindex1=emails[i].length();
			// get the start and end of the strings you want to compare - the domain names
			String string1=new String (emails[i].substring(newindex1,lastindex1));
			// initialize the counters
			count[i]=0;
			foundflag=0;
			// setup a second loop to compare each address to each other address - 2d array
			for (int j=0; j<emails.length; j++) {
				// string2 is the inner loop assignments 
				int newindex2=emails[j].indexOf("@");
				int lastindex2=emails[j].length();
				String string2=new String (emails[j].substring(newindex2,lastindex2));
				// Compare every element to every element except its own
				if ((i!=j) && (string1.equals(string2) ))  {
					count[i]++;
					foundflag=1;
				}
				
			}
		// print the single occurances
		if (foundflag==0)
			System.out.println( string1 + " " + 1 );
		// only print it out once
		else if (alreadyfound!=1) {
			System.out.println( string1 + " " + (count[i]+1) );
			alreadyfound=1;
			}
		
		}	
	}
}
