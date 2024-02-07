package hw12.task3;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UniqueWordsCounter {

    public Map<String, Integer> countUniqueWords(List<String> words) {
        Map<String, Integer> wordFrequencyMap = new HashMap<>();


        for (String word : words) {
            wordFrequencyMap.put(word, wordFrequencyMap.getOrDefault(word, 0) + 1);
        }

        return wordFrequencyMap;
    }


}
