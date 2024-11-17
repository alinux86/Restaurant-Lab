package org.example.products.drink;

import org.example.table.TableType;

public class GaseousDrink extends Drink {
    public GaseousDrink(String name, double price) {

        super(name, price, TableType.VEGAN);
    }

    @Override
    public TableType getType() {
        return super.getType();
    }
}
