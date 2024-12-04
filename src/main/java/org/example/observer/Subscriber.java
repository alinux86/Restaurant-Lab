package org.example.observer;

import org.example.table.Table;

public interface Subscriber {
    void update(String event, Table table);
}
    