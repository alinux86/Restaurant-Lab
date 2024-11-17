package org.example.products.dish;

import org.example.table.TableType;

public class DietDish extends Dish {

    public DietDish(String dishName, double price) {
        super(dishName, price, TableType.DIET);
    }

    @Override
    public TableType getType() {
        return super.getType();
    }
}
