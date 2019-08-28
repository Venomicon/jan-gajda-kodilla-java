package com.kodilla.good.patterns.challenge1;

import java.util.*;

public class Producer {
    private String name;
    private ArrayList<String> availableProducts = new ArrayList<String>();

    public Producer(String name) {
        this.name = name;
    }

    public void addProduct(String product) {
        if (availableProducts.contains(product)) {
            System.out.println(product + " is already available at your store.");
        } else {
            availableProducts.add(product);
        }
    }

    public void removeProduct(String product) {
        if (availableProducts.contains(product)) {
            availableProducts.remove(product);
        } else {
            System.out.println(product + " is not available at your store");
        }
    }

    public String getName() {
        return name;
    }

    public ArrayList<String> getAvailableProducts() {
        return  availableProducts;
    }

    public void showProducts() {
        System.out.println("Products available at " + getName() + ":");
        availableProducts.forEach(System.out::println);
    }

    @Override
    public String toString() {
        return name;
    }
}
