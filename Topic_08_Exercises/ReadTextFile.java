/* 
 * Files: Example to read in a text file line by line and
 * print it to the console and copy it another file
*/

import java.io.*;

/**
 * This example code shows you how to read file in Java
 * I added the write code, read it in and write it out.
 */

public class ReadTextFile
{
    public static void main(String[] args)
    {
        System.out.println("Reading File from Java code");
        //Name of the file
        String fileName="bible.txt";
        System.out.println("the name of the file read in is " + fileName );
        try {
            FileWriter  writer      = new FileWriter("bible2.txt");
            PrintWriter printWriter = new PrintWriter(writer);
       
        
            try{
            
                //Create object of FileReader
                FileReader inputFile = new FileReader(fileName);
            
                //Instantiate the BufferedReader Class
                BufferedReader bufferReader = new BufferedReader(inputFile);
            
                //Variable to hold the one line data
                String line;
            
                // Read file line by line and print on the console and file copy
                while ((line = bufferReader.readLine()) != null)   {
                    System.out.println(line);
                    printWriter.println(line);
                }
            
                //Close the buffers reader and writer
                bufferReader.close();
                printWriter.close();
            
            }catch(Exception e){
                System.out.println("Error while reading file line by line:" + e.getMessage());
                }
        
        }catch(Exception e){
            System.out.println("Error while creating file" + e.getMessage());
        }
        
    }
}