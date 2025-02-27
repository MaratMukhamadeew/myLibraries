package learn.Tsymbaliuk.javacore.StreamAPI.sample4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Comparator;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        try {
            Optional<String> result = Files.lines(Path
                    .of("C:\\Users\\marat\\myLibraries\\src\\main\\resources\\txt_files\\cat_name.txt"))
                    .max(Comparator.comparingInt(String::length));
            System.out.println(result.get());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
