package org.example.state;

import org.example.Products;
import org.example.table.Table;

public class ClosedTable implements State {
    private static ClosedTable instance = null;

    private ClosedTable(){};

    public synchronized static ClosedTable getInstance() {
        if (instance == null) {
            instance = new ClosedTable();
        }
        return instance;
    }

    @Override
    public void welcome(Table table){
        throw new IllegalStateException("Error welcoming already made");
    }

    @Override
    public void serving(Table table, Products product){
        throw new IllegalStateException("Error table closed");
    }

    @Override
    public void closed(Table table){
        throw new IllegalStateException("Error table already close");
    }

    @Override
    public void display(Table table){
        System.out.println(table.calculateTableTotal());
    }
}
