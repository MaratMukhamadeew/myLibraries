package practice.javaRush.tasks.tasks16__.task1605;

import java.util.Date;

public class Solution {
    public static int delay = 1000;

    public static void main(String[] args) {
        Thread violin = new Thread(new Violin("Player"));
        violin.start();
    }

    public static void sleepNSeconds(int n) {
        try {
            Thread.sleep(n * delay);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public interface MusicalInstrument extends Runnable {
        Date startPlaying();

        Date stopPlaying();
    }

    public static class Violin implements MusicalInstrument {
        private String owner;

        public Violin(String owner) {
            this.owner = owner;
        }

        @Override
        public void run() {
            Date start = startPlaying();
            sleepNSeconds(1);
            Date stop = stopPlaying();
            System.out.println("Playing " + (stop.getTime() - start.getTime()) + " ms");
        }

        public Date startPlaying() {
            System.out.println(this.owner + " is starting to play");
            return new Date();
        }

        public Date stopPlaying() {
            System.out.println(this.owner + " is stopping to play");
            return new Date();
        }
    }
}
