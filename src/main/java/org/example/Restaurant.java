package org.example;

import org.example.table.TableType;

import java.util.ArrayList;
import java.util.List;

public class Restaurant {

    private final List<Products> product;
    private final List<Table> table;

    public Restaurant() {
        this.product = new ArrayList<>();
        this.table = new ArrayList<>();
    }

    private List<Products> createProductsForTableType(TableType tableType) {
        List<Products> products = new ArrayList<>();
        switch (tableType) {
            case PLEASURE:
                products.add(new PleasureDish("Steak", 20.0));
                products.add(new AlcoholDrink("Wine", 10.0));
                // ...
                break;
            case DIET:
                // ...
                break;
            case VEGAN:
                // ...
                break;
        }

        return products;
    }


        public static void main(String[] args) {



        Table table = new Table(TableType.PLEASURE);

        // Client orders a steak and a wine
        table.addProduct(new PleasureDish("Steak", 20.0));
        table.addProduct(new AlcoholDrink("Wine", 10.0));
    }

}