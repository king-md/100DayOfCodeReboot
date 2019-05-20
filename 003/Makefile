#------------------------------------------------------------------------------

MYPROGRAMS=write_file_BufferedWriter write_file_DataOutputStream write_file_FileChannel write_file_FileOutputStream write_file_Files write_file_LockFileBeforeWriting write_file_PrintWriter write_file_RandomAccessFile write_file_system_out write_file_TemporaryFile
MYINCLUDES=

MYLIBRARIES=

JFLAGS = -g
JC = javac
.SUFFIXES: .java .class
.java.class:
	$(JC) $(JFLAGS) $*.java

#------------------------------------------------------------------------------


all: $(MYPROGRAMS)


write_file_BufferedWriter: write_file_BufferedWriter.class

write_file_DataOutputStream: write_file_DataOutputStream.class

write_file_FileChannel: write_file_FileChannel.class

write_file_FileOutputStream: write_file_FileOutputStream.class

write_file_Files: write_file_Files.class

write_file_LockFileBeforeWriting: write_file_LockFileBeforeWriting.class

write_file_PrintWriter: write_file_PrintWriter.class

write_file_RandomAccessFile: write_file_RandomAccessFile.class

write_file_system_out: write_file_system_out.class

write_file_TemporaryFile: write_file_TemporaryFile.class

write_file_BufferedWriter.class: write_file_BufferedWriter.java
	$(JC) write_file_BufferedWriter.java

write_file_DataOutputStream.class: write_file_DataOutputStream.java
	$(JC) write_file_DataOutputStream.java

write_file_FileChannel.class: write_file_FileChannel.java
	$(JC) write_file_FileChannel.java

write_file_FileOutputStream.class: write_file_FileOutputStream.java
	$(JC) write_file_FileOutputStream.java

write_file_Files.class: write_file_Files.java
	$(JC) write_file_Files.java

write_file_LockFileBeforeWriting.class: write_file_LockFileBeforeWriting.java
	$(JC) write_file_LockFileBeforeWriting.java

write_file_PrintWriter.class: write_file_PrintWriter.java
	$(JC) write_file_PrintWriter.java

write_file_RandomAccessFile.class: write_file_RandomAccessFile.java
	$(JC) write_file_RandomAccessFile.java

write_file_system_out.class: write_file_system_out.java
	$(JC) write_file_system_out.java

write_file_TemporaryFile.class: write_file_TemporaryFile.java
	$(JC) write_file_TemporaryFile.java

clean:
	rm -f write_file_BufferedWriter.class write_file_DataOutputStream.class write_file_FileChannel.class write_file_FileOutputStream.class write_file_Files.class write_file_LockFileBeforeWriting.class write_file_PrintWriter.class write_file_RandomAccessFile.class write_file_system_out.class write_file_TemporaryFile.class

clobber: clean

