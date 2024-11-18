package org.example;

import org.example.AbstractFactory.ProductCreator;
import org.example.decorator.ExtraDoseProduct;
import org.example.singleton.Recipe;
import org.example.table.*;
import org.example.products.dish.*;
import org.example.products.drink.*;
import org.example.menu.Menu;
import org.example.Products;
import org.example.AbstractFactory.*;
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

            Table table1 = new Table("Lucky Luke", LocalDate.now(), TableType.PLEASURE);

            restaurant.createTable(table1);
            // state variations table1
            restaurant.displayTable(table1);
            table1.welcomeClient(); // set state in_service
            table1.servingProduct(new PleasureDish("Steak", 22.0));
            // Use of decorator. Wrapping is apply after instantiation
            Products strongBeer = new AlcoholDrink("Strong Beer", 8.0);
            Products strongBeerWithExtraDose = new ExtraDoseProduct(strongBeer);
            table1.addProduct(strongBeerWithExtraDose);

            restaurant.displayTable(table1); // in_service
            table1.closingTable(); // set state closed
            restaurant.displayTable(table1); // display name and bill

            Table table2 = new Table("Granny", LocalDate.now(), TableType.VEGAN);
            table2.addProduct(new VeganDish("Cabage and lentils", 12.0));
            table2.addProduct(new LightDrink("Earl Grey Tea", 3.5));
            restaurant.createTable(table2);

            Recipe.getInstance().saveTables(restaurant.getTables()); // save tables in Recipe to check the final Bill
            restaurant.displayAllTables();

      /*      for (Table table : restaurant.getTables()) {
                System.out.println("Total for table of " + table.getClientName() + ": " + table.calculateTableTotal() + "\n" );
            }*/

            double totalBill = recipe.calculateTotalPrice();
            System.out.println("-------------------\n Recipe of today: " + totalBill);
    }
}
