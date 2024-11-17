package org.example;


import org.example.AbstractFactory.ProductCreator;
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

    // définition de la classe. on déclare des liste qui vont stocker des objets
    private final List<Products> product;
    private final List<Table> tables;

    // Constructor - initializes Arrays
    public Restaurant() {
        this.product = new ArrayList<>();
        this.tables = new ArrayList<>();
    }

    // Methodes pour la classe restaurant (ajout de tables, ajout des produits aux tables, lister les tables avec les produits).
        public void createTable(Table table) {
            // le add c'est la méthode interne add de la liste Table
            this.tables.add(table);
        }


    public void displayTable(Table table) {
        System.out.println("Table Information:");
        System.out.println("Client Name: " + table.getClientName());
        System.out.println("Date: " + table.getDate());
        System.out.println("Table Type: " + table.getTableType());
        System.out.println("Products:");

        for (Products product : table.getProducts()) {
            System.out.println("  - " + product.getName() + " (" + product.getPrice() + ")");
        }
    }

    public void displayAllTables() {
        for (Table table : tables) {
            displayTable(table);
        }
    }


    // Méthode Main
        public static void main(String[] args) {
        Restaurant restaurant = new Restaurant();

            Table table1 = new Table("Lucky Luke", LocalDate.now(), TableType.PLEASURE);
            // Assuming you have a PleasureDish class that implements Products
            table1.addProduct(new PleasureDish("Steak", 20.0)); // Add a specific product
            restaurant.createTable(table1);

            Table table2 = new Table("Granny", LocalDate.now(), TableType.VEGAN);
            table2.addProduct(new VeganDish("Cabage and lentils", 12.0));
            table2.addProduct(new LightDrink("Earl Grey Tea", 3.5));
            restaurant.createTable(table2);

            restaurant.displayAllTables();
    }

}
