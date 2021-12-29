package work_with_files;

import java.io.*;

public class CopyEx {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("FileForWrite.txt"));
             BufferedWriter writer = new BufferedWriter(new FileWriter("test1.txt"))) {
//            int character;
//            while ((character = reader.read()) != -1) {
//                writer.write(character);
//            }
            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line + "\n");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
