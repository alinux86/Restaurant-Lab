package org.example.factory;

import org.example.ProductFactory;
import org.example.dish.Dish;
import org.example.dish.MainDish;
import org.example.drink.Drink;
import org.example.drink.GaseousDrink;

public class VeganFactory implements ProductFactory {
    @Override
    public Dish createDish() {
        return new MainDish("Vegi Burger", 17.0);
    }

    @Override
    public Drink createDrink() {
        return new GaseousDrink("Kefir Matcha Ginger Lemon", 10.0);
    }
}
