package org.example;

// დავალება 2

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class GeorgianCityGenerator {

    public static List<String> cities = Arrays.asList(
            "თბილისი",
            "ბათუმი",
            "ქუთაისი",
            "რუსთავი",
            "გორი",
            "ზუგდიდი",
            "თელავი",
            "ახალციხე",
            "ოზურგეთი",
            "ამბროლაური"
    );

    public static List<String> regions = Arrays.asList(
            "მცხეთა-მთიანეთი",
            "აჭარა",
            "იმერეთი",
            "ქვემო ქართლი",
            "შიდა ქართლი",
            "სამეგრელო",
            "კახეთი",
            "სამცხე-ჯავახეთი",
            "გურია",
            "რაჭა-ლეჩხუმი"
    );

    public String getRandomCity() {

        Random random = new Random();

        int randomIndex = random.nextInt(cities.size());

        String city = cities.get(randomIndex);
        String region = regions.get(randomIndex);

        return "ქალაქი: " + city + ", რეგიონი: " + region;
    }

    public static void main(String[] args) {

        GeorgianCityGenerator generator = new GeorgianCityGenerator();

        for (int i = 1; i <= 5; i++) {
            System.out.println(i + ". " + generator.getRandomCity());
        }
    }
}