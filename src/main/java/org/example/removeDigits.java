package org.example;
//დავალება 5

public class removeDigits {

    public String removeDigits(String input) {

        String result = "";

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);

            if (c != '0' && c != '1' && c != '2' && c != '3' && c != '4' &&
                    c != '5' && c != '6' && c != '7' && c != '8' && c != '9') {
                result = result + c;
            }
        }

        return result;
    }

    public static void main(String[] args) {

        removeDigits cleaner = new removeDigits();

        System.out.println(cleaner.removeDigits("და1ბა1დე1ბი1ს თა1რი1ღი1: 01.01.1995"));
        System.out.println(cleaner.removeDigits("ა2სა2კი:31"));
        System.out.println(cleaner.removeDigits("პი3რა3დი ნ3ო3მ3ე3რ3ი :01010102021"));
        System.out.println(cleaner.removeDigits("ტ1ე1ლე1ფონ1ის ნ1ომ1ერი: +995597555555"));

    }
}