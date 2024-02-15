package learn.BryusEkkel.theory.control;

import java.util.Random;

import static learn.BryusEkkel.util.Print.*;

public class VowelsAndConsonants {
    public static void main(String[] args) {
        vampire();
    }

    static void randomVowels() {
        Random random = new Random(47);
        for (int i = 0; i < 100; i++) {
            int r = random.nextInt(26) + 'a';
            printnb((char) r + ", " + r + ": ");
            switch (r) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    print("гласная");
                    break;
                case 'y':
                case 'w':
                    print("условно гласная");
                    break;
                default:
                    print("согласная");
            }

            switch (r) {
                case 'a', 'e', 'i', 'o', 'u' -> print("гласная");
                case 'y', 'w' -> print("условно гласная");
                default -> print("согласная");
            }
        }
    }

    static void fibonacci(int i) {
        if (i == 1) {
            printnb("1 1");
            return;
        }
        printnb("1 1 2 ");
        if (i == 2) {
            return;
        }

        int first = 1;
        int second = 2;
        int swap = 0;
        int third = 0;
        for (int j = 3; j < i; j++) {
            third = first + second;
            printnb(third + " ");
            swap = second;
            second = third;
            first = swap;
        }
    }

    static void vampire() {
        for (int i = 1000; i <= 9999; i++) {
            int first = i % 10;
            int second = (i % 100) / 10;
            int third = (i % 1000) / 100;
            int four = (i / 1000);
            if (first == 0) continue;
            if (((first + (second * 10)) * (third + (four * 10)) == i)) {
                print((first + (second * 10)) + " * " + (third + (four * 10)) + " = " + i);
            }
            if (((second + (first * 10)) * (third + (four * 10)) == i)) {
                print((second + (first * 10)) + " * " + (third + (four * 10)) + " = " + i);
            }
            if (((second + (first * 10)) * (four + (third * 10)) == i)) {
                print((second + (first * 10)) + " * " + (four + (third * 10)) + " = " + i);
            }
            if ((((first + (second * 10)) * (four + (third * 10)) == i))) {
                print((first + (second * 10)) + " * " + (four + (third * 10)) + " = " + i);
            }
            if (((second + (third * 10)) * (four + (first * 10)) == i)) {
                print((second + (third * 10)) + " * " + (four + (first * 10)) + " = " + i);
            }
            if (((third + (second * 10)) * (four + (first * 10)) == i)) {
                print((third + (second * 10)) + " * " + (four + (first * 10)) + " = " + i);
            }
            if (((second + (third * 10)) * (first + (four * 10)) == i)) {
                print((second + (third * 10)) + " * " + (first + (four * 10)) + " = " + i);
            }
            if (((third + (second * 10)) * (first + (four * 10)) == i)) {
                print((third + (second * 10)) + " * " + (first + (four * 10)) + " = " + i);
            }
        }
    }
}
