package learn.programming_methods.glava2.io;

import java.io.*;

public class DemoWriter {
    public static void main(String[] args) {
        String path = "C:\\Users\\marat\\myLibraries\\src\\main\\resources\\txt_files\\res.txt";
        File file = new File(path);
        double[] values = { 1.10, 1.2, 1.401, 5.01, 6.017, 7, 8 };
        try(PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(file, true)))) {
            for (double v : values) {
                pw.printf("Java %.2g%n", v); // Запись прямо в файл
            }
        } catch (IOException e) {
            System.err.println("Ошибка открытия потока: " + e);
        }
    }
}
