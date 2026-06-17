package org.example;

// დავალება 3

import java.util.Arrays;
import java.util.List;

public class WeatherStats {

    private List<Integer> temperatures;


    public static void main(String[] args) {

        WeatherStats weather = new WeatherStats();

        weather.temperatures = Arrays.asList(
                -5, 0, 3, 7, 12, 18, 25, 30,
                28, 22, 15, 8, 2, -3, -8,
                10, 20, 35, 40, 28, 15,
                5, -2, 6, 14, 22, 30, 38, 25, 10
        );

        weather.printStats();
    }


    public void printStats() {

        int sum = 0;
        int min = temperatures.get(0);
        int max = temperatures.get(0);


        for (int temp : temperatures) {

            sum = sum + temp;

            if (temp < min) {
                min = temp;
            }

            if (temp > max) {
                max = temp;
            }
        }


        double average = (double) sum / temperatures.size();


        System.out.println("თვის ტემპერატურის სტატისტიკა:");
        System.out.println("საშუალო: " + average );
        System.out.println("მინიმალური: " + min );
        System.out.println("მაქსიმალური: " + max );
    }
}