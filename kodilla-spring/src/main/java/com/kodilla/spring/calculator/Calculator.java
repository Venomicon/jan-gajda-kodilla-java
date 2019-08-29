package com.kodilla.spring.calculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Calculator {
    @Autowired
    Display display;

    public double add(double a, double b) {
        double x = a + b;
        display.displayValue(x);
        return x;
    }

    public double sub(double a, double b) {
        double x = a - b;
        display.displayValue(x);
        return x;
    }

    public double mul(double a, double b) {
        double x = a * b;
        display.displayValue(x);
        return x;
    }

    public double div(double a, double b) {
        double x = a / b;
        display.displayValue(x);
        return x;
    }
}
