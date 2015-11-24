/* 
 *   Exercise 1A
 *   Write a method called printLeap(y) that takes a year number as argument and
 *   prints it if it is a leap year, otherwise it ignores it. Write a program that tests this
 *   method by reading a list of year numbers and prints only the leap years on the
 *   list.
 *
 *   Mike Twohig
 */

public class Ex1PartA {
	
    public static void printleap (int y ) {
        if ( (y%4) == 0 )
            System.out.println( y + " is a leap year");
    }
    
    public static void main(String[] args) {
        
        // Define the leap years as an array
        int years [] = { 1999,2000, 2004 ,2008, 2012, 2016, 2015 };
        // cycle through the years and check if its a leep year
        // the printing of the leap year is done in the method.
        for (int i = 0; i < years.length ; i++ ) {
            printleap(years[i]);
        }
	
	}
}
