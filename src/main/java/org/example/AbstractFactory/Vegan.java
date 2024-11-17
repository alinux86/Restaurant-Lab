package org.example.AbstractFactory;

import org.example.products.dish.Dish;
import org.example.products.drink.Drink;
import org.example.products.drink.GaseousDrink;

public class Vegan implements ProductCreator {
    @Override
    public Dish createDish(String dishName, double price) {
        return null ;
    }

    @Override
    public Drink createDrink(String drinkName, double price) {
        return new GaseousDrink(drinkName, price);
    }
}
