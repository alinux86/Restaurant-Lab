package org.example.builder;

import org.example.menu.Menu;
import org.example.products.dish.VeganDish;
import org.example.products.drink.GaseousDrink;
import org.example.table.TableType;

public class VeganBuilder implements InterfaceBuilder{
    private Menu menu;

    public VeganBuilder(){
        this.menu = new Menu("Vegan Menu", TableType.VEGAN);
    }

    @Override
    public void buildEntree() {
        menu.addProduct(new VeganDish("chickpea chips", 5.0));
    }

    @Override
    public void buildMain() {
        menu.addProduct(new VeganDish("Grilled Tofu with smashed Carrots", 12.0));

    }

    @Override
    public void buildDessert() {
        menu.addProduct(new VeganDish("Peanut Cookie Bar", 5.0)
        );
    }

    @Override
    public void buildDrink() {
        menu.addProduct(new GaseousDrink("Rivella Yellow", 5.0));
    }

    @Override
    public Menu getMenu() {
        return menu;
    }
}
