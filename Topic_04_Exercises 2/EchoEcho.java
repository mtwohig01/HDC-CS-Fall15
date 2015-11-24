/* 
 * Exercise 5
 * EchoEcho
*/

import java.util.Scanner;

public class EchoEcho {
    	public static int Ask() {
		Scanner sc = new Scanner(System.in);
		System.out.println("How Many Times to Display");
		int num_of_times=sc.nextInt();
		if (num_of_times >-1) {
			for (int i=0;i<num_of_times;i++) {
				System.out.println("HelloJava");
				}
			}		
		return num_of_times;
		}
	public static void main(String[] args) {
		int num_of_times;
		num_of_times=Ask();
		while (num_of_times !=-1) {
			num_of_times=Ask();
			}
		}
}
