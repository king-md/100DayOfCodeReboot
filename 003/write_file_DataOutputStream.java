// Title: Write a file using C functions (fopen, fclose, fprintf, etc.).
// File: write_file_DataOutputStream.java

import java.io.*;

public class write_file_DataOutputStream  {
    public static void main( String[] args ) throws IOException  {
        String value = "Now is the time for all good people to come to the aid of their country.\n\n";
        FileOutputStream fos = new FileOutputStream( "example_out_003_DataOutputStream.txt" );
        DataOutputStream dos = new DataOutputStream( new BufferedOutputStream( fos ) );
        dos.writeUTF( value );

        dos.close();
    }
}

