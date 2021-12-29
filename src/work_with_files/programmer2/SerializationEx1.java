package work_with_files.programmer2;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

public class SerializationEx1 {
    public static void main(String[] args) {
        List<String> employees;
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("excluded_files\\employee1.bin"))) {
            employees = (ArrayList) inputStream.readObject();
            System.out.println(employees);
        } catch (ClassNotFoundException | IOException e) {
            e.printStackTrace();
        }
    }
}
