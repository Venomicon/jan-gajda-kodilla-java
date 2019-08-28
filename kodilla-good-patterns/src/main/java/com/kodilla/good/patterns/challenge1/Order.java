package com.kodilla.good.patterns.challenge1;

public class Order {
    private int orderNumber;
    private String product;
    private int quantity;

    public Order(int orderNumber, String product, int quantity) {
        this.orderNumber = orderNumber;
        this.product = product;
        this.quantity = quantity;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public String getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderNumber=" + orderNumber +
                ", product='" + product + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}