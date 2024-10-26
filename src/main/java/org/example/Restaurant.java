package org.example;

import org.example.dish.Dessert;
import org.example.dish.Entree;
import org.example.dish.MainDish;
import org.example.drink.HotDrink;
import org.example.menu.Menu;

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

        Products entree3 = new Entree("Soupe à la courge", 7.0);
        Products main3 = new MainDish("Médaillon de chevreuil et accompagnement", 18.0);
        Products dessert3 = new Dessert("Tarte à la raisinée", 4.0);
        // test sur le menu
        Products menu1 = new Menu();
        ((Menu) menu1).addProduct(entree3);
        ((Menu) menu1).addProduct(entree2);
        ((Menu) menu1).addProduct(main3);
        ((Menu) menu1).addProduct(dessert3);
        ((Menu) menu1).displayMenu();
        System.out.println("..." + menu1.getPrice());
    }

}