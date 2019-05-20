// Title: Write a file using the Java Files class
// File: write_file_Files.java

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class write_file_Files  {
    public static void main( String[] args ) throws IOException  {
        String str = "Now is the time for all good people to come to the aid of their country.\n\n";

        Path path = Paths.get( "example_out_003_Files.txt" );
        byte[] strToBytes = str.getBytes();

        Files.write( path, strToBytes );
    }
}

