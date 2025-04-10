package practice.geodesy.entyties;

import java.util.LinkedList;
import java.util.List;

public class Dot {
    private final int number;
    private double elevationMarks;
    private double workingMark;

    public Dot(int number) {
        this.number = number;
    }

    public static Dot[] giveMeSixteenDotsArray() {
        Dot[] dots = new Dot[16];
        for (int i = 0; i < 16; i++) {
            dots[i] = new Dot(i + 1);
        }
        return dots;
    }

    public static List<Dot> giveMeSixteenDotsList() {
        List<Dot> list = new LinkedList<>();
        for (int i = 0; i < 16; i++) {
            list.add(new Dot(i + 1));
        }
        return list;
    }

    public int getNumber() {
        return number;
    }

    public double getElevationMarks() {
        return elevationMarks;
    }

    public void setElevationMarks(double elevationMarks) {
        this.elevationMarks = elevationMarks;
    }

    public double getWorkingMark() {
        return workingMark;
    }

    public void setWorkingMark(double workingMark) {
        this.workingMark = workingMark;
    }

    @Override
    public String toString() {
        return "Точка №" + number + ", отметка высоты = " + String.format("%.3f",elevationMarks);
    }
}
