package com.bvan.oop.lessons9_10.map;

import java.util.*;

/**
 * @author bvanchuhov
 */
public class WordsCounter {

    public static void main(String[] args) {
        List<String> words = Arrays.asList("Java", "Kotlin", "Kotlin", "Java", "C#", "Python", "JavaScript");
        Map<String, Integer> wordToCount = countWords(words);
        System.out.println(wordToCount);
    }

    public static Map<String, Integer> countWords(List<String> words) {
        Map<String, Integer> wordToCount = new LinkedHashMap<>();

        for (String word : words) {
            if (wordToCount.containsKey(word)) {
                Integer count = wordToCount.get(word);
                wordToCount.put(word, count + 1);
            } else {
                wordToCount.put(word, 1);
            }
        }

        return wordToCount;
    }
}
