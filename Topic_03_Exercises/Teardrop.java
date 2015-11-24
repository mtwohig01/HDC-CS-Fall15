/*
 * Exercise 4
*/

import static java.lang.Math.PI;
import java.util.Scanner;

public class Teardrop {
    
    public static double area_of_square(int x) {
	return x*x;
    }
	
    public static double area_of_circle(int x) {
	return x*x*Math.PI;
    }

    public static double shape1( int r) {
        return (area_of_square(r) + 0.75*area_of_circle(r));
    }
 
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Please enter a radius");
	int r = sc.nextInt();	
	System.out.println("Area of Teardrop =  " + shape1(r));
	}    
}
