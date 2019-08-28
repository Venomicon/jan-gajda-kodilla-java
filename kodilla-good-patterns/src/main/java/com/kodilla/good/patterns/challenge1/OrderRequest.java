package com.kodilla.good.patterns.challenge1;

public class OrderRequest {
    private User user;
    private Order order;

    public OrderRequest(User user, Order order) {
        this.user = user;
        this.order = order;
    }

    public User getUser() {
        return user;
    }

    public Order getOrder() {
        return order;
    }
}
