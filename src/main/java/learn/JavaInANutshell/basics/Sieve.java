package learn.JavaInANutshell.basics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Эта программа вычисляет простые числа, применяя алгоритм "Решето Эратосфена":
 * уберите числа, кратные меньшим простым числам, и все оставшиеся будут простыми. Она
 * печатает наибольшее число, не превосходящее аргумент, заданный в командной строке.
 */
public class Sieve {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int max;

        while (true) {
            max = Integer.parseInt(in.readLine());
            boolean[] isPrime = new boolean[max + 1];
            for (int i = 0; i <= max; i++) isPrime[i] = true;
            isPrime[0] = isPrime[1] = false;
            int n = (int) Math.ceil(Math.sqrt(max));
            for (int i = 0; i <= n; i++) {
                if (isPrime[i]) {
                    for (int j = 2 * i; j <= max; j = j + i) {
                        isPrime[j] = false;
                    }
                }
            }
            int largest;
            //noinspection StatementWithEmptyBody
            for (largest = max; !isPrime[largest]; largest--) {
            }
            System.out.println("Наибольшее простое число, не превосходящее " + max + " это " + largest);
        }
    }
}
