// Title: Write a file using the Java Temporary File class
// File: write_file_TemporaryFile.java

import java.io.*;

public class write_file_TemporaryFile  {
    public static void main(String[] args) throws IOException  {
        String toWrite = "Now is the time for all good people to come to the aid of their country.";
        File tmpFile = File.createTempFile( "test", ".tmp" );
        // "example_out_003_TemporaryFile.txt"
        FileWriter writer = new FileWriter( tmpFile );

        writer.write( toWrite );
        writer.close();
    }
}

