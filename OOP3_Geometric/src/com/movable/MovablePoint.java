package com.movable;

public class MovablePoint implements Movable {
    int x;
    int y;
    int xSpeed;
    int ySpeed;

    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    @Override
    public String toString() {
        return "(" + x + "," + y + ")" + ", speed = ("
                + xSpeed + ", " + ySpeed + ')';
    }

    @Override
    public void moveUp() {
        y += ySpeed;
    }

    @Override
    public void moveDown() {
        y -= ySpeed;
    }

    @Override
    public void moveLeft() {
        x -= xSpeed;
    }

    @Override
    public void moveRight() {
        x += xSpeed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;

        MovablePoint that = (MovablePoint) o;
        if (x != that.x) return false;
        if (y != that.y) return false;
        if (xSpeed != that.xSpeed) return false;
        return ySpeed == that.ySpeed;
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + x;
        result = 31 * result + y;
        result = 31 * result + xSpeed;
        result = 31 * result + ySpeed;
        return result;
    }
}