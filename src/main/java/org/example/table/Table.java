package org.example.table;

import org.example.Products;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Table {
    private String clientName;
    private LocalDate date;
    private TableType tableType;
    private List<Products> products;


    //constructeur sans la liste
    public Table(String clientName, LocalDate date, TableType tableType) {
        this.clientName = clientName;
        this.date = date;
        this.tableType = tableType;
        this.products = new ArrayList<>();
    }

    public void addProduct(Products product) {
        products.add(product);
    public void setState(State state){
        this.state = state;
    }
    // si itération dans Table, c'est un void getProducts et on affiche dans la console.
    // mais on veut pouvoir créer une recette du restauran, plus simple d'avoir les products?
    public List<Products> getProducts() {
        // implémenter la logique d'itération sur List products. On veut les produits de la table
        //for (Products product : products) {
        //    System.out.println(product.getDescription());
        //on peut effacer le return car void
        return products;

    public State getState(){
        return state;
    }

    public void welcomeClient() {
        System.out.println("Welcome to " + client);
    }

    public void ServingProduct() {
        for (Products p : productList) {}
    }

    public void closingTable() {
        System.out.println("Closing table");
    }

    public void displayTable() {
        System.out.println("Displaying table");
    }

}
