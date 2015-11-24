/* 
 * Exercise 4A
 * Description : Animal Example ... 
*/

import java.util.Scanner;

public class Ex4PartA {
	public static void main(String[] args) {
		// Read in the Result from the user
		System.out.println("Please Enter the number of the Chinese Month (0-11)");
    		Scanner sc = new Scanner(System.in);
		int result=sc.nextInt();
		// Decide which month and print appropriately
		if ((result >= 0) && (result<12)) {
			switch (result) {
				case 0:
					System.out.println("Monkey");
					break;
				case 1:
					System.out.println("Rooster");
					break;
				case 2:
					System.out.println("Dog");
					break;
				case 3:
					System.out.println("Pig");
					break;
				case 4:
					System.out.println("Rat");
					break;
				case 5:
					System.out.println("Ox");
					break;
				case 6:
					System.out.println("Tiger");
					break;
				case 7:
					System.out.println("Rabbit");
					break;
				case 8:
					System.out.println("Dragon");
					break;
				case 9:
					System.out.println("Snake");
					break;
				case 10:
					System.out.println("Horse");
					break;
				case 11:
					System.out.println("Sheep");
					break;
			}
		}
		// Error Message if it's outside the range
		else
			System.out.println("Need to Enter a valid Month (0-11)");
	}
}

