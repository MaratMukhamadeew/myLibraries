package learn.programming_methods.glava2.reading;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        var path = "C:\\Users\\marat\\myLibraries\\src\\main\\resources\\txt_files\\scan.txt";
        Scanner scanner;
        try(var fr = new FileReader(path)) {
            scanner = new Scanner(fr);
            // Чтение файла
            while (scanner.hasNext()) {
                if (scanner.hasNextInt()) {
                    System.out.println(scanner.nextInt() + " :int");
                } else if (scanner.hasNextBoolean()) {
                    System.out.println(scanner.nextBoolean() + " :boolean");
                } else if (scanner.hasNextDouble()) {
                    System.out.println(scanner.nextDouble() + " :double");
                } else {
                    System.out.println(scanner.next() + " :String");
                }
            }
        } catch (IOException ex) {
            System.err.println(ex.getMessage());
        }
    }
}
