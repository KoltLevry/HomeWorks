package homework_42.test_1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Anagrams {
    public static void main(String[] args) {
//        String[] words = {"listen", "silent"};
        String[] words = {"hello", "billion"};

        System.out.println("Words: " + words[0] + " and " + words[1] + " - " + isAnagram(words));
    }

    private static String isAnagram(String[] words) {
        if (words[0].length() != words[1].length()) return " не анаграммы.";

        Map<Character, Integer> map1 = buildCharFrequencyMap(words[0]);
        Map<Character, Integer> map2 = buildCharFrequencyMap(words[1]);

        return map1.equals(map2) ? "анаграммы." : "не анаграммы.";
    }

    private static Map<Character, Integer> buildCharFrequencyMap(String word) {
        Map<Character, Integer> map = new HashMap<>();
        for (char c : word.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        return map;
    }
}
