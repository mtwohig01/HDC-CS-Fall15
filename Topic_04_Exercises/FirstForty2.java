/* 
 * Exercise 6
 * Print first 40 Primes
 * Based on Mersenne primes
 * Reference:
 * https://cs.uwaterloo.ca/~alopez-o/math-faq/mathtext/node10.html
 * 2^p-1
 */


public class FirstForty {
	public static void main(String[] args) {
		for( int i=1;i<=10 ; i++ ) {
			int count=0;
			for ( int num=i; num>1; num-- ) { 
				if (i%num == 0)
					count=count+1;
			
				System.out.println(i);
					
				}
			}
	}
}
