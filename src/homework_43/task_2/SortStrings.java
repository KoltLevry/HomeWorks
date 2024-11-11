package homework_43.task_2;


import java.util.ArrayList;
import java.util.List;

/*  Task 2
    Дан список строк.
    Используя Stream API, отфильтруйте строки,
    которые начинаются на определенную букву (например, "A"), удалите дубликаты и отсортируйте их в алфавитном порядке.
    Результат сохраните в новый список строк.
 */
public class SortStrings {
    public static void main(String[] args) {
        List<String> words = List.of("Apple", "banana", "carrot", "AppLe", "banana", "carrot", "aPPle", "banana", "carrot", "Apricot");

        System.out.println("Old words list (all): " + words);

        System.out.println("New words list (unique and sorted): " + filterWords(words));
    }

    private static List<String> filterWords(List<String> words) {
        return words.stream()
                .filter(s -> s.toLowerCase().startsWith("a"))
                .map(s -> s.substring(0,1).toUpperCase() + s.substring(1).toLowerCase())
                .distinct()
                .sorted()
                .toList();

    }
}
