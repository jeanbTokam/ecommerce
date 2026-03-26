package com.example.ecommerce.pattern.factory;

import org.springframework.stereotype.Component;

@Component
public class CreditCardPayment implements Payment {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing Credit Card Payment: $" + amount);
    }

    @Override
    public String getType() {
        return "Credit Card";
    }
}
