package org.example.state;

import org.example.Products;
import org.example.table.Table;

public class ServedTable implements State{
    private static ServedTable instance = null;
    private ServedTable() {};

    public synchronized static ServedTable getInstance() {
        if (instance == null) {
            instance = new ServedTable();
        }
        return instance;
    }

    @Override
    public void welcome(Table table){
    throw new IllegalStateException("Error welcoming already made");
    }

    @Override
    public void serving(Table table, Products product){
        if (product == null) {
            throw new IllegalArgumentException("Error: Product cannot be null");
        }
        table.addProduct(product);
        System.out.println("Product added to table: " + product.getName() + " at " + product.getPrice() + " $");
    }

    @Override
    public void closed(Table table){
        //Add table bill to recipe before observer
        System.out.println("Thank you for the visit you paid: " + table.calculateTableTotal());
        table.setState(ClosedTable.getInstance());
        table.notifySubscribers("close");
    }

    @Override
    public void display(Table table){
        System.out.println("Here your order: ");
        table.showTable();
    }
}
