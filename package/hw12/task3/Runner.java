package hw12.task3;

import java.util.List;
import java.util.Map;

public class Runner {

    public static void main(String[] args) {
        List<String> words = List.of("orange","apple", "Apple", "banana", "apple", "orange", "banana", "apple", "Orange");


        UniqueWordsCounter counter = new UniqueWordsCounter();


        Map<String, Integer> wordFrequencyMap = counter.countUniqueWords(words);


        for (Map.Entry<String, Integer> entry : wordFrequencyMap.entrySet()) {
            System.out.println("Word: " + entry.getKey() + ", Frequency of occurrence: " + entry.getValue());
        }
    }


}
