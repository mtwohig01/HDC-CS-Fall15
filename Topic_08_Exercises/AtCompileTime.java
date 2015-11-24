/* 
 * Exercise 2
 * Try / Catch Example for div by zero
*/

import java.util.Scanner;

public class AtCompileTime {
    
    public static void main(String args[]){
        int x=6,y=0;
        System.out.println("Please Enter in a number");
        Scanner sc = new Scanner(System.in);
        try {
            y = sc.nextInt();
            try {
                int z=x/y;
                System.out.println(z);
            }
            catch (ArithmeticException e) {
                System.out.println("You just tried to divide 6 by 0");
            }
        }
        catch (Exception e) {
            System.out.println("Invalid value!");
        }
    }
}