/* 
 * Exercise 3
 * Very Simple Method example passing in an integer array
*/

public class ArrayDisplay {
	// define the shout method
	public static void arrayDisplay( int [] myarray ) {
		for (int i=0; i<myarray.length; i++) {
			System.out.println( myarray[i] );
		}
	}

	public static void main(String[] args) {
		int [] thearray= { 1, 2 , 3 , 4 , 5 , 6 , 7 , 8 , 9 , 10 };
		arrayDisplay( thearray );
	}
}
