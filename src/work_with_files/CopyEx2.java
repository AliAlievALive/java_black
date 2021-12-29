package work_with_files;

import java.io.*;

public class CopyEx2 {
    public static void main(String[] args) {
        try (FileInputStream inputStream = new FileInputStream("C:\\Users\\Almir_Almiev\\Pictures\\epam.png");
             FileOutputStream fileOutputStream = new FileOutputStream("epam.png") {
             }) {
            int i;
            while ((i = inputStream.read()) != -1) {
                fileOutputStream.write(i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
