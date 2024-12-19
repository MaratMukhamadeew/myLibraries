package learn.programming_methods.glava2.packing;

import java.io.FileNotFoundException;

public class PackDemo {
    public static void main(String[] args) {
        String dirName = "C:\\Users\\marat\\myLibraries\\src\\main\\java\\learn\\Tsymbaliuk\\Enum";
        PackJar pj = new PackJar("example.jar");
        try {
            pj.pack(dirName);
        } catch (FileNotFoundException e) {
            System.err.println(e.getMessage());
        }
    }
}
