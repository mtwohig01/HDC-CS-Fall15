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
		
		switch(num1) {
			case 1:
				System.out.print(" ");
				break;
			case 2: 
				System.out.print("  ");
				break;
			case 3: 
				System.out.print("   ");
				break;
			case 4: 
				System.out.print("    ");
				break;
		}
		sc.skip(" ");
		str1 = sc.nextLine();
		System.out.println(str1);
	}
	else
		System.out.println("Error, need to enter a number between 0 and 4"); 
	}
}
