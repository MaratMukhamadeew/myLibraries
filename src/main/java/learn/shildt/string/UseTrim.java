package learn.shildt.string;

// Использовать метод trim() для обработки команд, вводимых пользователем

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UseTrim {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;

        System.out.println("Введите 'стоп' для завершения");
        System.out.println("Введите название области, края или республики:");

        do {
            str = br.readLine();
            if (str.equals("Пермский край"))
                System.out.println("Город Пермь");
            if (str.equals("Свердловская область"))
                System.out.println("Город Екатеринбург");
            if (str.equals("Башкортостан"))
                System.out.println("Город Уфа");
        } while (!str.equals("стоп"));
    }
}
