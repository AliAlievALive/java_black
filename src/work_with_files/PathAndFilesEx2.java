package work_with_files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class PathAndFilesEx2 {
    public static void main(String[] args) throws IOException {
        Path filePath = Paths.get("excluded_files\\test15.txt");
        Path directoryPath = Paths.get("C:\\Users\\Almir_Almiev\\Desktop\\B");
        Path directoryAPath = Paths.get("C:\\Users\\Almir_Almiev\\Desktop\\A");

//        Files.copy(filePath, directoryPath.resolve(filePath), StandardCopyOption.REPLACE_EXISTING);
//        Files.copy(filePath, directoryPath.resolve("test16.txt"));
//        Files.copy(directoryAPath, directoryPath.resolve("B"));
//        Files.move(directoryPath, directoryAPath.resolve("B"));
//        Files.move(directoryPath, directoryAPath.resolve("B"));
        Files.delete(directoryAPath);
        System.out.println("Done!");
    }
}
