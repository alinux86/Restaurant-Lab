package org.example.factory;

import org.example.ProductFactory;
import org.example.dish.Dish;
import org.example.dish.MainDish;
import org.example.drink.AlcoholDrink;
import org.example.drink.Drink;

//concreteFactory
public class PleasureFactory implements ProductFactory {
    @Override
    public Dish createDish() {
        return new MainDish("Steak frites", 22.0);
    }

    @Override
    public Drink createDrink() {
        return new AlcoholDrink("Bière forte", 8.0);
    }
}
