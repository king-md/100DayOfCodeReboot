// Title: Write a file using C functions (fopen, fclose, fprintf, etc.).
// File: write_file_Files.java


public class write_file_Files  {
    public static void main(String[] args)  {
        // Prints "Hello, World" to the terminal window.
        System.out.println("Hello, World");
    }
}




/*
#include <stdlib.h>
#include <stdio.h>

int main()  {
   char const * const outfile_name = "example_out_002.txt";

   FILE* outfile_p = fopen( outfile_name, "w" );
   if( nullptr == outfile_p )  {
       fprintf( stderr, "Unable to open file %s.\n\n", outfile_name );
       exit( 1 );
   }
   fprintf( outfile_p, "Now is the time for all good "
      "people to come to the aid of their country.\n\n" );
   fclose( outfile_p );

   exit( 0 );
}
*/
