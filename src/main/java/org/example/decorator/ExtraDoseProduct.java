package org.example.decorator;


import org.example.Products;

public class ExtraDoseProduct extends ProductDecorator {
    private static final double extraDosePrice = 0.10;

    public ExtraDoseProduct(Products products) {
        super(products);
    }

    @Override
    public double getPrice() {
        double price_extraDose = products.getPrice() * (1+ extraDosePrice);
        return price_extraDose;
    }

    @Override
    public String getName() {
        return products.getName() + " (Extra Dose)";
    }
}
