/* 
 * Exercise 6
*/

import java.util.Scanner;

public class GoCompare {
    public static void main(String[] args) {
        int num1,num2,num3;
	System.out.println("Please Enter a two numbers");
    	Scanner sc = new Scanner(System.in);
	num1 = sc.nextInt();
	num2 = sc.nextInt();
	if (num1==num2){
		System.out.println(num1 + " is equal to " + num2);
		}
	else if (num1>num2) {
		System.out.println(num1 + " is greater than " + num2); 
		}
	else {
		System.out.println(num1 + " is less than " + num2);
		}
	}
}
