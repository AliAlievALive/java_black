package work_with_files.programmer2;

import work_with_files.programmer1.Employee;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

public class SerializationEx2 {
    public static void main(String[] args) {
        Employee employees;
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("excluded_files\\employee2.bin"))) {
            employees = (Employee) inputStream.readObject();
            System.out.println(employees);
        } catch (ClassNotFoundException | IOException e) {
            e.printStackTrace();
        }
    }
}
