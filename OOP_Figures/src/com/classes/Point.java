package com.classes;

import java.util.Objects;

public class Point {
    private int x;
    private int y;

    public Point() {
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int[] getXY () {
        int[] point = new int[2];
        point[0] = this.x;
        point[1] = this.y;
        return point;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";

    }

    public double distance(int x, int y) {
        double dis = Math.sqrt((this.x - x) ^ 2 + (this.y + y) ^ 2);
        return dis;
    }

    public double distance(Point p) {
        double dis = Math.sqrt((this.x - p.x) ^ 2 + (this.y + p.y) ^ 2);
        return dis;
    }

    public double distance() {
        double dis = Math.sqrt((this.x) ^ 2 + (this.y) ^ 2);
        return dis;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || this.getClass() != o.getClass())
            return false;
        Point point = (Point) o;
        return x == point.x && y == point.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}
