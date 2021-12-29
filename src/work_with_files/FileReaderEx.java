package work_with_files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderEx {
    public static void main(String[] args) throws IOException {
        FileReader reader = null;
        File file;
        try {
            reader = new FileReader("FileForWrite.txt");
            int character;
            while ((character = reader.read()) != -1) {
                System.out.print((char) character);
            }
            System.out.println();
            System.out.println("Done");

        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            reader.close();
        }
    }
}
