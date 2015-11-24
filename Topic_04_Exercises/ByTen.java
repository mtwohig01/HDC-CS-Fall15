/* 
 * Exercise 11
 * Work with Arrays
*/

public class ByTen {
    public static void main(String[] args) {
	int [] nums = new int[10];
	// assign the array with ix10;
	for (int i=0;i<nums.length;i++) {
	    nums[i]=i*10;
	    }
	// display the array
	for (int j=0;j<nums.length;j++) {
	    System.out.print(nums[j] + " ");
	    }	
	System.out.println(" ");
	}
    }   
