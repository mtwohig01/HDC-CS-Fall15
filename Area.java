/* 
 * Exercise 5
 * Michael Twohig
 */

import static java.lang.Math.PI;
 
public class Area {
    
    public static double area_of_slice(double x) {
	return x*x*Math.PI/6;
    }

    public static double area_4_slices( double x) {
        return 4*area_of_slice(33);
    }
 
    public static void main(String[] args) {
        int x = 123456;
	int y = 99;
	System.out.println("area of slice  =  " + area_of_slice(25) + " cm");
	System.out.println("4 slices with 33cm  = "+ area_4_slices(33) + " cm");
	}    
}
