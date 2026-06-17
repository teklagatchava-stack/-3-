package org.example;

import java.util.*;

// დავალება 1

public class RestaurantMenu {

    public static Map<String, List<String>> menu = new HashMap<>();

    public static void main(String[] args) {

        menu.put("წვნიანი", Arrays.asList("ჩიხირთმა", "სოკოს წვნიანი", "ოსპის წვნიანი"));
        menu.put("მეორე კერძი", Arrays.asList("ხინკალი", "მწვადი", "ჩაქაფული"));
        menu.put("დესერტი", Arrays.asList("ბრაუნი", "ჩურჩხელა", "ჩიზქეიქი"));

        printMenuForCategory("წვნიანი");
        printMenuForCategory("მეორე კერძი");
        printMenuForCategory("დესერტი");
    }

    public static void printMenuForCategory(String category) {
        System.out.println("--- " + category + " ---");
        List<String> dishes = menu.get(category);
        for (String dish : dishes) {
            System.out.println(dish);
        }
    }
}