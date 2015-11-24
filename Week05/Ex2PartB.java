/* 
 *   Exercise 2B
 *
 *   Write a method print n row of a triangle of stars.
 *
 *   Mike Twohig
 */

public class Ex2PartB {

    // define the class
    public static void printStarryTree(int levels) {
        int j,i,k;
        // Build the Tree
        // First set up a counter to cycle through all the levels
        for ( i=0; i<=levels; i++ ){
            // Next set up a counter counting down to print the spaces
            for ( k=levels-1; k>=i; k-- ) {
                System.out.print(" ");
            }
            // and then a 2nd loop counting up to print the stars
            for ( j=0; j<i; j++ ){
                System.out.print("* ");
            }
            // finally a line return to print out the next line in the next
            // iteration
            System.out.println(" ");
        }
    }
    
    public static void main(String[] args) {
        int numoflevels=35;
        System.out.println("\nThe Number of levels for the tree is " + numoflevels);
        printStarryTree( numoflevels );
    }
}
