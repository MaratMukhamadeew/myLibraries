package learn.programming_methods.glava2.io;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class WriteDemo {
    public static void main(String[] args) {
        String[] pArray = { "2013", "Java SE 8" };
        File fByte = new File("C:\\Users\\marat\\myLibraries\\src\\main\\resources\\data_files\\byte.data");
        File fSymb = new File("C:\\Users\\marat\\myLibraries\\src\\main\\resources\\txt_files\\symbol.txt");
        try(FileOutputStream fos = new FileOutputStream(fByte); FileWriter fw = new FileWriter(fSymb)) {
            for (String str : pArray) {
                fos.write(str.getBytes());
                fw.write(str);
            }
        } catch (IOException e) {
            System.err.println("Ошибка записи: " + e);
        }
    }
}
