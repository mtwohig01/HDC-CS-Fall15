/* 
 * 	Exercise 8
 *	Sum and display an array using a method 
 *	Mike Twohig
 */


public class CompoundInterest {
	
	// define the method
	public static float calculateReturn( float principle, float rate, int year ) {
		for ( int i =1 ; i < year ; i++ ) {
			principle = (float) principle * (float)Math.pow( (1.0+rate),(float)year );
		}
		return principle;
	}
	public static void main(String [] args) {
		float principle=1000;
		float rate=(float)0.02;
		int term=5;

		System.out.println("The interest of " + principle + " after " + term + " years is " + calculateReturn(principle,rate,term) + " with interest rate " + rate*100 + "%");
	}
}
