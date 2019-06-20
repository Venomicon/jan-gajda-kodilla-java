package com.kodilla.testing.shapes;

public class Square implements Shape {
    double a;

    public Square(double a) {
        this.a = a;
    }

    public String getShapeName() {
        return "Square";
    }

    public double getField() {
        double field = a * a;
        return field;
    }

    public String toString() {
        return "Square, with side = " + a;
    }
}
