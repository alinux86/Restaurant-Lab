package org.example;


import org.example.products.dish.PleasureDish;
import org.example.products.drink.AlcoholDrink;
import org.example.table.*;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Restaurant {

    // définition de la classe. on déclare des liste qui vont stocker des objets
    private final List<Products> product;
    private final List<Table> table;

    // Constructor - initializes Arrays
    public Restaurant() {
        this.product = new ArrayList<>();
        this.table = new ArrayList<>();
    }


    // Méthode Main
        public static void main(String[] args) {
        //Création d'une nouvelle table de type pleasure
        Table table = new Table("John Doe", LocalDate.now(), TableType.PLEASURE);

        // Client orders a steak and a wine
        table.addProduct(new PleasureDish("Steak", 20.0));
        table.addProduct(new AlcoholDrink("Wine", 10.0));
        //table.getProducts();
        System.out.println("Products for Table 1:");
        for (Products product : table.getProducts()) {
            System.out.println(product.getName() + ": " + product.getPrice());
        }

        /*
        A utiliser pour tester la fabrique abstraite

        *   Table table1 = new Table("John Doe", LocalDate.now(), TableType.PLEASURE);
    Table table2 = new Table("Lucky Luke", LocalDate.now(), TableType.DIET);

    // Add products to table1
    table1.addProduct(new PleasureDish("Steak", 20.0));
    table1.addProduct(new AlcoholDrink("Wine", 10.0));

    // Add products to table2
    table2.addProduct(new DietDish("Salad", 15.0));
    table2.addProduct(new NonAlcoholDrink("Water", 2.0));

    // Print products for table1
    System.out.println("Products for Table 1:");
    for (Products product : table1.getProducts()) {
        System.out.println(product.getName() + ": " + product.getPrice());
    }

    // Print products for table2
    System.out.println("\nProducts for Table 2:");
    for (Products product : table2.getProducts()) {
        System.out.println(product.getName() + ": " + product.getPrice());
    }
        * */

    }


}