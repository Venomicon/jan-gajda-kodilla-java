package com.kodilla.good.patterns.challenge1;

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
        for (int i = 0; i < producersCollection.getCollection().size(); i++) {
            if (producersCollection.getCollection().get(i).getAvailableProducts().contains(orderRequest.getOrder().getProduct())) {
                if (paymentService.processPayment()) {
                    deliveryService.deliverOrder();
                    return new OrderDto(orderRequest.getUser(), orderRequest.getOrder(), true, true, true);
                    System.out.println("Your order is being processed by " + producersCollection.getCollection().get(i));
                    break;
                } else {
                    return new OrderDto(orderRequest.getUser(), orderRequest.getOrder(), true, false, false);
                    System.out.println("Failed to complete your payment");
                    break;
                }
            } else {
                return new OrderDto(orderRequest.getUser(), orderRequest.getOrder(), false, false, false);
                System.out.println(orderRequest.getOrder().getProduct() + " is not available in any store.");
            }
        }
    }
}