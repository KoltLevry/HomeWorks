package homework_44.task_2;


import java.util.Comparator;
import java.util.List;
import java.util.Optional;

/*  Task 2
    Имеется список строк. Используя Stream API, найдите строку с максимальной длиной.
 */
public class MaxLengthString {
    public static void main(String[] args) {
        List<String> words = List.of("Apple", "banana", "AppLe", "aPPle", "carrot", "Apricot", "avocado");
//        List<String> words = null; // to check

        System.out.println("Old words list (all): " + words);

        filterWords(words).ifPresentOrElse(
                word -> System.out.println("Word with max length: " + word),
                () -> System.out.println("No words found")
        );
    }

    private static Optional<String> filterWords(List<String> words) {
        if (words == null) return Optional.empty();
        return words.stream()
                .max(Comparator.comparing(String::length));

    }
}
