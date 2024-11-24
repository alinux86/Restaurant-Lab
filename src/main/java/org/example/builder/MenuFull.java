package org.example.builder;

import org.example.menu.Menu;

public class MenuFull {

    private final InterfaceBuilder builder;

    public MenuFull(InterfaceBuilder builder) {
        this.builder = builder;

    }

//dire buildMenuFull? pour différencier de Normal?
    public Menu buildMenu() {
        builder.buildEntree();
        builder.buildDrink();
        builder.buildMain();
        builder.buildDessert();
        builder.buildDrink();
        builder.buildDessert();

        return builder.getMenu();
    }
/*    entree

            mainDish

    dessert1

    dessert2

            drink1
    drink2*/
}
