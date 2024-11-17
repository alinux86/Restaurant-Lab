package org.example.menu;

import org.example.Products;

import java.util.ArrayList;
import java.util.List;

public abstract class Menu implements Products {
    private List<Products> products = new ArrayList<>();

    public void addProduct(Products product) {
        products.add(product);
    }

    public void removeProduct(Products product) {
        products.remove(product);
    }
// Faudrait mettre un string builder pour retourner la description complète en une string
// Ici il affiche chaque produit et
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
        return total - 4.0;
    }

    public void displayMenu() {
        System.out.print("Menu :\n ");
        for (Products product : products) {
            System.out.print("- " + product.getName() + "\n ");
        }
        System.out.println();
    }

}
