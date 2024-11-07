package org.example;

import org.example.dish.Dessert;
import org.example.dish.Entree;
import org.example.dish.MainDish;
import org.example.drink.HotDrink;
import org.example.menu.Menu;
import org.example.state.Context;
import org.example.table.Table;
import org.example.table.TableType;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.example.table.TableType.DIET;
import static org.example.table.TableType.PLEASURE;


public class Restaurant {
    private List<Products> products;
    private List<Table> tables;
    private LocalDate today = new

    public void addProduct(Products product) {
        products.add(product);
    }

    public void createTable(Table table) {
        tables.add(table);
    }





    public static void main(String[] args) {
    // sélectionner la table
        Table tableDiet = new Table("Luke", , DIET, )
        

    }

}