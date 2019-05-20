// Title: Write a file using the Java BufferedWriter class
// File: write_file_BufferedWriter.java

import java.io.*;

public class write_file_BufferedWriter  {
    public static void main(String[] args) throws IOException  {
        String str = "Now is the time for all good people to come to the aid of their country.";
        BufferedWriter writer = new BufferedWriter( new FileWriter( "write_file_BufferedWriter.txt" ) );
        writer.write( str );

        writer.close();
    }
}

