package learn.programming_methods.point;

public class Runner {
    public static void main(String[] args) {
        PointReport pointReport = new PointReport();
        Point1D p1 = new Point1D(-7);
        pointReport.printReport(p1);
        Point2D p2 = new Point2D(3, 4);
        pointReport.printReport(p2);
        Point3D p3 = new Point3D(3, 4, 5);
        pointReport.printReport(p3);
    }
}
