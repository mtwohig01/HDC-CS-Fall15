/* 
 * Calculate Pi
 * Michael Twohig
 * REF : https://en.wikipedia.org/wiki/Wallis_product
 *
 */

import static java.lang.Math.PI;
 
public class PiOver2 {
    
    public static double Math_Pi() {
	return Math.PI;
    }

    public static double Custom_Pi() {
        double piover2=1;
	for (int i = 2; i<50000 ; i=i+2) {
		piover2=piover2 * ( (double)(i*i) / (( i-1) * (i+1) ) );
	}
	return piover2*2;
    }
 
    public static void main(String[] args) {
	System.out.println("The Standard Lib PI number   =  " + Math_Pi() );
	System.out.println("The Wallis formula PI number =  " + Custom_Pi() );
	}    
}
