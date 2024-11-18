package org.example;

import org.example.products.dish.*;
import org.example.products.drink.*;

// Abstract factory for creation of Dish and Drink
public interface ProductFactory {
    Dish createDish(String description, Double price);
    Drink createDrink(String description, Double price);
}
