// Title: Write a file using the Java Lock File Before Writing class
// File: write_file_LockFileBeforeWriting.java

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.OverlappingFileLockException;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;

public class write_file_LockFileBeforeWriting  {
    public static void main( String[] args ) throws IOException  {
        RandomAccessFile stream = new RandomAccessFile( "example_out_003_LockFileBeforeWriting.txt", "rw" );
        FileChannel channel = stream.getChannel();

        FileLock lock = null;
        try  {
            lock = channel.tryLock();
        } catch ( final OverlappingFileLockException e )  {
            stream.close();
            channel.close();
        }
        stream.writeChars( "Now is the time for all good people to come to the aid of their country." );
        lock.release();

        stream.close();
        channel.close();
    }
}

