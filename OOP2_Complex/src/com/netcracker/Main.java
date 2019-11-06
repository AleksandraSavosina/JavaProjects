package com.netcracker;
import com.classes.*;

public class Main {
    public static void main(String... args) {

        Complex complex = new Complex(0.1, -2.3);
        System.out.println(complex.toString());

        double[] co = new double[] {1.1, 2.2, 0.0, 3.3};
        Polynomial polynom = new Polynomial(co);
        System.out.println(polynom.toString());


        double[] co1 = new double[] {1.0, 1.0};
        Polynomial polynom111 = new Polynomial(co1);
        System.out.println(polynom111.toString() + "\n");

        System.out.println((polynom.multiply(polynom111)).toString());

    }
}