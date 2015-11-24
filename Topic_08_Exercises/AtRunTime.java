/* 
 * Exercise 1
 * Try / Catch Example for integers and arrays
*/

import java.io.*;
import java.util.Scanner;

public class AtRunTime {
    
    public static void main(String args[]){
        String [] sentance = { "the", "cat", "sat", "on", "the", "mat" };
        System.out.println("Please Enter a valid number...");
        Scanner sc = new Scanner(System.in);
        try {
            int i = sc.nextInt();
            try {
                System.out.println(sentance[i]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Array is out of Bounds : "+e);
            }
        } catch (Exception e) {
            System.out.println("Invalid value!");
        
        }
    }
}