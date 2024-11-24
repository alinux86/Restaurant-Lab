package org.example.builder;

import org.example.menu.Menu;
import org.example.products.dish.DietDish;
import org.example.products.drink.LightDrink;
import org.example.table.TableType;

public class DietBuilder implements InterfaceBuilder{
    private Menu menu;

    public DietBuilder(String name){
        this.menu = new Menu( name , TableType.DIET);
    }

    @Override
    public void buildEntree() {
        menu.addProduct(new DietDish("Gaspacho", 5.0));
    }

    @Override
    public void buildMain() {
        menu.addProduct(new DietDish("Poseidon Salad", 12.0));
    }

    @Override
    public void buildDessert() {
        menu.addProduct(new DietDish("Fruits Salad", 5.0));
    }

    @Override
    public void buildDrink() {
        menu.addProduct(new LightDrink("Homemade Ice Tea", 4.0));
    }

    @Override
    public Menu getMenu() {
        return menu;
    }
}
