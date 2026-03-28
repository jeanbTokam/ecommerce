package com.example.ecommerce.pattern.factory;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PaymentFactory {

    private final List<Payment> payments;

    public PaymentFactory(List<Payment> payments) {
        this.payments = payments;
    }

    public Payment getPayment(String type){
        return payments.stream()
                .filter(p -> p.getType().equalsIgnoreCase(type))
                .findFirst()
                .orElseThrow(()-> new RuntimeException("Payment type not supported"));
    }
}
