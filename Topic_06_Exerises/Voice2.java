/* 
 * Exercise 2
 * Very Simple Method example passin in an integer
*/

public class Voice2 {
	// define the shout method
	public static void shout( int repeat ) {
		for (int i=0; i<repeat; i++) {
			System.out.println("Hello Java");
		}
	}

	public static void main(String[] args) {
		// call the shout method passing in an integer = 10
		shout(10);
	}
}
