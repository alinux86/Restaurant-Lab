package org.example.builder;

import org.example.menu.Menu;

public class MenuFull implements MenuDirector{

    private final InterfaceBuilder builder;

    public MenuFull(InterfaceBuilder builder) {
        this.builder = builder;

    }

    public Menu buildMenu() {
        builder.buildEntree();
        builder.buildDrink();
        builder.buildMain();
        builder.buildDessert();
        builder.buildDrink();
        builder.buildDessert();

        return builder.getMenu();
    }
}
