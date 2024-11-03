package org.example.factory;

import org.example.ProductFactory;
import org.example.dish.Dish;
import org.example.dish.MainDish;
import org.example.drink.Drink;
import org.example.drink.FreshDrink;

public class DietFactory implements ProductFactory {
    @Override
    public Dish createDish() {
        return new MainDish("Caesar Salad", 16.0);
    }

    public Drink createDrink() {
        return new FreshDrink("Fidji Water", 7.0);
    }
}
