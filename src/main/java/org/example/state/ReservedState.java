package org.example.state;

import javax.naming.Context;

public class ReservedState implements State {
    public void tableState(Context context) {
        System.out.println("Table is reserved");
        context.setState(this);
    }

    public String toString(){
        return "Table is reserved";
    }
}
