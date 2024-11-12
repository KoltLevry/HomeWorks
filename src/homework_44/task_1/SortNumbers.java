package homework_44.task_1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/*  Task 1
    Из списка целых чисел выделите те значения, которые больше 10; отсортируйте эти значения
    по значению последней цифры в числе и выведите результат на экране
 */

public class SortNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1,33,12,152,29,55,-20,10,100,0,44,16);

        System.out.println("Old numbers list (all): " + numbers);

        System.out.println("New numbers list (> 10): " + filterNumbers(numbers));
    }

    private static List<Integer> filterNumbers(List<Integer> numbers) {
        return  numbers.stream()
                .filter(nmb -> nmb > 10)
                .sorted(Comparator.comparingInt(a -> Math.abs(a) % 10))
                .collect(Collectors.toList()); // = !Immutable List
    }
}
