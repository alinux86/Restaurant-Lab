package org.example.table;

import org.example.AbstractFactory.Diet;
import org.example.AbstractFactory.Pleasure;
import org.example.AbstractFactory.ProductCreator;
import org.example.AbstractFactory.Vegan;

public class TableFactory {

    public static ProductCreator createTable(TableType tableType) {
        return switch (tableType) {
            case DIET -> new Diet();
            case PLEASURE -> new Pleasure();
            case VEGAN -> new Vegan();
            default -> throw new IllegalArgumentException("Invalid table type");
        };
    }


}
