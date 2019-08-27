package com.kodilla.good.patterns.challenges.ProductOrderService;

public class OrderRequestRetriever {

    public static OrderRequest retrieve() {
        User user = new User("Jan", "Kowalski", "kowal22");
        Order order = new Order(123456, "Monitor BENQ", 1499.99, user);

        return new OrderRequest(user,order);
    }
}
