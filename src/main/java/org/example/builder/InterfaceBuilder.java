package org.example.builder;

import org.example.menu.*;
// import org.example.products.*;

public interface InterfaceBuilder {

    void buildEntree();

    void buildMain();

    void buildDessert();

    void buildDrink();

    Menu getMenu();

}
