package org.example.state;

import org.example.Products;
import org.example.table.Table;

public interface State {
    public void welcome(Table table);
    public void serving(Table table, Products product);
    public void closed(Table table);
    public void display(Table table);
}
