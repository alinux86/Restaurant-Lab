package org.example.decorator;

import org.example.Products;

public class ExtraTasteProduct extends ProductDecorator {
    private static final double extraTastePrice = 0.15;

    public ExtraTasteProduct(Products products) {
        super(products);
    }

    @Override
    public double getPrice() {
        double price_extraTaste = products.getPrice() * (1+ extraTastePrice);
        return price_extraTaste;
    }

    @Override
    public String getName() {
        return products.getName() + " (Extra Taste)";
    }
}
