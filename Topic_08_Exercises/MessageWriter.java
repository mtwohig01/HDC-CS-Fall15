/* 
 * Exercise 3
 * Write user's input to a file
*/

import java.util.Scanner;
import java.io.*;

public class MessageWriter {
    
    public static void main(String args[]){
        try {
            FileWriter  writer      = new FileWriter("messagess.txt",true);
            PrintWriter printWriter = new PrintWriter(writer);
            Scanner sc = new Scanner(System.in);
            System.out.println("Please Enter Your Sentances to be written to a file, when you type the word END it will be written to \"messages.txt\" " );
            String userinput = sc.nextLine();
            while (!userinput.equals("END")) {
                printWriter.println(userinput);
                userinput = sc.nextLine();
            }
            printWriter.close();
        }
        catch(Exception e){
            System.out.println("Error while creating file : " + e.getMessage());
        }
    }
}