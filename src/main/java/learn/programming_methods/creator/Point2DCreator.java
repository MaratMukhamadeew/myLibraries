package learn.programming_methods.creator;

import learn.programming_methods.point.Point1D;
import learn.programming_methods.point.Point2D;

public class Point2DCreator extends Point1DCreator {
    @Override
    public Point2D createPoint() {
        System.out.println("Point2D");
        return new Point2D(2, 5);
    }
}
