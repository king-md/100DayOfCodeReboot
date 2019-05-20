#------------------------------------------------------------------------------

MYPROGRAM=write_file_streams
MYINCLUDES=

MYLIBRARIES=
GXX=g++ -std=c++11 -pthread

#------------------------------------------------------------------------------



all: $(MYPROGRAM)


$(MYPROGRAM): write_file_streams.o
	$(GXX) -o $(MYPROGRAM) write_file_streams.o

write_file_streams.o: write_file_streams.cc
	$(GXX) -I . -c write_file_streams.cc

clean:
	rm -f $(MYPROGRAM)

clobber:
	rm -f $(MYPROGRAM) *.o example_out_001.txt
