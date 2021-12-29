package work_with_files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileEx {
    public static void main(String[] args) {
        try (RandomAccessFile file = new RandomAccessFile("excluded_files\\test2.txt", "rw")) {
            int a = file.read();
            System.out.println((char) a);
            String s1 = file.readLine();
            System.out.println(s1);

            file.seek(10);
            String s2 = file.readLine();
            System.out.println(s2);

            long position = file.getFilePointer();
            System.out.println(position);

//            file.seek(0);
//            file.writeBytes("Privet");
            file.seek(file.length() - 1);
            file.writeBytes("\n\t\t\t\t\tAlmir");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
