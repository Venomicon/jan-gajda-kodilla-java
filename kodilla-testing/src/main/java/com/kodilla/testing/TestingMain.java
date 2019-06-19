package com.kodilla.testing;

import com.kodilla.testing.user.SimpleUser;
import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args) {
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        System.out.println("Test - pierwszy test jednostkowy:");
        Calculator calculator = new Calculator( 5, 3);

        int res1 = calculator.add();
        int res2 = calculator.subtract();

        if (res1 == (calculator.getA() + calculator.getB())) {
            if (res2 == (calculator.getA() - calculator.getB())) {
                System.out.println("Test ok");
            } else {
                System.out.println("Error!");
            }
        } else {
            System.out.println("Error!");
        }
    }
}