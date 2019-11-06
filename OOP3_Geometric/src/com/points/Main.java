package com.points;

public class Main {
    public static void main(String... args) {
        Point3D point = new Point3D(1.1f, 2.2f, 3.3f);
        point.setXYZ(0.0f, 0.0f, 0.0f);
        System.out.println("Point3D: " + point.toString());

        MovablePoint mPoint = new MovablePoint(1.1f, 2.2f);
        System.out.println(mPoint.toString());
        mPoint.move();
        System.out.println(mPoint.toString());
    }
}