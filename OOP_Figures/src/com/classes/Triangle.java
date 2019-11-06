package com.classes;

import com.classes.Point;

public class Triangle {
    private Point v1;
    private Point v2;
    private Point v3;
    //int x1; int y1; int x2; int y2; int x3; int y3;

//    public Triangle(Point v1, Point v2, Point v3) {
//        this.v1 = new Point(v1.getX(), v1.getY());
//        this.v2 = new Point(v2.getX(), v2.getY());
//        this.v3 = new Point(v3.getX(), v3.getY());
//    }

    public Triangle (Point p1, Point p2, Point p3){
        this.v1 = p1;
        this.v2 = p2;
        this.v3 = p3;
    }

    public Triangle(int x1, int y1, int x2, int y2, int x3, int y3) {
            v1 = new Point(x1, y1);
            v2 = new Point(x2, y2);
            v3 = new Point(x3, y3);
//
//        this.v1.setXY(x1, y1);
//        this.v2.setXY(x2, y2);
//        this.v3.setXY(x3, y3);
    }

    @Override
    public String toString() {
        return "Triangle[v1 = " + v1.toString() + ", v2 = " + v2.toString() + ", v3 = " + v3.toString() + "]";
    }

    public double getPerimeter() {
        double s1 = Math.sqrt((v2.getX() - v1.getX()) * (v2.getX() - v1.getX()) + (v2.getY() - v1.getY()) * (v2.getY() - v1.getY()));
        double s2 = Math.sqrt((v3.getX() - v2.getX()) * (v3.getX() - v2.getX()) + (v3.getY() - v2.getY()) * (v3.getY() - v2.getY()));
        double s3 = Math.sqrt((v3.getX() - v1.getX()) * (v3.getX() - v1.getX()) + (v3.getY() - v1.getY()) * (v3.getY() - v1.getY()));
        return s1 + s2 + s3;
    }

    public String getType() {
        double s1 = Math.sqrt((v2.getX() - v1.getX()) * (v2.getX() - v1.getX()) + (v2.getY() - v1.getY()) * (v2.getY() - v1.getY()));
        double s2 = Math.sqrt((v3.getX() - v2.getX()) * (v3.getX() - v2.getX()) + (v3.getY() - v2.getY()) * (v3.getY() - v2.getY()));
        double s3 = Math.sqrt((v3.getX() - v1.getX()) * (v3.getX() - v1.getX()) + (v3.getY() - v1.getY()) * (v3.getY() - v1.getY()));

        if (s1 == s2 && s1 == s3)
            return "Equilateral";
        if (s1 == s2 || s1 == s3 || s2 == s3)
            return "Isosceles";
        return "Scalene";
    }
}
