/* 
 * Exercise 3
*/

import java.util.Scanner;

public class Adder {
    public static void main(String[] args) {
        int num1,num2,num3;
	System.out.println("Please Enter a two numbers");
    	Scanner sc = new Scanner(System.in);
	num1 = sc.nextInt();
	num2 = sc.nextInt();
	num3 = num1+num2;
	System.out.println(num1 + " + " + num2 + " = " + num3);
	}
}
