package com.kodilla.good.patterns.challenge1;

import java.util.ArrayList;

public class ProducersCollection {
    private ArrayList<Producer> collection = new ArrayList<Producer>();

    public void addProducer(Producer producer) {
        if (collection.contains(producer)) {
            System.out.println(producer + " is already featured in Food2Door.");
        } else {
            collection.add(producer);
        }
    }

    public void removeProducer(Producer producer) {
        if (collection.contains(producer)) {
            collection.remove(producer);
        } else {
            System.out.println(producer + "is not featured in Food2Door.");
        }
    }

    public ArrayList<Producer> getCollection() {
        return collection;
    }

    public void showProducers() {
        System.out.println("Food producers featured in Food2Door:");
        collection.forEach(System.out::println);
    }
}
