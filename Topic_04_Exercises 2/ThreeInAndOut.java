/* 
 * Exercise 3
*/

import java.util.Scanner;

public class ThreeInAndOut {
    public static void main(String[] args) {
        int [] nums = new int[3];;
	System.out.println("Please Enter three numbers");
    	Scanner sc = new Scanner(System.in);
	nums[0] = sc.nextInt();
	nums[1] = sc.nextInt();
	nums[2] = sc.nextInt();
	for (int i=0;i<nums.length;i++) {
		System.out.print( nums[i] + " " );
		}
	System.out.println(" ");
	}
}
