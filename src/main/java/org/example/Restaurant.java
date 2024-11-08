package org.example;

import org.example.dish.Dessert;
import org.example.dish.Dish;
import org.example.dish.Entree;
import org.example.dish.MainDish;
import org.example.drink.HotDrink;
import org.example.menu.Menu;
import org.example.singleton.Recipe;
import org.example.state.Context;
import org.example.table.Table;
import org.example.table.TableType;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.example.table.TableType.DIET;
import static org.example.table.TableType.PLEASURE;


public class Restaurant {
    private List<Table> tables;
    private List<Products> products;

    public Restaurant() {
        tables = new ArrayList<>();
        products = new ArrayList<>();
    }

    public void addProduct(Products product) {
        products.add(product);
    }

    public void createTable(String client, LocalDate date, TableType tableType) {
        List<Products> productsForTable = creatProductsForTable(tableType);
        Table table = new Table(client, date, tableType, productsForTable);
        tables.add(table);
    }

    private List<Products> creatProductsForTable(TableType tableType) {
        List<Products> products = new ArrayList<>();

        switch (tableType) {
            case PLEASURE:
                products.add(new Products("Burger", 15.0));
                products.add(new Products("Fries", 5.0));
                products.add(new Products("Soda", 6.0));
                break;

            case DIET:
                products.add(new Products("Salad", 9.0));
                products.add(new Products("Grilled Chicken", 14.0));
                products.add(new Products("Water", 4.0));
                break;

            case VEGAN:
                products.add(new Products("Vegan Burger", 15.0));
                products.add(new Products("Fruit Juice", 7.0));
                products.add(new Products("Salad", 9.0));
                break;
        }
        return products;
    }

    public void displayAllTables() {
        for (Table table : tables) {
            table.displayTable();
            table.welcomeClient();
        }
    }


    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant();

        // sélectionner la table
        restaurant.createTable("Luke", LocalDate.now(), DIET);
        restaurant.createTable("Alice", LocalDate.now(), TableType.PLEASURE);

        restaurant.displayAllTables();

    }
}

