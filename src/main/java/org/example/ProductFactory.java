package org.example;

import org.example.dish.Dish;
import org.example.drink.Drink;

// Abstract factory for creation of Dish and Drink
public interface ProductFactory {
    Dish createDish(String description, Double price);
    Drink createDrink(String description, Double price);
}
