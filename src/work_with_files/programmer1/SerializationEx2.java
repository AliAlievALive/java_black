package work_with_files.programmer1;

import java.io.*;

public class SerializationEx2 {
    public static void main(String[] args) {
        Car car = new Car("Mercedes-Benz", "black");
        Employee employee = new Employee("Mariya", "Ivanova","IT",
//                28,
                500, car);
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("excluded_files\\employee2.bin"))) {
            outputStream.writeObject(employee);
            System.out.println("Done!!!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
