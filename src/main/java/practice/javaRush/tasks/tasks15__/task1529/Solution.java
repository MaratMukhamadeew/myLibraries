package practice.javaRush.tasks.tasks15__.task1529;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {

    public static void main(String[] args) {
    }

    static {
        reset();
    }
    public static CanFly result;

    public static void reset() {
        BufferedReader br;
        try {
            br = new BufferedReader(new InputStreamReader(System.in));

            switch (br.readLine()) {
                case "helicopter" -> result = new Helicopter();
                case "plane" -> result = new Plane(br.read());
                default -> throw new IllegalArgumentException();
            }
            br.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
