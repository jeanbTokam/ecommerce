package com.example.ecommerce.pattern.strategy;

import org.springframework.stereotype.Component;

@Component
public class ExpressShipping implements ShippingStrategy{
    @Override
    public double calculateShipping(double price) {
        return price * 0.10;
    }
}
