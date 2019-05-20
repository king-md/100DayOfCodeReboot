// Title: Write a file using the Java FileOutputStream class
// File: write_file_FileOutputStream.java

import java.io.*;

public class write_file_FileOutputStream  {
    public static void main( String[] args ) throws IOException  {
        String str = "Now is the time for all good people to come to the aid of their country.";
        FileOutputStream outputStream = new FileOutputStream( "example_out_003_FileOutputStream.txt" );

        byte[] strToBytes = str.getBytes();
        outputStream.write( strToBytes );

        outputStream.close();
    }
}

