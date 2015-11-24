/* 
 *   Exercise 2A
 *
 *   Write a method to calculate the area of a triangle .
 *
 *   Mike Twohig
 */

// bring in the math class;
import java.lang.Math;

public class Ex2PartA {
	// define the calculate Triangle class - Heron's Formula
    public static double calculateTriangleArea(double a , double b, double c ) {
        double s = (a+b+c)/2.0;
        double result = Math.sqrt( (s * (s-a)) * (s-b) * (s-c) );
        return result;
    }
    
    public static void main(String[] args) {
        
        // Test the area problem
        // picke 3 random numbers;
        double L1 = 18.0;
        double L2 = 21.0;
        double L3 = 35.0;
        System.out.println("The area of the triangle is " + calculateTriangleArea(L1,L2,L3) );
    }
}
