package com.kodilla.good.patterns.challenges.ProductOrderService;

public class OrderDto {
    private final User user;
    private final Order order;
    private final boolean isPayed;
    private final boolean isSent;

    public OrderDto(User user, Order order, boolean isPayed, boolean isSent) {
        this.user = user;
        this.order = order;
        this.isPayed = isPayed;
        this.isSent = isSent;
    }
}
