package com.kodilla.good.patterns.challenge1;

public class Main {
    public static void main(String[] args) {
        Producer producer1 = new Producer("Shop 1");
        producer1.addProduct("Apples");
        producer1.addProduct("Honey");

        Producer producer2 = new Producer("Shop 2");
        producer2.addProduct("Beer");
        producer2.addProduct("Pears");

        Producer producer3 = new Producer("Shop 3");
        producer3.addProduct("Beer");
        producer3.addProduct("Cherries");

        ProducersCollection producersCollection = new ProducersCollection();
        producersCollection.addProducer(producer1);
        producersCollection.addProducer(producer2);
        producersCollection.addProducer(producer3);

        User user = new User("jacob123", "Jakub", "Kowalski", "jacob123@gmail.com", "Gagarina 12, Kraków");
        Order order = new Order(123456, "Cherries", 12);
        OrderRequest orderRequest = new OrderRequest(user, order);

        OrderProcessor orderProcessor = new OrderProcessor(new PaymentService(), new DeliveryService(), producersCollection);
        OrderDto dto = orderProcessor.processOrder(orderRequest);
        System.out.println(dto);
    }
}
