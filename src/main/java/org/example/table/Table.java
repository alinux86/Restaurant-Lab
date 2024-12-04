package org.example.table;

import org.example.Products;
import org.example.bridge.Tax;
import org.example.observer.Subscriber;
import org.example.state.ReservedTable;
import org.example.state.State;
import org.example.state.TableState;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Table {
    private String clientName;
    private LocalDate date;
    private TableType tableType;
    private List<Products> products;
    // State of the table
    private State state;
    private Tax tableTax;
    private List <Subscriber> subscribers = new ArrayList<>();


    public Table(String clientName, LocalDate date, TableType tableType, Tax tableTax) {
        this.clientName = clientName;
        this.date = date;
        this.tableType = tableType;
        this.products = new ArrayList<>();

        this.state =  ReservedTable.getInstance(); // instantiation by default
        this.tableTax = tableTax;
    }


    public void addProduct(Products product) {
        products.add(product);
    }

    public List<Products> getProducts() {
        return products;
    }

    public String getClientName() {
        return clientName;
    }

    public LocalDate getDate() {
        return date;
    }

    public TableType getTableType() {
        return tableType;
    }

    public void showTable() {
        double total = 0.0;
        for (Products product : products) {
            System.out.println(product.toString() + " \n");
        }
    }

    public final double calculateTableTotal() {
        double total = 0.0;
        for (Products product : products) {
            total += product.getPrice();
        }
        return total;
    }

    // ****  Method for State  *****

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
/*

    public void welcomeClient() {
        setState(TableState.IN_SERVICE);
        System.out.println("Welcome to " + clientName);
    }

    public void servingProduct(Products product) {
        if (state != TableState.IN_SERVICE) {
            throw new IllegalStateException("Cannot serve products to a table that is not in service!");
        }
        addProduct(product);
        System.out.println("Served table with " + product.getName());
    }

    public void closingTable() {
        setState(TableState.CLOSED);
        double total = calculateTableTotal();
        double tax = getTax();
        System.out.println("Closing table " + clientName + "\n Bill is: " + total +
                                                            "\n Tax is: " + tax +
                                                            "Total amount to pay: " + (total+tax));
        notifySubscribers("CLOSED");
    }
*/

    // **** Method for Bridge ****
    public double getTax(){
        double total = calculateTableTotal();
        return tableTax.getTax(total);
    }

    // **** Method for Observer ****
    public void follow(Subscriber subscriber){
        subscribers.add(subscriber);
    }

    public void unfollow(Subscriber subscriber){
        subscribers.remove(subscriber);
    }

/*    public void notifySubscribers(String event) {
        for (Subscriber subscriber : subscribers) {
            subscriber.update(String event, this);
        }
    }*/
    public void notifySubscribers(String event) {
        for (Subscriber subscriber : subscribers) {
            subscriber.update(event, this);
        }
    }
}
