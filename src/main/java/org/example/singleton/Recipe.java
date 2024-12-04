package org.example.singleton;

import org.example.Products;
import org.example.observer.Subscriber;
import org.example.table.Table;

import java.util.ArrayList;
import java.util.List;

public final class Recipe implements Subscriber {

    private static volatile Recipe instance = null;
    private final List<Table> tables;

    private Recipe() {

        tables = new ArrayList<>();
    }

    public static Recipe getInstance() {
                if (instance == null) {
                    instance = new Recipe();
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

    @Override
    public void update(String event, Table table) {
        if (event.equals("CLOSED")) {
            tables.add(table);
            System.out.println("Table closed. Total added to recipe: " + table.calculateTableTotal());
        }
    }
}
