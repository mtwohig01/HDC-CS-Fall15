/* 
 * Exercise 10
 * Work with Arrays
*/

import java.util.Scanner;

public class Multiples {
    public static void main(String[] args) {
	int [] nums = {12, 3, 15, 17, 11, 11, 30, 17, 19, 23};
	for (int i=0;i<nums.length;i++) {
	    if ((nums[i]%3)==0) {
		System.out.print(nums[i]+ " ");
		}
	    }	
	System.out.println(" ");
	}
    }   
