package com.kodilla.testing.collection;

import com.kodilla.testing.collection.OddNumbersExterminator;
import org.junit.*;
import java.util.*;

public class CollectionTestSuite {
    @Before
    public void before() {
        System.out.println("Test case: begin!");
    }

    @After
    public void after() {
        System.out.println("Test case: end!");
    }

    @Test
    public void testOddNumbersExterminatorEmptyList() {
        //Given
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        //When
        ArrayList<Integer> result = OddNumbersExterminator.exterminate(numbers);
        //Then
        Assert.assertEquals(numbers, result);
    }

    @Test
    public void testOddNumbersExterminatorNormalList() {
        //Given

        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);
        numbers.add(9);

        //When
        ArrayList<Integer> result = OddNumbersExterminator.exterminate(numbers);

        //Then
        Assert.assertEquals(numbers, result);
    }
}
