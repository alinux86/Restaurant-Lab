package org.example.products.dish;

import org.example.table.TableType;

public class PleasureDish extends Dish {

    public PleasureDish(String dishName, double price) {
        super(dishName, price, TableType.PLEASURE);
    }
    @Override
    public TableType getType() {
        return super.getType();
    }
}
