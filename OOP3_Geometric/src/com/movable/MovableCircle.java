package com.movable;

public class MovableCircle implements Movable {
    private int radius;
    private MovablePoint center;

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        center = new MovablePoint(x, y, xSpeed, ySpeed);
        this.radius = radius;
    }

    @Override
    public void moveUp() {
        center.moveUp();
    }

    @Override
    public void moveDown() {
        center.moveDown();
    }

    @Override
    public void moveLeft() {
        center.moveLeft();
    }

    @Override
    public void moveRight() {
        center.moveRight();
    }

    @Override
    public String toString() {
        return "MovableCircle[" + center.toString() +
                ", radius = " + radius + ']';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;

        MovableCircle that = (MovableCircle) o;
        if (radius != that.radius) return false;
        return center.equals(that.center);
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + radius;
        result = 31 * result + center.hashCode();
        return result;
    }
}