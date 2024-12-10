package learn.programming_methods.glava1.creator;

import learn.programming_methods.glava1.point.Point2D;

public class Point2DCreator extends Point1DCreator {
    @Override
    public Point2D createPoint() {
        System.out.println("Point2D");
        return new Point2D(2, 5);
    }
}
