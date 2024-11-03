package org.example.table;

import org.example.Products;
import org.example.state.Context;
import org.example.state.State;

import java.time.LocalDate;
import java.util.List;

public class Table {
    private final String client;
    private final LocalDate date;
    private final TableType tableType;
    private final List <Products> productList;
    Context context = new Context();

    public Table(String client, LocalDate date, TableType tableType, List <Products> productList) {
        this.client = client;
        this.date = date;
        this.tableType = tableType;
        this.productList = productList;
    }

    // Method for State
    private State state;

    public Context getContext(){
        state = null;
        return context;
    }

    public void setState(State state){
        this.state = state;
    }

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
