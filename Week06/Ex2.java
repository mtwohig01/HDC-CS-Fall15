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
