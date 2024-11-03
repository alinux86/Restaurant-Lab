package org.example.state;

import javax.naming.Context;

public class ClosedState implements State {
    public void tableState(Context context) {
        System.out.println("Table closed");
        context.setState(this);
    }

    public String toString() {
        return "ClosedState";
    }
}
