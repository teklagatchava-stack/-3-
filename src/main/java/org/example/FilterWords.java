package org.example;
//დავალება 6
import java.util.Arrays;
import java.util.List;

public class FilterWords {


    private List<Character> tanxmovnebi = Arrays.asList(
            'ბ','გ','დ','ვ','ზ','თ','კ','ლ','მ','ნ',
            'პ','ჟ','რ','ს','ტ','ფ','ქ','ღ','ყ','შ',
            'ჩ','ც','ძ','წ','ჭ','ხ','ჯ','ჰ'
    );

    public void printWordsWithConsonant(List<String> words) {

        System.out.println("თანხმოვნით დაწყებული სიტყვები:");

        for (String word : words) {


            char firstLetter = word.charAt(0);


            if (tanxmovnebi.contains(firstLetter)) {
                System.out.println(word);
            }
        }
    }

    public static void main(String[] args) {

        FilterWords filter = new FilterWords();

        List<String> sityvebi = Arrays.asList(
                "ვარდი",
                "ია",
                "ენძელა",
                "კალა",
                "ლილია",
                "ორქიდეა"
                       );

        filter.printWordsWithConsonant(sityvebi);
    }
}