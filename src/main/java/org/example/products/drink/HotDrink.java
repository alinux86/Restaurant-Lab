package org.example.products.drink;

import org.example.table.TableType;

public class HotDrink extends Drink {

    public HotDrink(String name, double price) {
        super(name, price, TableType.DIET);
    }

    @Override
    public TableType getType() { return super.getType(); }
}
