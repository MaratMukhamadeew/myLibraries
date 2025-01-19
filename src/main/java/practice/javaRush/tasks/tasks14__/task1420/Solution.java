package practice.javaRush.tasks.tasks14__.task1420;

import java.io.IOException;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner br = new Scanner(System.in);
        int x = br.nextInt();
        int y = br.nextInt();
        System.out.println(gcd(x, y));
        br.close();
    }
    public static int gcd (int x, int y) {
        if (x == 0) return y;
        if (y == 0) return x;
        if (x >= y) return gcd(x % y, y);
        return gcd(x, y % x);
    }
}
