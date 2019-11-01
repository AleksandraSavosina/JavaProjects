package com.classes;

public class Point {
    private int x;
    private int y;

    public Point() {
        this.x = 0;
        this.y = 0;
    }

    public Point(int _x, int _y) {
        this.x = _x;
        this.y = _y;
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

    public void setXY(int _x, int _y) {
        this.x = _x;
        this.y = _y;
    }

    @Override
    public String toString() {
        System.out.println("(" + x + ", " + y + ")");
        return null;
    }

    public double distance(int _x, int _y) {
        double dis = Math.sqrt((this.x - _x) ^ 2 + (this.y + _y) ^ 2);
        return dis;
    }

    public double distance(Point _p) {
        double dis = Math.sqrt((this.x - _p.x) ^ 2 + (this.y + _p.y) ^ 2);
        return dis;
    }

    public double distance() {
        double dis = Math.sqrt((this.x) ^ 2 + (this.y) ^ 2);
        return dis;
    }
}
