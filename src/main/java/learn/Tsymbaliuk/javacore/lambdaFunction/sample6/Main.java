package learn.Tsymbaliuk.javacore.lambdaFunction.sample6;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) {
        Saver saver = obj -> {
            File file = new File("save.txt");
            PrintWriter pw = new PrintWriter(file);
            pw.println(obj);
            pw.close();
        };

        try {
            saver.save("Hello world");
        } catch (IOException e) {
            // TODO AUTO-generated catch block
            e.printStackTrace();
        }
    }
}
