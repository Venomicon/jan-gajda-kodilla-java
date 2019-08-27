package com.kodilla.good.patterns.challenges.ProductOrderService;

public interface MailService {
    default void sendProduct(Order order) {
        System.out.println("Order #" + order.getOrderNumber() + " sent!");
    }
}
