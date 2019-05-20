// Title: Write a file using the Java RandomAccessFile class
// File: write_file_RandomAccessFile.java

import java.io.*;

public class write_file_RandomAccessFile  {
    public static void main( String[] args ) throws IOException  {
        RandomAccessFile writer = new RandomAccessFile( "example_out_003_RandomAccessFile.txt", "rw" );
        writer.seek( 0 );
        writer.writeBytes( "Now is the time for all good people to come to the aid of their country.\n\n" );

        writer.close();
    }
}

