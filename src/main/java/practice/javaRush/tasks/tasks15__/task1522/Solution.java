package practice.javaRush.tasks.tasks15__.task1522;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Solution {
    static {
        readKeyFromConsoleAndInitPlanet();
    }

    public static void main(String[] args) {
        System.out.println(thePlanet);
    }

    public static Planet thePlanet;

    public static void readKeyFromConsoleAndInitPlanet() {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String str = br.readLine();
            switch (str) {
                case Planet.EARTH -> thePlanet = Earth.getInstance();
                case Planet.MOON -> thePlanet = Moon.getInstance();
                case Planet.SUN -> thePlanet = Sun.getInstance();
                default -> thePlanet = null;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void readKeyFromConsoleAndInitPlanetV2() {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        switch (str) {
            case Planet.EARTH -> thePlanet = Earth.getInstance();
            case Planet.MOON -> thePlanet = Moon.getInstance();
            case Planet.SUN -> thePlanet = Sun.getInstance();
            default -> thePlanet = null;
        }
    }
}
