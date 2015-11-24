/* 
 * Exercise 8 - Casting
*/

 
public class Casting {
    
	public static void main(String[] args) {
        System.out.println("byte short int long float double char END");
	
	byte my_num = 2;
	System.out.println("byte:");	
	System.out.print((byte)my_num + " " + (short)my_num + " ");
	System.out.print((int)my_num + " " + (long)my_num + " ");
	System.out.print((float)my_num + " " + (double)my_num + " ");
	System.out.println((char)my_num + " END");

	short my_num2=333;
	System.out.println("short:");	
	System.out.print((byte)my_num2 + " " + (short)my_num2 + " ");
	System.out.print((int)my_num2 + " " + (long)my_num2 + " ");
	System.out.print((float)my_num2 + " " + (double)my_num2 + " ");
	System.out.println((char)my_num2 + " END");

	int my_num3=-33555;
	System.out.println("int:");	
	System.out.print((byte)my_num3 + " " + (short)my_num3 + " ");
	System.out.print((int)my_num3 + " " + (long)my_num3 + " ");
	System.out.print((float)my_num3 + " " + (double)my_num3 + " ");
	System.out.println((char)my_num3 + " END");
	
	//long my_num4=(long)9123123123;
	//System.out.print((byte)my_num4 + " " + (short)my_num4 + " ");
	//System.out.print((int)my_num4 + " " + (long)my_num4 + " ");
	//System.out.print((float)my_num4 + " " + (double)my_num4 + " ");
	//System.out.println((char)my_num4 + " END");

        float my_num5=(float)3.14;
	System.out.println("float:");	
	System.out.print((byte)my_num5 + " " + (short)my_num5 + " ");
	System.out.print((int)my_num5 + " " + (long)my_num5 + " ");
	System.out.print((float)my_num5 + " " + (double)my_num5 + " ");
	System.out.println((char)my_num5 + " END");
	
	double my_num6=987654321.123;
	System.out.println("double:");	
	System.out.print((byte)my_num6 + " " + (short)my_num6 + " ");
	System.out.print((int)my_num6 + " " + (long)my_num6 + " ");
	System.out.print((float)my_num6 + " " + (double)my_num6 + " ");
	System.out.println((char)my_num6 + " END");

	boolean my_num7 = true;
	System.out.println("boolean:");	
	if (my_num7==true) {
		System.out.print("1 " + "1");
		System.out.print("1 " + "1");
		System.out.print("1.0 " + "1.0 ");
		System.out.println(my_num7 + " END");
		}
	else {
		System.out.print("0 " + "0 ");
		System.out.print("0 " + "0 ");
		System.out.print("0.000 " + "0.000 ");
		System.out.println(my_num7 + " END");
		}

	char my_num8 = '\u00ff';
	System.out.println("char:");	
	System.out.print((byte)my_num8 + " " + (short)my_num8 + " ");
	System.out.print((int)my_num8 + " " + (long)my_num8 + " ");
	System.out.print((float)my_num8 + " " + (double)my_num8 + " ");
	System.out.println((char)my_num8 + " END");
	}    
}
