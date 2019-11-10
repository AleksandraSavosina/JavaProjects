package com.geometric;

public class Main {
    public static void main(String... args) {
        Circle circle = new Circle(3);
        System.out.println("______Area of circle: " + circle.getArea());
        System.out.println("_Perimeter of circle: " + circle.getPerimeter());

        ResizableCircle resizableCircle = new ResizableCircle(5);
        System.out.println("______Area of circle: " + resizableCircle.getArea());
        System.out.println("_Perimeter of circle: " + resizableCircle.getPerimeter());

        resizableCircle.resize(170);
        System.out.println("______Area of circle: " + resizableCircle.getArea());
        System.out.println("_Perimeter of circle: " + resizableCircle.getPerimeter());
    }
}
