/* 
 * Exercise 14
 * More Array stuff
*/

import java.util.Scanner;

public class MaxMinMean {
    public static void main(String[] args) {
        int [] nums = new int[5];;
	int i=0,j,max,min;
	float mean=0;
	System.out.println("Please Enter in 5 numbers");
	Scanner sc = new Scanner(System.in);
    	
	while(i < 5) {
		nums[i] = sc.nextInt();
		mean=mean+(float)nums[i]/5;
		i++;
		}
	max=nums[0];
	min=nums[0];
	
	for (j=1;j<5;j++) {
		if ( nums[j] > max )
			max=nums[j];
		if ( nums[j] < min )
			min=nums[j];
		}	
	System.out.println("The max is " + max );
	System.out.println("The min is " + min );
	System.out.println("The mean is " + mean );
	}
}
