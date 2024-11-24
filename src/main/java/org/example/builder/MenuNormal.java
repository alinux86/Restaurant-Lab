package org.example.builder;

import org.example.menu.Menu;

public class MenuNormal implements MenuDirector {

    private final InterfaceBuilder builder;

    public MenuNormal(InterfaceBuilder builder) {
        this.builder = builder;
    }

    public Menu buildMenu() {
        builder.buildEntree();
        builder.buildMain();
        builder.buildDessert();
        builder.buildDrink();

        return builder.getMenu();
    }
}
