package com.kodilla.testing.collection;

import java.util.*;

public class OddNumbersExterminator {
    ArrayList<Integer> numbers;

    public OddNumbersExterminator(ArrayList<Integer> numbers) {
        this.numbers = numbers;
    }

    public static ArrayList<Integer> exterminate(ArrayList<Integer> numbers) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        for (int i = 1; i < numbers.size(); i++) {
            if (numbers.get(i) % 2 != 0) {
                result.add(i);
            }
        }
        return result;
    }
}
