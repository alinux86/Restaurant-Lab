package org.example;

import org.example.dish.Dessert;
import org.example.dish.Dish;
import org.example.dish.Entree;
import org.example.dish.MainDish;
import org.example.drink.HotDrink;

public class Restaurant {
    public static void main(String[] args) {
    //création de produits pour tester
        Products entree1 = new Entree("Salade verte", 9.0);
        System.out.println(entree1.getDescription() + "... "+ entree1.getPrice());
        Products entree2 = new Entree("Salade Caesar", 16.0);

        Products main1 = new MainDish("Poitrine de poulet aux carrottes", 15.0);
        Products main2 = new MainDish("Tartare de Boeuf au couteau", 32.0);

        Products dessert1 = new Dessert("Mousse au chocolat et crème double", 9.0);
        Products dessert2 = new Dessert("Coupe Danemark", 16.0);
    // test sur les boissons
        Products hotdrink1 = new HotDrink("Thé vert", 4.0);
        System.out.println(hotdrink1.getDescription() + "... "+ hotdrink1.getPrice());
    }

}