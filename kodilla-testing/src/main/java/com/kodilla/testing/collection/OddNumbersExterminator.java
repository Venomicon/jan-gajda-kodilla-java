package com.kodilla.testing.collection;

import java.util.*;

public class OddNumbersExterminator {
    ArrayList<Integer> numbers;

    public OddNumbersExterminator(ArrayList<Integer> numbers) {
        this.numbers = numbers;
    }

    public static ArrayList<Integer> exterminate(ArrayList<Integer> numbers){
        for(int i=0; i<numbers.size(); i++) {

            if(numbers.get(i) % 2 != 0) {
                numbers.remove(i);
            }
        }
        return numbers;
    }
}
