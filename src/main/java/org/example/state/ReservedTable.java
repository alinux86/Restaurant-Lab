package org.example.state;

import org.example.Products;
import org.example.table.Table;

public class ReservedTable implements State{
    private static ReservedTable instance =null;

    private ReservedTable(){};
    public synchronized static ReservedTable getInstance(){
        if(instance==null){
            instance = new ReservedTable();
        }
        return instance;
    }

    @Override
    public void welcome(Table table){
        System.out.println("Welcome to your Table");
        table.setState(ServedTable.getInstance());
    }

    @Override
    public void serving(Table table, Products product){
        throw new IllegalStateException("Error not ready to be served");
    }

    @Override
    public void closed(Table table){
        throw new IllegalStateException("Error not ready to be closed");
    }

    @Override
    public void display(Table table){
        System.out.println("This is a Reserved Table");
    }
}
