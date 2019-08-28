package com.kodilla.good.patterns.challenge1;

public class PaymentService {
    private boolean isPayed = false;

    public boolean processPayment() {
        isPayed = true;
        return isPayed;
    }
}
