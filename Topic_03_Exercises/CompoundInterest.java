/* 
 * Exercise 5
*/

import static java.lang.Math.pow;

public class CompoundInterest {
    public static float cal_interest(int p, float r, short t) {
	return (p * (float)Math.pow((1+r),t));
	}

    public static void main(String[] args) {
        
	int principle;
	float rate;
	short term;

        System.out.println("P    R   T I");	
	principle=1000;
	rate=(float)2.5;
	term=3;
	System.out.println(principle + " " + rate + " " + term + " " + cal_interest(principle,rate,term));
	
	principle=500;
	rate=(float)3.75;
	term=8;
	System.out.println(principle + " " + rate + " " + term + " " + cal_interest(principle,rate,term));
	
	principle=5000;
	rate=(float)1.5;
	term=5;
	System.out.println(principle + " " + rate + " " + term + " " + cal_interest(principle,rate,term));
	
	}
}
