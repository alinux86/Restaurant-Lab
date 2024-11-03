package org.example.state;

import javax.naming.Context;

public class ServingState implements State{

    public void tableState(Context context) {
        System.out.println("Serving table");
        context.setState(this);
    }

    public String toString(){
        return "Serving table";
    }
}
