package org.example.products.drink;

import org.example.table.TableType;

public class AlcoholDrink extends Drink {

    public AlcoholDrink(String name, double price) {
        super(name, price, TableType.PLEASURE);
    }

    @Override
    public TableType getType() {
        return super.getType();
    }
}
