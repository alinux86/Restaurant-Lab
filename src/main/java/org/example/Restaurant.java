package org.example;

import org.example.bridge.CompanyTax;
import org.example.bridge.PrivateTax;
import org.example.builder.DietBuilder;
import org.example.builder.InterfaceBuilder;
import org.example.builder.MenuDirector;
import org.example.builder.MenuNormal;
import org.example.decorator.ExtraDoseProduct;
import org.example.singleton.Recipe;
import org.example.table.*;
import org.example.products.dish.*;
import org.example.products.drink.*;
import org.example.menu.Menu;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Restaurant {

    private final List<Products> product;
    private final List<Table> tables;

    public Restaurant() {
        this.product = new ArrayList<>();
        this.tables = new ArrayList<>();
    }

    public void createTable(Table table) {
        this.tables.add(table);
    }
    public List<Table> getTables() {
        return new ArrayList<>(tables); // Return a copy to prevent accidental modifications
    }

    public void displayTable(Table table) {
        System.out.println("\t ~~~~ \nTable Information:");
        System.out.println("  Client Name: " + table.getClientName());
        System.out.println("  Date: " + table.getDate());
        System.out.println("  Table Type: " + table.getTableType());
        System.out.println("Current State: " + table.getState());
        System.out.println("  Products:");

        for (Products product : table.getProducts()) {
            System.out.println("\t- " + product.getName() + " (" + product.getPrice() + ")");

        }
        System.out.printf("Bill of " + table.getClientName() + ": %.2f\n", table.calculateTableTotal());
        System.out.println("\t *** \t \n");
    }

    public void displayAllTables() {
        for (Table table : tables) {
            displayTable(table);
        }
    }


        public static void main(String[] args) {
            Restaurant restaurant = new Restaurant();
            Recipe recipe = Recipe.getInstance();

            Table table1 = new Table("Lucky Luke", LocalDate.now(), TableType.PLEASURE, new CompanyTax());

            restaurant.createTable(table1);
            // state variations table1
            System.out.println("\n *** Etat de la table 1: " + table1.getState() + " *** \n");
            table1.welcomeClient(); // set state in_service
            System.out.println("\n *** Etat de la table 1: " + table1.getState() + " *** \n");
            table1.servingProduct(new PleasureDish("Steak", 22.0));
            // Use of decorator. Wrapping is apply after instantiation
            Products strongBeer = new AlcoholDrink("Strong Beer", 8.0);
            Products bigStrongBeer = new ExtraDoseProduct(strongBeer);
            table1.addProduct(bigStrongBeer);

            table1.closingTable(); // set state closed
            System.out.println("\n *** Etat de la table 1: " + table1.getState() + " *** \n");
            restaurant.displayTable(table1); // display name and bill

            Table table2 = new Table("Granny", LocalDate.now(), TableType.VEGAN, new PrivateTax());
            table2.addProduct(new VeganDish("Cabbage and lentils", 12.0));
            table2.addProduct(new LightDrink("Earl Grey Tea", 3.5));
            restaurant.createTable(table2);

            // Builder
            System.out.println("Labo 3 - Builder");
            InterfaceBuilder buildAMenuDiet = new DietBuilder("Menu Diet");
            MenuDirector smallHunger = new MenuNormal(buildAMenuDiet);
            // appel de la méthode buildMenu dans class MenuNormal
            Menu normalDietMenu = smallHunger.buildMenu();
            normalDietMenu.displayMenu();

            System.out.println("Saving tables before checking the Recipe of the Day");
            Recipe.getInstance().saveTables(restaurant.getTables()); // save tables in Recipe to check the final Bill
            restaurant.displayAllTables();

      /*      for (Table table : restaurant.getTables()) {
                System.out.println("Total for table of " + table.getClientName() + ": " + table.calculateTableTotal() + "\n" );
            }*/

            double totalBill = recipe.calculateTotalPrice();
            System.out.println("-------------------\n Recipe of today: " + totalBill);


    }
}
