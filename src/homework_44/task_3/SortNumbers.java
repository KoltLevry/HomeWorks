package homework_44.task_3;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/*  Task 3
    Имеется список целых чисел.
    Необходимо отфильтровать этот список, оставив только чётные числа,
    затем каждое число умножить на 2, и собрать результат в новый список
 */

public class SortNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1,33,12,152,29,55,-20,10,100,0,44,16);

        System.out.println("Old numbers list (all): " + numbers);

        System.out.println("New numbers list (even and each * 2): " + filterNumbers(numbers));
    }

    private static List<Integer> filterNumbers(List<Integer> numbers) {
        return  numbers.stream()
                .filter(nmb -> nmb % 2 == 0)
                .map(nmb -> nmb * 2)
                .toList(); // = Immutable List
    }
}
