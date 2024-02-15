package learn.BryusEkkel.theory.initialization;

// Создание массивов оператором new
import java.util.Arrays;
import java.util.Random;
import static learn.BryusEkkel.util.Print.*;
public class ArrayNew {
    public static void main(String[] args) {
        int[] a;
        Random random = new Random(47);
        a = new int[random.nextInt(20)];
        print("Длина a = " + a.length);
        for (int i = 0; i < a.length; i++) {
            a[i] = random.nextInt(50);
        }
        print(Arrays.toString(a));
    }
}
