package work_with_files;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterEx {
    public static void main(String[] args) throws IOException {
        String rubai = "Много лет размышлял я над жизнью земной.\n" +
                "Непонятного нет для меня под луной\n" +
                "Мне известно, что мне ничего не известно!\n" +
                "Вот последняя правда, открытая мной.\n";

        try(FileWriter fileWriter = new FileWriter("excluded_files\\FileForWrite.txt", true)) {
            fileWriter.write(rubai);
            System.out.println("Done!");
        }
    }
}
