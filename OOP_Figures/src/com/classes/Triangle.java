package com.classes;

import java.util.Arrays;

public class Triangle {
    private Point v1;
    private Point v2;
    private Point v3;
    //int x1; int y1; int x2; int y2; int x3; int y3;

    public Triangle(Point v1, Point v2, Point v3) {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }

    public Triangle(int x1, int y1, int x2, int y2, int x3, int y3) {
        this.v1.setXY(x1, y1);
        this.v2.setXY(x2, y2);
        this.v3.setXY(x3, y3);
    }

    @Override
    public String toString() {
        System.out.println("Triangle[v1 = " + v1 + ", v2 = " + v2 + ", v3 = " + v3 + "]");
        return null;
    }

    public double getPerimeter() {
        double s1 = Math.sqrt((v1.getX() - v2.getX()) ^ 2 + (v1.getY() - v2.getY()) ^ 2);
        double s2 = Math.sqrt((v2.getX() - v3.getX()) ^ 2 + (v2.getY() - v3.getY()) ^ 2);
        double s3 = Math.sqrt((v3.getX() - v1.getX()) ^ 2 + (v3.getY() - v1.getY()) ^ 2);
        return s1 + s2 + s3;
    }

    public String getType() {
        double s1 = Math.sqrt((v1.getX() - v2.getX()) ^ 2 + (v1.getY() - v2.getY()) ^ 2);
        double s2 = Math.sqrt((v2.getX() - v3.getX()) ^ 2 + (v2.getY() - v3.getY()) ^ 2);
        double s3 = Math.sqrt((v3.getX() - v1.getX()) ^ 2 + (v3.getY() - v1.getY()) ^ 2);

        if (s1 == s2 && s1 == s3)
            return "Equilateral";
        if (s1 == s2 || s1 == s3 || s2 == s3)
            return "Isosceles";
        return "Scalene";
    }
}
