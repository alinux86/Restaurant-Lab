package org.example.products.drink;

import org.example.table.TableType;

public class FreshDrink extends Drink {

    public FreshDrink(String name, double price) {
        super(name, price, TableType.DIET);
    }

    @Override
    public TableType getType() {
        return super.getType();
    }
}
