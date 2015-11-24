/* 
 * Exercise 9
 * Work with Arrays
*/

import java.util.Scanner;

public class ArrayTheSecond {
	public static void main(String[] args) {
		int [] nums = new int[5];
		nums[0] = 2;
		nums[1] = 3;
		nums[2] = 5;
		nums[3] = 7;
		nums[4] = 11;
		for (int i=0;i<nums.length;i++) {
			System.out.println("The value at index " + i + " is " + nums[i]);
			}	
		}
}
