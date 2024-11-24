package org.example.builder;

import org.example.menu.*;

public interface InterfaceBuilder {

    void buildEntree();

    void buildMain();

    void buildDessert();

    void buildDrink();

    Menu getMenu();

}
