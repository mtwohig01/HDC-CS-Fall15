/* 
 * Exercise 6
*/

import static java.lang.Math.pow;
 
public class Interest {
    
    public static double cal_interest(double p, double r, double t) {
	return (p * Math.pow((1+r),t));
    }
    public static void main(String[] args) {
        double p = 1000;
	double r = 0.03;
	double t = 4;
	System.out.println("Interest Earned on 1000 euros @ 3% for 4 years =  " + cal_interest(p,r,t));
	p=10000;
	r=0.025;
	t=17;
	System.out.println("Interest Earned on 10,000 euros @ 2.5% for 17 years =  " + cal_interest(p,r,t));
	}    
}
