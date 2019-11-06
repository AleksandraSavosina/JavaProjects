package com.points;

import java.util.Objects;

public class Point3D extends Point2D{
    private float z;

    public Point3D() { }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ (float x, float y, float z) {
        this.setX(x);
        this.setY(y);
        this.z = z;
    }

    @Override
    public String toString() {
        return ("(" + this.getX() + ", " + this.getY() + ", " + z + ')');
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        if (!super.equals(o))
            return false;
        Point3D point3D = (Point3D) o;
        return Float.compare(point3D.z, z) == 0;
    }

    @Override
    public int hashCode() {
        int result = 17;
        result += 31 * result + this.getX();
        result += 31 * result + this.getY();
        result += 31 * result + z;
        return result;
    }
}
