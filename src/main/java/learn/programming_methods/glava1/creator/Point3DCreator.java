package learn.programming_methods.glava1.creator;

import learn.programming_methods.glava1.point.Point3D;

public class Point3DCreator extends Point2DCreator {
    @Override
    public Point3D createPoint() {
        System.out.println("Point3D");
        return new Point3D(3, 7, 8);
    }
}
