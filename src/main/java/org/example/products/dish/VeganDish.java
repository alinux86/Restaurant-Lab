package org.example.products.dish;

import org.example.table.TableType;

public class VeganDish extends Dish {

    public VeganDish(String dishName, double price) {
        super(dishName, price, TableType.VEGAN);
    }

    @Override
    public TableType getType() {
        return super.getType();
    }
}

