/* 
 *   Exercise 1A
 *   Write a method to print the first n rows of a table .
 *
 *   Mike Twohig
 */

import java.util.Scanner;

public class Ex1PartB {
	// define the print rows class
    public static void printrows(int row, int [] nums ) {
            for (int i=0;i<row;i++) {
                // i defined 0 in the array if its empty
                // and only print out if its not zero
                if (nums[i]!=0)
                    System.out.print( nums[i] + " ");
            }
        // in the outer loop print out a carrage return
        System.out.println(" ");
    }
    
    public static void main(String[] args) {
        
        // Define the 2d array
        int [] [] nums = {{2,0,0,0},{2,4,0,0},{2,4,6,0},{2,4,6,8}};
        // get the number of rows
        System.out.println("Please Enter number of Rows");
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        // print out the rows
        // I only defined 4 rows ...
        if (row <= 4) {
            for (int i=0; i < row; i++){
                printrows(row, nums[i]);
            }
        }
    }
}
