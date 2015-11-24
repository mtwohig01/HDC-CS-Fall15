/* 
 * Exercise 2
 * For Loops to display first 100 numbers in a 10x10 array;
*/

public class Numbers {
    public static void main(String[] args) {
	int count=1;
	for(int i=0;i<10;i++) {
		for (int j=0;j<10;j++) {
			if(i==0) {
				System.out.print(count + "  ");
				}
			else {
				System.out.print(count + " ");
				}
			count++;
			}
		System.out.println(" ");
		}
	}

}
