/**   <h1>Doc.java</h1> <p>
 *
 *   This is just an exercise for Javadoc <p>
 *   
 *    Mike Twohig
 *
 * @author Mike Twohig
 * @version 1.0
 * @since 2015-11-05
 */

public class Doc {
   /**
   * Application entry point
   *
   * @param args
   *          array of command-line arguments passed to this method
   */
    public static void main (String args []) {
        /** This is the main method */
        try {
                System.out.println("The name of the program is " + args[0]);
            } catch (Exception e) {
                System.out.println("you need to Enter and Argument to the program!");
        }
    }
}	
