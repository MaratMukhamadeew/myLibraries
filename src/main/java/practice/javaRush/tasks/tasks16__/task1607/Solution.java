package practice.javaRush.tasks.tasks16__.task1607;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws InterruptedException {
        List<Horse> horses = prepareHorsesAndStart(10);
        while (calculateHorsesFinished(horses) != horses.size()){}

    }
    public static int calculateHorsesFinished(List<Horse> horses) throws InterruptedException {
        int finishedCount = 0;
        for (Horse horse : horses) {
            if (horse.isFinished()) {
                finishedCount++;
            } else {
                System.out.println("Waiting for " + horse.getName());
                horse.join();
            }
        }
        return finishedCount;
    }

    public static List<Horse> prepareHorsesAndStart(int horseCount) {
        List<Horse> horses = new ArrayList<>(horseCount);
        String number;
        for (int i = 1; i < horseCount + 1; i++) {
            number = i < 10 ? ("0" + i) : "" + i;
            horses.add(new Horse("Horse_" + number));
        }

        System.out.println("All horses start the race!");
        for (int i = 0; i < horseCount; i++) {
            horses.get(i).start();
        }
        return horses;
    }
}

class Horse extends Thread {
    private boolean isFinished;

    public Horse(String name) {
        super(name);
    }

    public boolean isFinished() {
        return isFinished;
    }

    public void run() {
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < 1001; i++) { // Delay
            s.append(i);
            if (i == 1000) {
                s = new StringBuilder(" has finished the race!");
                System.out.println(getName() + s);
                isFinished = true;
            }
        }
    }
}
