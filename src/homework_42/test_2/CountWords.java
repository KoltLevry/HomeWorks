package homework_42.test_2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountWords {
    public static void main(String[] args) {
        String text = "Hello word, I love Java!";

        int number = 4;
        System.out.println("Количество слов определенной длины: " + number + " - в заданном тексте: " + wordsCount(number, text));
    }

    private static int wordsCount(int number, String text) {
        List<String> words = Arrays.asList(text.split("\\P{L}+"));

        Map<Integer, Integer> map = new HashMap<>();

        words.forEach(word -> {map.put(word.length(), map.getOrDefault(word.length(), 0) + 1);});

        return map.getOrDefault(number, 0);
    }
}
