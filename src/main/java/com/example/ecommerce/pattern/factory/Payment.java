package com.example.ecommerce.pattern.factory;

public interface Payment {

    void processPayment(double amount);
    String getType();
}
