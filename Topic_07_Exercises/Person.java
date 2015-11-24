/* 
 * Exercise 2
 * Person Example calling a class from a class.
*/

import java.util.Scanner;

public class Person {
    
    public static void main(String args[]){
        
        String fname = "Mike";
        String sname = "Twohig";
        
        display(fname,sname);
        
        Persontester Persontester = new Persontester();
        
        Persontester.Person();
    }

    public static void display ( String fname, String sname ) {
        System.out.println("The Christian name is " + fname);
        System.out.println("The Surname is " + sname);
    }
    
    public static class Persontester {
    
        public void Person(){
            System.out.println("Please Enter your Christian name");
            Scanner sc = new Scanner(System.in);
            String firstname = sc.next();
            System.out.println("Please Enter your Surname");
            String secondname = sc.next();
            display(firstname,secondname);
        }
    }
}