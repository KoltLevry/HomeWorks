package homework_41.task_2;

import java.util.*;

/*  Task 2
    Напишите метод, возвращающий частотный словарь вхождения символов в строку
 */
public class FrequencyDictionary {

    public static Map<String, Integer> frequencyDictionary(String text) {
        String[] wordsArray = text.split("\\P{L}+");
        Map<String, Integer> dict = new LinkedHashMap<>();

        for (String word : wordsArray) {
            dict.put(word, dict.getOrDefault(word, 0) + 1);
        }

        return dict;
    }

    // 1) через String
    public static Map<String, Integer> frequencyCharsDictionary(String text) {
        String[] chars = text.split("\\B");
        Map<String, Integer> dict = new LinkedHashMap<>();

        for (String aChar : chars) {
            dict.put(aChar, dict.getOrDefault(aChar, 0) + 1);
        }

        return dict;
    }

    // 2) через Character
    public static Map<Character, Integer> frequencyRealCharsDictionary(String text) {
        char[] chars = text.toCharArray();
        Map<Character, Integer> dict = new LinkedHashMap<>();

        for (char aChar : chars) {
            dict.put(aChar, dict.getOrDefault(aChar, 0) + 1);
        }

        return dict;
    }


    public static void main(String[] args) {
        String text = "Строка для проверки количества вхождений слов" +
                ".\n Строка для проверки и теста. и количества слов для проверки";

        Map<String, Integer> frequencyMap = frequencyDictionary(text);
        frequencyMap.forEach((key, value) -> System.out.println(key + ": " + value)); // он як можна

        // 1) через String
        Map<String, Integer> frequencyCharsMap = frequencyCharsDictionary(text);

        System.out.println("\nВхождение символов: ");
        frequencyCharsMap.forEach((k, v) -> System.out.print("'" + k + "': " + v+ "; "));
        System.out.println();

        // 2) через Character
        Map<Character, Integer> frequencyRealCharsMap = frequencyRealCharsDictionary(text);

        System.out.println("\nВхождение символов: ");
        frequencyCharsMap.forEach((k, v) -> System.out.print("'" + k + "': " + v+ "; "));
        System.out.println();
    }
}
