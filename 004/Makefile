#------------------------------------------------------------------------------

MYPROGRAMS=read_file_BufferedReader read_file_DataOutputStream read_file_FileChannel read_file_FileOutputStream read_file_Files read_file_LockFileBeforeReading read_file_PrintReader read_file_RandomAccessFile read_file_system_out read_file_TemporaryFile
MYINCLUDES=

MYLIBRARIES=

JFLAGS = -g
JC = javac
.SUFFIXES: .java .class
.java.class:
	$(JC) $(JFLAGS) $*.java

#------------------------------------------------------------------------------


all: $(MYPROGRAMS)


read_file_BufferedReader: read_file_BufferedReader.class

read_file_DataOutputStream: read_file_DataOutputStream.class

read_file_FileChannel: read_file_FileChannel.class

read_file_FileOutputStream: read_file_FileOutputStream.class

read_file_Files: read_file_Files.class

read_file_LockFileBeforeWriting: read_file_LockFileBeforeReading.class

read_file_PrintReader: read_file_PrintReader.class

read_file_RandomAccessFile: read_file_RandomAccessFile.class

read_file_system_out: read_file_system_out.class

read_file_TemporaryFile: read_file_TemporaryFile.class

read_file_BufferedReader.class: read_file_BufferedReader.java
	$(JC) read_file_BufferedReader.java

read_file_DataOutputStream.class: read_file_DataOutputStream.java
	$(JC) read_file_DataOutputStream.java

read_file_FileChannel.class: read_file_FileChannel.java
	$(JC) read_file_FileChannel.java

read_file_FileOutputStream.class: read_file_FileOutputStream.java
	$(JC) read_file_FileOutputStream.java

read_file_Files.class: read_file_Files.java
	$(JC) read_file_Files.java

read_file_LockFileBeforeReading.class: read_file_LockFileBeforeReading.java
	$(JC) read_file_LockFileBeforeReading.java

read_file_PrintReader.class: read_file_PrintReader.java
	$(JC) read_file_PrintReader.java

read_file_RandomAccessFile.class: read_file_RandomAccessFile.java
	$(JC) read_file_RandomAccessFile.java

read_file_system_out.class: read_file_system_out.java
	$(JC) read_file_system_out.java

read_file_TemporaryFile.class: read_file_TemporaryFile.java
	$(JC) read_file_TemporaryFile.java

clean:
	rm -f read_file_BufferedReader.class read_file_DataOutputStream.class read_file_FileChannel.class read_file_FileOutputStream.class read_file_Files.class read_file_LockFileBeforeReading.class read_file_PrintReader.class read_file_RandomAccessFile.class read_file_system_out.class read_file_TemporaryFile.class

clobber: clean

