package com.kodilla.good.patterns.challenge1;

public class OrderDto {
    private final User user;
    private final Order order;
    private final boolean isAvailable;
    private final boolean isPayed;
    private final boolean isDelivered;

    public OrderDto(User user, Order order, boolean isAvailable, boolean isPayed, boolean isDelivered) {
        this.user = user;
        this.order = order;
        this.isAvailable = isAvailable;
        this.isPayed = isPayed;
        this.isDelivered = isDelivered;
    }
}
