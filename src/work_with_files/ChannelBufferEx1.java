package work_with_files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.StandardCharsets;

public class ChannelBufferEx1 {
    public static void main(String[] args) {
        try (RandomAccessFile file = new RandomAccessFile("excluded_files\\test1.txt", "rw");
             FileChannel channel = file.getChannel()) {
            ByteBuffer buffer = ByteBuffer.allocate(25);
            StringBuilder stih = new StringBuilder();

            int byteRead = channel.read(buffer);
            while (byteRead > 0) {
                System.out.println("Read " + byteRead);

                buffer.flip();

                while (buffer.hasRemaining()) {
                    stih.append((char)buffer.get());
                }

                buffer.clear();
                byteRead = channel.read(buffer);
            }
            System.out.println(stih);
            String text = "\nThere are only two ways to live your life." +
                    "One is as though nothing is a miracle. The other is as" +
                    " though everything is a miracle.";

            ByteBuffer byteBuffer2 = ByteBuffer.wrap(text.getBytes());
            channel.write(byteBuffer2);
//            ByteBuffer buffer2 = ByteBuffer.allocate(text.getBytes(StandardCharsets.UTF_8).length);
//            buffer2.put(text.getBytes());
//            buffer2.flip();
//            channel.write(buffer2);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
