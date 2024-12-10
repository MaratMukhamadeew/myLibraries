package learn.programming_methods.glava1.shapes.entity;

public class Triangle extends AbstractShape {
    private double b;
    private double angle; // Угол между сторонами в радианах

    public Triangle(double a, double b, double angle) {
        super(a);
        this.b = b;
        this.angle = angle;
    }

    public double getB() {
        return b;
    }

    public double getAngle() {
        return angle;
    }
    public double getC() {
        return Math.sqrt ((getA() * getA()) + (b * b) - 2 * getA() * b * Math.cos(Math.toRadians(angle)));
    }
}
