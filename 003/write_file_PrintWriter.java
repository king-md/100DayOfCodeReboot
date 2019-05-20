// Title: Write a file using the Java PrintWriter class
// File: write_file_PrintWriter.java

import java.io.*;

public class write_file_PrintWriter  {
    public static void main(String[] args) throws IOException  {
        FileWriter fileWriter = new FileWriter( "example_out_003_PrintWriter.txt" );
        PrintWriter printWriter = new PrintWriter( fileWriter );
        printWriter.print( "Now is the time for all good people to come to the aid of their country." );

        printWriter.close();
    }
}

