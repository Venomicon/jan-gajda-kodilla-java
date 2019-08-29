package com.kodilla.good.patterns.challenge1;

import java.util.Iterator;

public class OrderProcessor {
    private PaymentService paymentService;
    private DeliveryService deliveryService;
    private ProducersCollection producersCollection;

    public OrderProcessor(PaymentService paymentService, DeliveryService deliveryService, ProducersCollection producersCollection) {
        this.paymentService = paymentService;
        this.deliveryService = deliveryService;
        this.producersCollection = producersCollection;
    }

    public OrderDto processOrder(OrderRequest orderRequest) {
        boolean isPayed = paymentService.processPayment();
        if (producersCollection.getCollection().size() > 0) {
            for (int i = 0; i < producersCollection.getCollection().size(); i++) {
                if (producersCollection.getCollection().get(i).getAvailableProducts().contains(orderRequest.getOrder().getProduct())) {
                    if (isPayed) {
                        deliveryService.deliverOrder();
                        System.out.println("Your order is being processed by " + producersCollection.getCollection().get(i));
                        return new OrderDto(orderRequest.getUser(), orderRequest.getOrder(), true, true, true);
                    } else {
                        System.out.println("Failed to complete your payment");
                        return new OrderDto(orderRequest.getUser(), orderRequest.getOrder(), true, false, false);
                    }
                }
            }
        } else {
            System.out.println("There are currently no stores featured in Food2Door.");
        }
        return null;
    }
}

/**/