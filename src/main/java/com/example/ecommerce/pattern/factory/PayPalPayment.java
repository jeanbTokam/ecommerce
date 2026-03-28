package com.example.ecommerce.pattern.factory;

import org.springframework.stereotype.Component;

@Component
public class PayPalPayment implements Payment {


    @Override
    public void processPayment(double amount) {
        System.out.println("Processing Credit Card payment" + amount);
    }

    @Override
    public String getType() {
        return "Credit Card";
    }
}
