// Title: Write a file using the Java FileChannel class
// File: write_file_FileChannel.java

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class write_file_FileChannel  {
    public static void main( String[] args ) throws IOException  {
        RandomAccessFile stream = new RandomAccessFile( "example_out_003_FileChannel.txt", "rw" );
        FileChannel channel = stream.getChannel();
        String value = "Now is the time for all good people to come to the aid of their country.\n\n";
        byte[] strBytes = value.getBytes();
        ByteBuffer buffer = ByteBuffer.allocate( strBytes.length );
        buffer.put( strBytes );
        buffer.flip();

        channel.write( buffer );

        stream.close();
        channel.close();
    }
}

