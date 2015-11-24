/* 
 * Exercise 1
 * Description : True or Fales - Boolean Expressions ... 
 * Mike Twohig
 */

public class Ex1PartA {
	public static void main(String[] args) {
		System.out.print("2*3=6 ? ");
		// check first simple boolean expression
		if ( 2*3==6 )
			System.out.println("True");
		else
			System.out.println("False");
		
		System.out.print("4*12-8 not equal to 44 ? ");
		// check 2nd boolean expression with bracket notation and negation
		if ( (4*12-8)!=44 ) 
			System.out.println("True");
		else
			System.out.println("False");
		System.out.print("4*5-12=12 ? ");
		// similar to previous without negation - test eqaulity
		if ( (4*5-12)==12 )
			System.out.println("True");
		else
			System.out.println("False");
		System.out.print("(21+7) / 4 >= 3%2 + 6 ? ");
		// more complicated expression using the mod operator (evenly divides)
		// and brackets 
		if ( ((21+7)/4) >= (3%2 + 6) )
			System.out.println("True");
		else
			System.out.println("False");
		}
	
	}
