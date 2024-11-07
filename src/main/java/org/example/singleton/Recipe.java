package org.example.singleton;

import org.example.table.Table;

import java.util.ArrayList;
import java.util.List;

public final class Recipe {

    private static Recipe instance = null();
    private List<Table> tables;

    private Recipe() {
        tables = new ArrayList<Table>();
    }

    public static Recipe getInstance() {
        if (instance == null) {
            synchronized (Recipe.class) {
                if (instance == null) {
                    instance = new Recipe();
                }
            }

        }
        return instance;
    }

    public void saveTables(List<Table> tables) {
        tables.add(tables);
    }
}
