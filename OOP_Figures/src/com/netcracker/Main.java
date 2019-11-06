package com.netcracker;
import com.classes.*;

public class Main {
    public static void main(String... args) {

        Circle circle = new Circle(2, "yellow");
        System.out.println(circle.getArea());
        System.out.println(circle.toString());

        Rectangle rectangle = new Rectangle(1.0f, 2.5f);
        System.out.println(rectangle.getArea());
        System.out.println(rectangle.getPerimeter());
        System.out.println(rectangle.toString());

        Employee employee = new Employee(13, 70000, "Ivan", "Petrov");
        System.out.println(employee.getName());
        System.out.println(employee.toString());

        Author author = new Author("vv", "dd", 'f');
        Author[] authors = new Author[3];
        authors[0] = new Author("Erich", "e1", 'f');
        authors[1] = new Author("Maria", "e2", 'f');
        authors[2] = new Author("Remark", "e3", 'f');
        Book book = new Book("three companions", authors, 170 );
        System.out.println(book.toString());

        Point point = new Point();
        point.setXY(4, 5);
        System.out.println(point.toString());

        Point p1 = new Point(1, 1);
        Point p2 = new Point(5, 1);
        Point p3 = new Point(1, 5);
        Triangle triangl = new Triangle(p1, p2, p3);
        // System.out.println("Perimeter: " + triangl.getPerimeter());
        System.out.println(triangl.toString());
        System.out.println("Type of triangle: " + triangl.getType());;

        Triangle triangle = new Triangle(1, 1, 1, 5, 5, 1);
        System.out.println("Perimeter: " + triangle.getPerimeter());
    }
}
