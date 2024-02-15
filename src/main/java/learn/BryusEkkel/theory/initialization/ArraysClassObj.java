package learn.BryusEkkel.theory.initialization;

// Создание массива непримитивных объектов
import java.util.Arrays;
import java.util.Random;

import static learn.BryusEkkel.util.Print.*;
public class ArraysClassObj {
    public static void main(String[] args) {
        Random random = new Random(47);
        Integer[] a = new Integer[random.nextInt(20)];
        print("Длина a = " + a.length);
        for (int i = 0; i < a.length; i++) {
            a[i] = random.nextInt(500);  // Автоматическая упаковка
        }
        print(Arrays.toString(a));
    }
}
