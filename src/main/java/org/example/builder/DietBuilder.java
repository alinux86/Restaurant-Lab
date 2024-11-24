package org.example.builder;

import org.example.menu.Menu;
import org.example.table.TableType;

public class DietBuilder implements InterfaceBuilder{
    private Menu menu;
    private TableType type;

    public DietBuilder(){
        // Menu est abstrait, possible que ça cause des troubles
        // ici faut ajout le name et le type
        this.menu = new Menu("Diet Menu", TableType.DIET);
    }


    @Override
    public void buildEntree() {


    }

    @Override
    public void buildMain() {

    }

    @Override
    public void buildDessert() {

    }

    @Override
    public void buildDrink() {

    }

    @Override
    public Menu getMenu() {
        return null;
    }
}
