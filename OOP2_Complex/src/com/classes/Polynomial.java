package com.classes;

import java.util.Arrays;

public class Polynomial {
    double[] coeffs;

    public Polynomial() { }

    public Polynomial(double[] coeffs) {
        this.coeffs = coeffs;
    }

    public int getDegree() {
        return coeffs.length - 1;
    }

    @Override
    public String toString() {
        String tmp = "Polynom: ";

        if (coeffs[coeffs.length - 1] > 0)
            tmp += coeffs[0] + "*X^" + (coeffs.length - 1);
        else if (coeffs[0] < 0)
            tmp += (-1) * coeffs[coeffs.length - 1] + "*X^" + (coeffs.length - 1);

        if (coeffs.length == 1)
            return tmp;

        for (int i = 1; i < coeffs.length - 1; i++)
            if (coeffs[i] != 0) {
                if (coeffs[i] < 0)
                    tmp += " - " + (-1) * coeffs[i] + "*X^" + (coeffs.length - i - 1);
                else
                    tmp += " + " + coeffs[i] + "*X^" + (coeffs.length - i - 1);
            }

        if (coeffs[coeffs.length - 1] > 0)
            tmp += " + " + coeffs[coeffs.length - 1];
        else if (coeffs[coeffs.length - 1] < 0)
            tmp += " - " + (-1) * coeffs[coeffs.length - 1];
        return tmp;
    }

    public double evaluate(double x) {
        double result = 0;
        for (int i = 0; i < coeffs.length - 1; i++)
            result += coeffs[i] * Math.pow(x, coeffs.length - i - 1);

        result += coeffs[coeffs.length - 1];
        return result;
    }

    public Polynomial add(Polynomial pol) {
        if (this.coeffs.length < pol.coeffs.length) {
            for (int i = 0; i < pol.coeffs.length; i++)
                pol.coeffs[this.coeffs.length - 1 - i] += this.coeffs[this.coeffs.length - 1 - i];
            return pol;
        }
        for (int i = 0; i < pol.coeffs.length; i++)
            this.coeffs[this.coeffs.length - 1 - i] += pol.coeffs[pol.coeffs.length - 1 - i];
        return this;
    }

    public Polynomial multiply(Polynomial right) {
        double[] newC = new double[coeffs.length + right.coeffs.length - 1];

        for (int i = 0; i < coeffs.length; i++)
            for (int j = 0; j < right.coeffs.length; j++)
                newC[i + j] += coeffs[i] * right.coeffs[j];

        Polynomial newP = new Polynomial(newC);
        return newP;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Polynomial newP = (Polynomial) o;
        return Arrays.equals(coeffs, newP.coeffs);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(coeffs);
    }
}
