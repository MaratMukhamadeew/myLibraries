package learn.Tsymbaliuk.javacore.functionInterface.sample9a;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        Saver<String> saver = Main::saveToFile;
        saver.saveTo("Hello world!");
    }

    public static <T> void saveToFile(T element) throws IOException {
        PrintWriter pw = new PrintWriter(new File("save.txt"));
        pw.println(element);
    }
}
