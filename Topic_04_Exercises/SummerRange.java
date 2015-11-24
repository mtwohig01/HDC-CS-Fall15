/* 
 *   Exercise 4
 *   Enter 2 numbers and display the sum of all the numbers inbetween;
 *   but if the number of #'s to be displayed is greater than
 *   7 then report an error
 */

import java.util.Scanner;

public class SummerRange {
	public static void main(String[] args) {
	int lower,higher,count,i=0,temp;
	Scanner sc= new Scanner(System.in);
	System.out.println("Please Enter Two Integer Numbers in assending order");
	lower=sc.nextInt();
	higher=sc.nextInt();
	count=lower;
	// hold onto the previous value
	temp=count;
	if ((higher-lower)<7) {
		while (i<(higher-lower)) {
			temp ++;
			count = count+temp;
			i++;
			}
		System.out.println(count);
		}
	else {
		System.out.println("Error: you need to Enter 2 numbers whose difference is less than 7");
		}
	}
}
