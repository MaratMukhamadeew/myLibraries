package learn.JavaGuru.javaio;

import java.io.*;
import java.util.Objects;
import java.util.Scanner;

public class FilesGenerator {
    public static void main(String[] args) throws IOException {
        File dir = new File("c:/test");
        dir.mkdir();

        for (int i = 0; i < 20; i++) {
            File f = new File(dir, "test_" + i + ".txt");
            f.createNewFile();
            try (BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(f))) {
                bos.write(("Java " + i).getBytes());
            }
        }

        for (File file : Objects.requireNonNull(dir.listFiles())) {
            try (FileReader fr = new FileReader(file);
                 Scanner scanner = new Scanner(fr)) {
                while (scanner.hasNextLine()) {
                    if (scanner.nextLine().equals("Java 7"))
                        System.out.println(file.getName());;
                }
            }
        }
    }
}
