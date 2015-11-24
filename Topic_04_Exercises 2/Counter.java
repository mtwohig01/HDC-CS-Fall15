/* 
 *   Exercise 3
 *   Enter 2 numbers and display numbers inbetween;
 *   but if the number of #'s to be displayed is greater than
 *   20 then report an error
 */

import java.util.Scanner;

public class Counter {
	public static void main(String[] args) {
	int lower,higher,count,i=0;
	Scanner sc= new Scanner(System.in);
	System.out.println("Please Enter Two Integer Numbers in assending order");
	lower=sc.nextInt();
	higher=sc.nextInt();
	count=lower;
	if ((higher-lower)<20) {
		while (i<20) {
			System.out.print(count + " ");
			count++;
			i++;
			}
		System.out.println(" ");
		}
	else {
		System.out.println("Error: you need to Enter 2 numbers whose difference is less than 20");
		}
	}
}
