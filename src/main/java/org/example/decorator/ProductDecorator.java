package org.example.decorator;

import org.example.Products;
import org.example.table.TableType;

public class ProductDecorator implements Products {
    protected final Products products;

    public ProductDecorator(Products products) {
        this.products = products;
    }

    public String getName() {
        return products.getName();
    }

    public double getPrice() {
        return products.getPrice();
    }

    public TableType getType() {
        return products.getType();
    }

}
