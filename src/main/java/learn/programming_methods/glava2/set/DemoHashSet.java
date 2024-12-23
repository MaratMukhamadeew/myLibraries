package learn.programming_methods.glava2.set;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class DemoHashSet {
    private static final String PATH = "C:\\Users\\marat\\myLibraries\\src\\main\\resources\\txt_files\\Преступление и наказание.txt";
    public static void main(String[] args) {
        HashSet<String> words = new HashSet<>(100);
        long callTime = System.nanoTime();
        try(Scanner scanner = new Scanner(new File(PATH))) {
            scanner.useDelimiter("[^А-я]+");
            while (scanner.hasNext()) {
                String word = scanner.next();
                words.add(word.toUpperCase());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        for (String word : words) {
            System.out.println(word);
        }
        TreeSet<String> set = new TreeSet<>(words);
        System.out.println(set);
        long totalTime = System.nanoTime() - callTime;
        System.out.println("Различных слов: " + words.size() + ", " + totalTime + " секунд.");
    }
}
