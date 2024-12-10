package learn.programming_methods.glava1.enums;

import java.util.Arrays;

public class MelomanRunner {
    public static void main(String[] args) {
        MusicStyle ms = MusicStyle.CLASSIC;
        System.out.print(ms);
        switch (ms) {
            case JAZZ -> System.out.println(" is Jazz");
            case CLASSIC -> System.out.println(" is Classic");
            case ROCK -> System.out.println(" is Rock");
            case BLUES -> System.out.println(" is Blues");
            default -> System.out.println("Unknown music style: " + ms);
        }
        System.out.println(Arrays.toString(MusicStyle.values()));
        System.out.println(MusicStyle.valueOf("jazz".toUpperCase()));
        System.out.println(MusicStyle.BLUES.ordinal());
    }
}
