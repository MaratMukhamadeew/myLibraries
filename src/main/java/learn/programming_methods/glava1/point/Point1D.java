package learn.programming_methods.glava1.point;

public class Point1D {
    private int x;
    public Point1D(int x) {
        this.x = x;
    }
    public Point1D() {
        this(-1);
    }
    public double length() {
        return Math.abs(x);
    }

    public int getX() {
        return x;
    }

    @Override
    public String toString() {
        return " x = " + x;
    }
}
