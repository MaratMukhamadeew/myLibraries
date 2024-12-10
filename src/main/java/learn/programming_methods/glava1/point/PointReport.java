package learn.programming_methods.glava1.point;

public class PointReport {
    public void printReport(Point1D point) {
        System.out.printf("Length = %.2f %s%n", point.length(), point);
        // Вызовы out.print(point.toString() и out.print(point) для объекта идентичны!
    }
}
