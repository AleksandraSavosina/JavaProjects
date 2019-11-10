package com.figures;

public class Square extends Rectangle {
    public Square() {
    }

    public Square(double side) {
        setLength(side);
    }

    public Square(double side, String color, boolean filled) {
        setColor(color);
        setFilled(filled);
        setLength(side);
    }

    public double getSide() {
        return getLength();
    }

    public void setSide(double side) {
        setLength(side);
    }

    public void setWidth(double width) {
        super.setWidth(width);
    }

    public void setLength(double side) {
        super.setLength(side);
    }

    @Override
    public String toString() {
        return "Square[" + "Shape[" + "color = " + getColor() + ", filled = " + isFilled() +
                "], side=" + getSide() + ']';
    }
}