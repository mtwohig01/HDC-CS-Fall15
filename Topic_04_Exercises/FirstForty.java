/*
 *  Exercise 6 - First 40 Primes
 */

import java.util.*;
 
class FirstForty
{
   public static void main(String args[])
   {
      int status = 1, num = 3, printcount=0;
      for ( int count = 2 ; count <=100 ;  )
      {
         for ( int j = 2 ; j <= Math.sqrt(num) ; j++ )
         {
            if ( num%j == 0 )
            {
               status = 0;
               break;
            }
         }
         if ( status != 0 )
         {
            if (printcount<40) {
		System.out.print(num + " ");
		printcount++;
		count++;
		}	
         }
         status = 1;
         num++;
      }         
   }
}
