package org.example.products.drink;

import org.example.table.TableType;

public class LightDrink extends Drink {

    public LightDrink(String name, double price) {
        super(name, price, TableType.DIET);
    }

    @Override
    public TableType getType() { return super.getType(); }
}
