/**
 * <H1>Exercise 1</H1><p>
 * 
 * Write a program to declare and create an array capable of
 * containing 20 integers and fill the array you created with the frist 20 even integers.
 * And then display the contents of the array. <p>
 * Mike Twohig
 */

public class Ex1 {
    
    public static void main(String[] args) {
        
        // Define the leap years as an array
        int myArray [] = new int[20];
        int num=0;
        for (int i = 0 ; i < myArray.length; i++) {
            num=num+2;
            myArray[i]=num;
            System.out.println(myArray[i]);
        }
    }
}
/**
 *  <H1>Exercise 2</H1><p>
 * 
 *  Write a program to define a static method to return
 *  the average of the floating point numbers in a given array.<p>
 *  Write a program to test your method.<p>
 *  @author Mike Twohig
 *  @version 1.0
 */

public class Ex2 {
    /**
     *  Method name : average<p>
     *  Returns the average of a floating point array
     *  @param nums declares the floating point array to be averaged
     *  @return the average of nums array
     */
     public static float average(float [] nums) {
        float sum=0.0f;
        for (int i=0;i<nums.length;i++) {
            sum=sum+nums[i];
        }
        return (sum/nums.length);
    }
    public static void main(String[] args) {
        
        // Declare and define the array to be checked
        float myArray [] = {10.1114564111f, 21.22098832f, 34.229859348523f, 44.4421312444f, 53.5553455f};
        // Call the method and print it out
	System.out.println(average(myArray));
    }
}
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
