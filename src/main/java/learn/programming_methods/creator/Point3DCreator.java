package learn.programming_methods.creator;

import learn.programming_methods.point.Point1D;
import learn.programming_methods.point.Point3D;

public class Point3DCreator extends Point2DCreator {
    @Override
    public Point3D createPoint() {
        System.out.println("Point3D");
        return new Point3D(3, 7, 8);
    }
}
