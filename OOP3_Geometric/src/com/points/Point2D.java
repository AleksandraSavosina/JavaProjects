package com.points;

import java.util.Objects;

public class Point2D {
    private float x;
    private float y;

    public Point2D() { }

    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float[] getXY() {
        float[] result = new float[2];
        result[0] = this.x;
        result[1] = this.y;
        return result;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ')';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Point2D point2D = (Point2D) o;
        return Float.compare(point2D.x, x) == 0 && Float.compare(point2D.y, y) == 0;
    }

    @Override
    public int hashCode() {
        int result = 17;
        result += 31 * result + x;
        result += 31 * result + y;
        return result;
    }
}
