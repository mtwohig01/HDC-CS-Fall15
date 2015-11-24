/* 
 * Exercise 13
 * More Array stuff
*/

import java.util.Scanner;

public class Summerer {
    public static void main(String[] args) {
        int [] nums = new int[10];;
	int i=0,sum=0;
	System.out.println("Please Enter in 10 numbers");
	Scanner sc = new Scanner(System.in);
    	
	while(i < 10) {
		nums[i] = sc.nextInt();
		sum=sum+nums[i];
		if (nums[i]==-1) {
			sum++;
			break;
			}
		
		i++;
		}
	System.out.println("The Sum is " + sum );
	}
}
