package learn.programming_methods.glava2.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class DemoReader {
    public static void main(String[] args) {
        String path = "C:\\Users\\marat\\myLibraries\\src\\main\\resources\\txt_files\\res.txt";
        try(BufferedReader br = new BufferedReader(new FileReader(new File(path)))) {
            String temp = "";
            while ((temp = br.readLine()) != null) {
                // Пробел использовать как разделитель
                String[] strings = temp.split("\\s");
                // Вывод полученных строк
                for (String res : strings) {
                    System.out.println(res);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
