/* 
 * Exercise 4
*/

import static java.lang.Math.PI;
 
public class Shapes {
    
    public static double area_of_rect(int x, int y) {
	return x*y;
    }

    public static double area_of_square(int x) {
	return x*x;
    }
	
    public static double area_of_circle(int x) {
	return x*x*Math.PI;
    }

    public static double shape1( double x) {
        return area_of_circle(7)+(area_of_square(7)/4)-(area_of_circle(7)/4);
    }
 
    public static double shape2( int x, int y) {
	return area_of_square(4) + 4 * area_of_rect(4,3);
    }
    
    public static double shape3( int x, int y) {
        return (area_of_circle(7)/2)-(area_of_circle(4)/2);
    }
    public static void main(String[] args) {
        int x = 123456;
	int y = 99;
	System.out.println("shape1 =  " + shape1(7));
	System.out.println("shape2 = " + shape2(x,y));
	System.out.println("shape3 = " + shape3(x,y));
	}    
}
