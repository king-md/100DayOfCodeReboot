// Title: Write a file using C++ iostream & fstream
// File: write_file_streams.cc

#include <iostream>
#include <fstream>

int main()  {
   std::ofstream outfile;
   outfile.open( "example_out_001.txt" );
   outfile
      << "Now is the time for all good "
      << "people to come to the aid of "
      << "their country."
      << std::endl
      << std::endl;
   outfile.close();

   exit( 0 );
}
