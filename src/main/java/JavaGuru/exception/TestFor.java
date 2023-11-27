package JavaGuru.exception;

import java.io.*;

public class TestFor {

    public static void main(String[] args) throws MyException {
        readFile();
        try {
            readFile2();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void readFile() throws MyException {
        try {
            BufferedReader bf = new BufferedReader(new FileReader("Абсолютный путь файла в файловой системе"));
            String line;
            while ((line = bf.readLine()) != null)
                System.out.println(line);
        } catch (FileNotFoundException e) {
            throw new MyException("Путь указан неверно", "Абсолютный путь файла в файловой системе");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void readFile2() throws IOException {
        BufferedReader bf = new BufferedReader(new FileReader("Абсолютный путь файла в файловой системе"));
        String line;
        while ((line = bf.readLine()) != null)
            System.out.println(line);
    }
}
