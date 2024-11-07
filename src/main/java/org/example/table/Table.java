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
    }

    public List<Products> getProducts() {
        return products;
    }
}
