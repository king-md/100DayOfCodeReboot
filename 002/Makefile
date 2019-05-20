#------------------------------------------------------------------------------

MYPROGRAM=write_file_c_functions
MYINCLUDES=

MYLIBRARIES=
GXX=g++ -std=c++11 -pthread

#------------------------------------------------------------------------------



all: $(MYPROGRAM)


$(MYPROGRAM): write_file_c_functions.o
	$(GXX) -o $(MYPROGRAM) write_file_c_functions.o

write_file_c_functions.o: write_file_c_functions.cc
	$(GXX) -I . -c write_file_c_functions.cc

clean:
	rm -f $(MYPROGRAM)

clobber:
	rm -f $(MYPROGRAM) *.o example_out_002.txt
