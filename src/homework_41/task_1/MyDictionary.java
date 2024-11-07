package homework_41.task_1;

/*  Task 1
    Частотный словарь слов: Напишите метод, который принимает строку текста и возвращает
    Map<String, Integer>, где каждому слову соответствует количество его вхождений в текст.
 */

import java.util.*;

public class MyDictionary {

    public static Map<String, Integer> getString(String someStr) {
        String[] wordsArray = someStr.toLowerCase().split("\\P{L}+");

        Map<String, Integer> map = new LinkedHashMap<>();

        for (String word : wordsArray) {
            if(word.isEmpty()) continue;
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        return map;
    }

    public static void main(String[] args) {
        String testString = "Тестовая строка для удаления слов, которые повторяются - строка для удаления!";
        System.out.println("Map 1: " + MyDictionary.getString(testString));

        String testString2 = "Hello world! Hello, everyone. Hello Java. hello python. java is the best";
        System.out.println("Map 2: " + MyDictionary.getString(testString2));
    }

}
