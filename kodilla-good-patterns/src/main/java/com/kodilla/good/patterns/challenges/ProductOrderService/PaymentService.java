package com.kodilla.good.patterns.challenges.ProductOrderService;

public interface PaymentService {
    default boolean processPayment(Order order) {
        if(order.getProductPrice() > 0) {
            return true;
        } else {
            return false;
        }
    }
}
