/**
 * <H1>Exercise 1</H1><CR>
 * 
 * Write a program to declare and create an array capable of
 * containing 20 integers and fill the array you created with the frist 20 even integers.
 * And then display the contents of the array. <CR>
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
