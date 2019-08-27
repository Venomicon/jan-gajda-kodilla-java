package com.kodilla.good.patterns.challenges;

import com.kodilla.good.patterns.challenges.ProductOrderService.*;

public class Main {
    public static void main(String[] args) {
        ProductOrderService pos = new ProductOrderService(new Mail(), new Payment());

        OrderRequest request = OrderRequestRetriever.retrieve();
        pos.processOrder(request);
    }
}
