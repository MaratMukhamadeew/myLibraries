package learn.programming_methods.glava1.enums;

public class ShapeRunner {
    public static void main(String[] args) {
        double x = 2, y = 3;
        Shape shape;
        shape = Shape.RECTANGLE;
        System.out.printf("%10s = %5.2f%n", shape, shape.defineSquare(x, y));
        shape = Shape.TRIANGLE;
        System.out.printf("%10s = %5.2f%n", shape, shape.defineSquare(x, y));
        shape = Shape.CIRCLE;
        System.out.printf("%10s = %5.2f%n", shape, shape.defineSquare(x));
    }
}
