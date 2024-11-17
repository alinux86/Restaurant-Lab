package org.example.products.drink;

import org.example.Products;
import org.example.table.TableType;

public abstract class Drink implements Products {
    protected String name;
    protected double price;
    protected TableType type;

    protected Drink(String name, double price, TableType type) {
        this.name = name;
        this.price = price;
        this.type = type;
    }

    @Override
    public String getName() { return name; }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public TableType getType() { return type; }
}


