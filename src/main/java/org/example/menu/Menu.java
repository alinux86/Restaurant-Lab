package org.example.menu;

import org.example.Products;
import org.example.table.TableType;
import java.util.ArrayList;
import java.util.List;

public class Menu implements Products {
    private List<Products> products = new ArrayList<>();
    private String name;
    private TableType type;


    public Menu(String name, TableType type) {
        this.name = name;
        this.type = type;
    }

    public void addProduct(Products product) {
        /*if (product.getType() != type) {
            throw new IllegalArgumentException("Cannot add product of type " + product.getType() + " to a " + type + " menu!");
        }*/
        products.add(product);
    }

    @Override
    public String getName() {
        for (Products product : products) {
            System.out.println(product.getName());
        }
        return products.get(0).getName();
    }

    @Override
    public double getPrice() {
        double total = 0;
        for (Products product : products) {
            total += product.getPrice();
        }
        return total;
    }

    @Override
    public TableType getType() {
        return type;
    }

    // Pour ne pas utiliser getDescription et devoir caster
    public void displayMenu() {
        System.out.println("Menu :\n ");
        for (Products product : products) {
            System.out.println("- " + product.getName() + "\n ");
        }
        System.out.println();
    }
}
