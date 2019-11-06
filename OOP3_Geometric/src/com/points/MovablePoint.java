package com.points;

import java.util.Objects;

public class MovablePoint extends Point {
    private float xSpeed;
    private float ySpeed;

    public MovablePoint() { }

    public MovablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getXSpeed() {
        return xSpeed;
    }

    public float getYSpeed() {
        return ySpeed;
    }

    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed(float x, float y) {
        this.setX(x);
        this.setY(y);
    }

    public float[] getSpeed() {
        float[] result = new float[2];
        result[0] = this.getX();
        result[1] = this.getY();
        return result;
    }

    @Override
    public String toString() {
        return "(" + this.getX() + ", " + this.getY() + ")" +
                ", Speed = (" + xSpeed + ", " + ySpeed + ')';
    }

    public MovablePoint move() {
        this.setX(this.getX() + xSpeed);
        this.setY(this.getY() + ySpeed);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        if (!super.equals(o))
            return false;
        MovablePoint that = (MovablePoint) o;
        return Float.compare(that.xSpeed, xSpeed) == 0 && Float.compare(that.ySpeed, ySpeed) == 0;
    }

    @Override
    public int hashCode() {
        int result = 17;
        result += 31 * result + this.getX();
        result += 31 * result + this.getY();
        result += 31 * result + xSpeed;
        result += 31 * result + ySpeed;
        return result;
    }
}
