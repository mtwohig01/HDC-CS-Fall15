/* 
 * Exercise 2
*/

import java.util.Scanner;

public class Doubler {
    public static void main(String[] args) {
        int num1;
	System.out.println("Please Enter a number");
    	Scanner sc = new Scanner(System.in);
	num1 = sc.nextInt();
	System.out.println("2 x " + num1 +  " = " + num1*2);
	}
}
