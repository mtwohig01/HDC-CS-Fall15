/* 
 * Exercise 4
 * Write Read in a file and display each line including line number;
*/

import java.util.Scanner;
import java.io.*;

public class MessageReader {
    
    public static void main(String args[]){
        String fileName="bible2.txt";
        System.out.println("the name of the file to be read in is " + fileName );
        try {
            FileReader inputFile = new FileReader(fileName);
            BufferedReader bufferReader = new BufferedReader(inputFile);
            String line;
            
            // Read file line by line and print on the console
            while ((line = bufferReader.readLine()) != null)   {
                System.out.println(line);
            }
            
            //Close the buffers reader and writer
            bufferReader.close();

        }
        catch(Exception e){
            System.out.println("Error while writing to the file : " + e.getMessage());
        }
    }
}