package org.example.drink;

import org.example.Products;

public abstract class Drink implements Products {
    protected String description;
    protected double price;

    public Drink(String description, double price) {
        this.description = description;
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public double getPrice() {
        return price;
    }
}


