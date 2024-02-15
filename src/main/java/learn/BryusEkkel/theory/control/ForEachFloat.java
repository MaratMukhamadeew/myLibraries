package learn.BryusEkkel.theory.control;

import java.util.Random;

public class ForEachFloat {
    public static void main(String[] args) {
        Random random = new Random(47);
        float []f = new float[10];
        for (int i = 0; i < f.length; i++) {
            f[i] = random.nextFloat();
        }
        for (float fl : f) {
            System.out.println(fl);
        }
    }
}
