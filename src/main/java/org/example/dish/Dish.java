package org.example.dish;

import org.example.Products;

public abstract class Dish implements Products {
    protected String description;
    protected double price;


    protected Dish(String description, double price) {
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
