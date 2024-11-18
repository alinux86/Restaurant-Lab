package org.example.singleton;

import org.example.Products;
import org.example.table.Table;

import java.util.ArrayList;
import java.util.List;

public final class Recipe {

    private static volatile Recipe instance = null;
    private final List<Table> tables;

    private Recipe() {

        tables = new ArrayList<>();
    }

    public static Recipe getInstance() {
        if (instance == null) {
            synchronized (Recipe.class) {
                if (instance == null) {
                    instance = new Recipe();
                }
            }

        }
        return instance;
    }

    public void saveTables(List<Table> tables) {
        this.tables.addAll(tables);
    }

    public double calculateTotalPrice() {
        double totalPrice = 0.0;
        for (Table table : tables) {
            for (Products product : table.getProducts()) {
                totalPrice += product.getPrice();
            }
        }
        return totalPrice;
    }
}
