/* 
 * Exercise 8
 * Work with Arrays
*/

import java.util.Scanner;

public class ArrayTheFirst {
	public static void main(String[] args) {
		int [] nums = new int[5];
		nums[0] = 2;
		nums[1] = 3;
		nums[2] = 5;
		nums[3] = 7;
		nums[4] = 11;
		System.out.println("The Length of nums array is " + nums.length);
		// Assume index 2 is the 2nd entry into the array (entry-1 = 1)
		// Assume index 5 is the 5th entry into the array (entry-1 = 4)
		// If I try to point to num[5] I will get an exception since the
		// memory is not allocated
		System.out.println("The value at index 2 is " + nums[1]);
		System.out.println("The value at index 5 is " + nums[4]);
			
		}
}
