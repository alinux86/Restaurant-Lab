package org.example.builder;

import org.example.menu.Menu;
import org.example.products.dish.PleasureDish;
import org.example.products.drink.AlcoholDrink;
import org.example.table.TableType;

public class PleasureBuilder implements InterfaceBuilder{
    private Menu menu;

    public PleasureBuilder(){
        this.menu = new Menu("Pleasure Menu", TableType.PLEASURE);
    }

    @Override
    public void buildEntree() {
        menu.addProduct(new PleasureDish("Snails in Butter", 6.0));
    }

    @Override
    public void buildMain() {
        menu.addProduct(new PleasureDish("Venison Medallion", 16.0));
    }

    @Override
    public void buildDessert() {
        menu.addProduct(new PleasureDish("Ice Cream \"au Vin Cuit\" ", 9.0));
    }

    @Override
    public void buildDrink() {
        menu.addProduct(new AlcoholDrink("Château du Tertre 2017", 50.0));
    }

    @Override
    public Menu getMenu() {
        return menu;
    }
}
