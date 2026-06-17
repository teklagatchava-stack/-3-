package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProductSorter {


    public static List<Product> sortByPrice(List<Product> products) {

        for (int i = 0; i < products.size() - 1; i++) {
            for (int j = 0; j < products.size() - 1 - i; j++) {

                Product product1 = products.get(j);
                Product product2 = products.get(j + 1);


                if (product1.price > product2.price) {
                    products.set(j, product2);
                    products.set(j + 1, product1);
                }
            }
        }

        return products;
    }

    public static void main(String[] args) {


        List<Product> products = new ArrayList<>(Arrays.asList(
                new Product("წიგნი", 15.9),
                new Product("რვეული", 2.5),
                new Product("კალამი", 4.6),
                new Product("ფანქარი", 1.3),
                new Product("პენალი", 20.0)
        ));


        List<Product> sortedProducts = sortByPrice(products);

        System.out.println("პროდუქტები ფასის მიხედვით:");
        for (Product product : sortedProducts) {
            System.out.println(product.title + " - " + product.price + " ლარი");
        }
    }

}