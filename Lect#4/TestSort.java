/**  Sort.java
  *  Test the Sort Class
  *  @author Mike Twohig
  *  @version 1.0
  */

import org.junit.Assert;


public class TestSort {
    /** Test the Sort.sort method */
    public static void testSort() {
        String [] input = {"a", "huge", "tiny", "scorpion" };
        Sort.sort(input);
        String [] expected = {"a", "huge", "scorpion", "tiny" };
        
        // Test to see if input is the same thing as expected
        // If not print something useful to the programmer
        org.junit.Assert.assertArrayEquals(expected,input);
    }
    
    /** Test the Sort class's methods */
    public static void main(String [] args) {
        testSort();
    }
}