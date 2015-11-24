/* 
 * Exercise 7
*/

import java.util.Scanner;

public class Indenter {
    public static void main(String[] args) {
        String str1=null;
	short num1;
	System.out.println("Please Enter a number and a string");
    	Scanner sc = new Scanner(System.in);
	num1 = sc.nextShort();
	if( (num1<5) && (num1>=0)){
		while(num1--!=0) {
			System.out.print(" ");
		}
		sc.skip(" ");
		str1 = sc.nextLine();
		System.out.println(str1);
	}
	else
		System.out.println("Error, need to enter a number between 0 and 4"); 
	}
}
