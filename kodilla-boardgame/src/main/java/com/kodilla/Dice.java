package com.kodilla;

public class Dice {
    public static int roll() {
        int result = 0;
        for (int i = 0; i < 4; i++) {
            int dice = (int) Math.round(Math.random());
            result += dice;
        }
        System.out.println("result = " + result);
        return result;
    }
}
