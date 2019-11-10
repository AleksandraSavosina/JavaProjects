package com.abstractFigure;

public class Main {
    public static void main(String... args) {
        Circle circle = new Circle("green", true, 7);
        System.out.println("______Area of circle: " + circle.getArea());
        System.out.println("_Perimeter of circle: " + circle.getPerimeter());
        System.out.println(circle.toString());

        Rectangle rectangle = new Rectangle(5, 7);
        System.out.println("______Area of rectangle: " + rectangle.getArea());
        System.out.println("_Perimeter of rectangle: " + rectangle.getPerimeter());
        System.out.println(rectangle.toString());

        Square square = new Square(5, "green", true);
        System.out.println(square.toString());
    }
}