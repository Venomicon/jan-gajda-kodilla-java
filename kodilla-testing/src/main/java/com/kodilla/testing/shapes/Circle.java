package com.kodilla.testing.shapes;

public class Circle implements Shape {
    double a;

    public Circle(double a) {
        this.a = a;
    }

    public String getShapeName() {
        return "Circle";
    }

    public double getField() {
        double field = a * a * 3.14;
        return field;
    }

    public String toString() {
        return "Circle, with radius = " + a;
    }
}
