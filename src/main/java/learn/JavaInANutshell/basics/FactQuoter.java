package learn.JavaInANutshell.basics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Эта программа отображает факториалы чисел, вводимых пользователем в интерактивном режиме
 */
public class FactQuoter {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            System.out.print("FactQuoter -> ");
            String line = in.readLine();
            if ((line == null) || line.equals("quit")) break;
            try {
                int x = Integer.parseInt(line);
                System.out.println(x + " != " + Factorial3.factorial(x));
            } catch (Exception e) {
                System.out.println("Invalid Input");
            }
        }
    }
}
