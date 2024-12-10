package learn.programming_methods.glava1.shapes.entity;

public class Rectangle extends AbstractShape {
    private double b;

    public Rectangle(double a, double b) {
        super(a);
        this.b = b;
    }

    public double getB() {
        return b;
    }
}
