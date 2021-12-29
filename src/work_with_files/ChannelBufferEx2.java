package work_with_files;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class ChannelBufferEx2 {
    public static void main(String[] args) {
        try (RandomAccessFile file = new RandomAccessFile("excluded_files\\text3.txt", "r");
             FileChannel fileChannel = file.getChannel()) {
            ByteBuffer buffer = ByteBuffer.allocate(5);
            fileChannel.read(buffer);
            buffer.flip();
            System.out.println((char) buffer.get());
            System.out.println((char) buffer.get());
            System.out.println((char) buffer.get());
            buffer.rewind();
            System.out.println((char) buffer.get());

            System.out.println("-------------------------------------");
            buffer.compact();
            fileChannel.read(buffer);
            buffer.flip();
            while (buffer.hasRemaining()) {
                System.out.println((char) buffer.get());
            }
            System.out.println("-------------------------------------");
            buffer.clear();
            fileChannel.read(buffer);
            buffer.flip();
            System.out.println((char) buffer.get());
            buffer.mark();
            System.out.println((char) buffer.get());
            System.out.println((char) buffer.get());
            buffer.reset();
            while (buffer.hasRemaining()) {
                System.out.println((char) buffer.get());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
