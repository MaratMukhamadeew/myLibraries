package learn.JavaInANutshell.basics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Эта программа читает вводимые пользователем строки, кодирует их
 * при помощи тривиального подстановочного шифра "rot13"
 * и затем печатает закодированную строку.
 * */
public class Rot13Input {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            System.out.print("> ");
            String line = in.readLine();
            if ((line == null) || line.equals("quit")) break;
            StringBuffer buf = new StringBuffer(line);
            for (int i = 0; i < buf.length(); i++) {
                buf.setCharAt(i, rot13(buf.charAt(i)));
            }
            System.out.println(buf);
        }
    }

    /**
     * Этот метод осуществляет подстановочное шифрование Rot13.
     * Он "сдвигает по кругу" каждую букву алфавита на 13 мест. Поскольку
     * в латинском алфавите 26 букв, этот метод и кодирует, и декодирует.
     * */
    private static char rot13(char c) {
        if ((c >= 'A') && (c <= 'Z')) {
            c += 13;
            if (c > 'Z') c -= 26;
        }
        if ((c >= 'a') && (c <= 'z')) {
            c += 13;
            if (c > 'z') c -= 26;
        }
        return c;
    }
}
