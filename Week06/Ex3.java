/** Exercise 3 <p>
 *  Suppose that you define an integer array, numbers <p>
 *  int[] numbers = {5,6,2,3,4,1,5,3,2,19,90,23,78}; <p>
 *  Use the method System.arraycopy copy an array of integers, numbers,<b>
 *  to a new array named numbersCopy, and use the method Arrays.sort <b>
 *  sort the array, numbersCopy, and display the contents of the array, numbersCopy.
 *  @author Mike Twohig
 *  @version 1.0
 */

import java.util.Arrays;

public class Ex3 {
    /**
     *
     * Method to print the contents of the array comma delimited
     * @param numbers array to be printed
     *
     */

    
    public static void printArray(int [] numbers) {
        // Print the First one.
        System.out.print(numbers[0]);
        // Print the rest starting at 1 to lenght-1
        // because only needed length-1 number of comma's)
        for (int i=1; i<numbers.length;i++) {
            System.out.print(", " + numbers[i]);
        }
        // new line;
        System.out.println("");
	}
    public static void main(String[] args) {
        
        // Declare and define the array as per the exercise
        int[] numbers = {5,6,2,3,4,1,5,3,2,19,90,23,78};
        int[] numbersCopy = new int [numbers.length];
        // Call the method to copy the array from start to end.
        System.arraycopy(numbers,0,numbersCopy,0,numbers.length);
        
        // Print out the arrays
        System.out.print("The Original Array is ");
        printArray(numbers);
        System.out.print("The Copied Array is   ");
        printArray(numbersCopy);
        
        // Sort the array
        Arrays.sort(numbers,0,numbers.length);
        Arrays.sort(numbersCopy,0,numbersCopy.length);

        // Print out the sorted arrays
        System.out.print("The Sorted Original Array is ");
        printArray(numbers);
        System.out.print("The Sorted Copied Array is   ");
        printArray(numbersCopy);
        
    }
}
