package org.example.products.dish;

import org.example.Products;
import org.example.table.TableType;

public abstract class Dish implements Products {
    protected String name;
    protected double price;
    protected TableType type;

// est-ce que je dois mettre le type en paramètre? Si oui il doit être dans le constructeur, je pense.
    // on dirait qu'il faut quand même créer une variable dans la classe. casselescouilles.
    protected Dish(String name, double price, TableType type) {
        this.name = name;
        this.price = price;
        this.type = type;
    }
    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public TableType getType(){
        return type;
    }
}
