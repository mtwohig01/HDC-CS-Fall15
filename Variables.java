/* 
 * Exercise 3
*/

public class Variables {
    public static int sum(int x, int y) {
	return x+y;
    }
    public static int difference( int x, int y) {
	return x-y;
    }
    
    public static int product( int x, int y) {
        return x*y;
    }
    public static int average_num() {
	int primes[] = {1,2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,61};
	int primes_total=0;
	for (int i = 1; i<=10 ; i++ ) {
		// 1 is not a prime ! so we dont start at 0 , i didnt know 1 wasnt prime.
		primes_total = primes[i] += primes_total ;
		}
	return primes_total;
	}
    public static void main(String[] args) {
        int x = 123456;
	int y = 99;
	System.out.println("sum =  " + sum(x,y));
	System.out.println("difference = " + difference(x,y));
	System.out.println("product = " + product(x,y));
 	System.out.println("average of ten primes = " + average_num());
	}    
}
