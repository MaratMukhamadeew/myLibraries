package learn.programming_methods.glava1.point;

public class Point2D extends Point1D {
    private int y;
    public Point2D(int x, int y) {
        super(x);
        this.y = y;
    }
    public Point2D() {
        this(-1, -1);
    }

    @Override
    public double length() {
        return Math.hypot(super.length(), y);
        // Просто length() нельзя, т.к. метод будет вызывать сам себя, что
        // приведёт к бесконечной рекурсии и ошибке во время выполнения
    }

    public int getY() {
        return y;
    }

    @Override
    public String toString() {
        return super.toString() + " y = " + y;
    }
}
