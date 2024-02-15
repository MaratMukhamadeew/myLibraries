package learn.BryusEkkel.theory.control;

import static learn.BryusEkkel.util.Range.*;

public class BreakAndContinue {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            if (i == 74) break; // Выход из цикла
            if (i % 9 != 0) continue; // Следующая итерация
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i : range(100)) {
            if (i == 74) break; // Выход из цикла
            if (i % 9 != 0) continue; // Следующая итерация
            System.out.print(i + " ");
        }
        System.out.println();

        int i = 0;
        // Бесконечный цикл
        while (true) {
            i++;
            int j = i * 27;
            if (j == 1269) break;
            if (j % 10 != 0) continue;
            System.out.print(i + " ");
        }
    }
}
