package homework_40.task_1;

/*  Task 1
    Напишите метод, принимающий строку и возвращающий Список ее слов без повторений,
    отсортированный в порядке увеличения длин слов.
    Если строки имеют одинаковую длину - сортировать в естественном порядке
 */

import java.util.*;

public class StringUtil {

    public static List<String> getUniqueSortedWords(String someStr) {
        String[] wordsArray = someStr.split("[\\s.,!?\"'\\-;:]+");

        Set<String> uniqueWordsSet = new HashSet<>(Arrays.asList(wordsArray));

        List<String> uniqueWordsList = new ArrayList<>(uniqueWordsSet);
        uniqueWordsList.sort(Comparator.comparing(String::length));

        return uniqueWordsList;
    }

    public static void main(String[] args) {
        String testString = "Тестовая строка для удаления слов, которые повторяются. \"строка\" для удаления!";
        System.out.println(StringUtil.getUniqueSortedWords(testString));
    }

}
