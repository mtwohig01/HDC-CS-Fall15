/* 
 * Exercise 6
*/

 
public class Sum {
    
    public static int cal_sum(int n) {
	return (n*(n+1)/2);
    }
    public static void main(String[] args) {
        double x = 25;
	System.out.println("Sum1 = " + cal_sum(25));
	System.out.println("Sum2 = " + cal_sum(50));
	}    
}
