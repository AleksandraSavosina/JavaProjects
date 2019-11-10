package com.movable;

public class Main {
    public static void main(String... args) {
        MovablePoint movablePoint = new MovablePoint(0, 0, 2, 2);
        movablePoint.moveRight();
        movablePoint.moveDown();
        System.out.println(movablePoint.toString());

        MovableCircle movableCircle = new MovableCircle(1, 1, 3, 3, 3);
        movableCircle.moveLeft();
        movableCircle.moveUp();
        System.out.println(movableCircle.toString());

        MovableRectangle movableRectangle = new MovableRectangle(1, 1, 1, 1, 4, 4);
        movableRectangle.moveRight();
        movableRectangle.moveUp();
        movableRectangle.moveLeft();
        System.out.println(movableRectangle.toString());
    }
}
