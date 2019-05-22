// Title: Read a file using the Java BufferedReader class
// File: read_file_BufferedReader.java

import java.io.*;

public class read_file_BufferedReader  {
    public static void main(String[] args) throws IOException  {
        BufferedReader reader = new BufferedReader( new FileReader( "example_in_004.txt" ) );
        String line;
        int lineCount = 0;

        while( null != ( line = reader.readLine() ) )  {
            ++lineCount;
            System.out.printf( "%03d: %s\n", lineCount, line );
        }

        reader.close();
    }
}


