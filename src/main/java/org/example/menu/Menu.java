package org.example.menu;

import org.example.Products;

import java.util.ArrayList;
import java.util.List;

public class Menu implements Products {
    private List<Products> products = new ArrayList<>();

    public void addProduct(Products product) {
        products.add(product);
    }

    public void removeProduct(Products product) {
        products.remove(product);
    }
    @Override
    public String getDescription() {
        for (Products product : products) {
            System.out.println(product.getDescription());
        }
        return products.get(0).getDescription();
    }

    @Override
    public double getPrice() {
        double total = 0;
        for (Products product : products) {
            total += product.getPrice();
        }
        return total - 4.0;
    }
// Pour ne pas utiliser getDescription et devoir caster
    public void displayMenu() {
        System.out.print("Menu :\n ");
        for (Products product : products) {
            System.out.print("- " + product.getDescription() + "\n ");
        }
        System.out.println();
    }

}
