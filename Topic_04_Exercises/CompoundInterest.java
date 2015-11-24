/* 
 * Exercise 7
 * Compound Interest calculation - number of years
*/

import static java.lang.Math.pow;

public class CompoundInterest {

    public static float cal_interest(float p, float r, float t) {
	return (p * (float)Math.pow((1+r),t));
	}

    public static float cal_time(float PV, float I, float FV) {
	return ((float) (Math.log10(FV/PV)) / (float)(Math.log10(1+I)));
	}

    public static void main(String[] args) {
        
	float principle,rate,amount,initial;
	principle=(float)1010;
	rate=(float)0.0025;
	amount=(float)5500;
	initial=principle;
	int term=1,term_cal;
	float term2;
	while (principle<=amount)
		principle=cal_interest(principle,rate,term++);
	System.out.println("Starting at " + initial + " it takes " + term + " years to get " + amount + " @ rate " + rate*100 + " %");
	term2=cal_time(principle,rate,amount);
	System.out.println("Starting at " + initial + " it takes " + term2 + " years to get " + amount + " @ rate " + rate*100 + " %");
	}
	
}
