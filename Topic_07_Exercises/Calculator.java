/* 
 * Exercise 3
 * Calculator Example - add, subtract, multiply and divide
*/

import java.util.Scanner;

public class Calculator {
    
    public static int mikes_add(int a, int b) {
        return (a+b);
    }
    
    public static int mikes_subtract(int a, int b) {
        return (a-b);
    }
    
    public static double mikes_multiply(int a, int b) {
        return (double)(a*b);
    }
    
    public static float mikes_divide(int a, int b) {
        return ((float)a/b);
    }
 
    public static void CalculatorTester() {
        int a=100;
        int b=101;
        System.out.println( a + " + " + b + " = " + mikes_add(a,b) );
        System.out.println( a + " - " + b + " = " + mikes_subtract(a,b) );
        System.out.println( a + " * " + b + " = " + mikes_multiply(a,b) );
        System.out.println( a + " / " + b + " = " + mikes_divide(a,b) );
    }
    
    public static void main(String args[]){
        int a = 10;
        int b = 11;
        System.out.println( a + " + " + b + " = " + mikes_add(a,b) );
        System.out.println( a + " - " + b + " = " + mikes_subtract(a,b) );
        System.out.println( a + " * " + b + " = " + mikes_multiply(a,b) );
        System.out.println( a + " / " + b + " = " + mikes_divide(a,b) );
        CalculatorTester();
    }
}