package com.classes;

import java.util.Objects;

public class Complex {
    private double real;
    private double imag;

    public Complex() {
        real = 0.0;
        imag = 0.0;
    }

    public Complex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public void setImag(double imag) {
        this.imag = imag;
    }

    public void setValue(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public double getReal() {
        return real;
    }

    public double getImag() {
        return imag;
    }

    @Override
    public String toString() {
        if (imag > 0)
            return "(" + real + " + " +  imag + "i)";
        if (imag == 0)
            return "(" + real + ")";
        return "(" + real + " - " + (-1) * imag + "i)";
    }

    public boolean isReal() {
        if (real != 0)
            return true;
        return false;
    }

    public boolean isImaginary() {
        if (imag != 0)
            return true;
        return false;
    }

    public boolean equals(double real, double imag) {
        if (Double.compare(this.real, real) == 0 && Double.compare(this.imag, imag) == 0)
            return true;
        return false;
    }

    public boolean equals(Complex another) {
        if (this == another)
            return true;
        if (another == null || getClass() != another.getClass())
            return false;
        Complex complex = (Complex) another;
        return Double.compare(complex.real, real) == 0 && Double.compare(complex.imag, imag) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(real, imag);
    }

    public double magnitude() {
        return Math.sqrt(Math.pow(real, 2) + Math.pow(imag, 2));
    }

    public double argument() {
        return Math.atan(imag / real);
    }

    public Complex add(Complex right) {
        this.real += right.real;
        this.imag += right.imag;
        return this;
    }

    public Complex addNew(Complex right) {
        double realTmp = this.real + right.real;
        double imagTmp = this.imag + right.imag;
        Complex complex = new Complex(realTmp, imagTmp);
        return complex;
    }

    public Complex subtract(Complex right) {
        this.real -= right.real;
        this.imag -= right.imag;
        return this;
    }

    public Complex subtractNew(Complex right) {
        double RealTmp = real - right.real;
        double ImagTmp = imag - right.imag;
        Complex myComplex = new Complex(RealTmp, ImagTmp);
        return myComplex;
    }

    public Complex multiply(Complex right) {
        double RealTmp = real;
        double tempImag = imag;
        real = (RealTmp * right.real - tempImag * right.imag);
        imag = (RealTmp * right.imag + tempImag * right.real);
        return this;
    }

    public Complex divide(Complex right) {
        double RealTmp = real;
        double ImagTmp = imag;
        this.real = (RealTmp * right.real + ImagTmp * right.imag) / (Math.pow(right.real, 2) + Math.pow(right.imag, 2));
        this.imag = (right.real * ImagTmp - RealTmp * right.imag) / (Math.pow(right.real, 2) + Math.pow(right.imag, 2));
        return this;
    }

    public Complex conjugate() {
        this.imag = -imag;
        return this;
    }
}
