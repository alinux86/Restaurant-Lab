package org.example.AbstractFactory;

import org.example.products.dish.Dish;
import org.example.products.dish.PleasureDish;
import org.example.products.drink.AlcoholDrink;
import org.example.products.drink.Drink;

public class Pleasure implements ProductCreator{

    @Override
    public Dish createDish(String dishName, double price) {
        return new PleasureDish(dishName, price);
    }

    @Override
    public Drink createDrink(String drinkName, double price) {
        return new AlcoholDrink(drinkName, price);
    }
}
