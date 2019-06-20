package com.kodilla.testing.shapes;


public class Triangle implements Shape {
    double a;

    public Triangle(double a) {
        this.a = a;
    }

    public String getShapeName() {
        return "Triangle";
    }

    public double getField() {
        double field = (a * a * Math.sqrt(3)) / 4;
        return field;
    }

    public String toString() {
        return "Triangle, with side = " + a;
    }
}
