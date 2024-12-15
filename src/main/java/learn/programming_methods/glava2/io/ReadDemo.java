package learn.programming_methods.glava2.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class ReadDemo {
    public static void main(String[] args) {
        String file = "C:\\Users\\marat\\myLibraries\\src\\main\\resources\\txt_files\\file.txt";
        File f = new File(file); // Объект для связи с файлом на диске
        int b, count = 0;
        FileReader fr = null;

        try(FileInputStream fis = new FileInputStream(f)) {
//            fr = new FileReader(f);

            while ((b = fis.read()) != -1) { // Чтение
                System.out.print((char) b);
                count++;
            }
            System.out.print("\nЧисло байт = " + count);
        } catch (IOException e) {
            System.err.println("Ошибка файла: " + e);
        }
    }
}
