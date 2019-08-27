package com.kodilla.good.patterns.challenges.ProductOrderService;

public class Order {
    private int orderNumber;
    private String orderedProduct;
    private double productPrice;
    private User user;

    public Order(int orderNumber, String orderedProduct, double productPrice, User user) {
        this.orderNumber = orderNumber;
        this.orderedProduct = orderedProduct;
        this.productPrice = productPrice;
        this.user = user;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public String getOrderedProduct() {
        return orderedProduct;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public User getUser() {
        return user;
    }

    @Override
    public String toString() {
        return "Order #" + orderNumber + " === " + orderedProduct;
    }
}
