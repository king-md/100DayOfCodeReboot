// Title: Write a file using Java's System.out (the most basic file writing).
// File: write_file_system_out.java

import java.io.*;

public class write_file_system_out  {
    public static void main(String[] args) throws IOException  {
        PrintStream consoleOut = System.out;
        PrintStream fps = new PrintStream( new File( "example_out_003_system_out.txt" ) );
        System.setOut( fps );

        System.out.println( "Now is the time for all good people to come to the aid of their country." );
    }
}

