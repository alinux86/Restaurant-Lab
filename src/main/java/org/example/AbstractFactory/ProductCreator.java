package org.example.AbstractFactory;

import org.example.products.dish.Dish;
import org.example.products.drink.Drink;

public interface ProductCreator {
    Dish createDish(String dishName, double price);
    Drink createDrink(String drinkName, double price);
}
