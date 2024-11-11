package homework_43.task_1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/*  Task 1
    Напишите метод, принимающий список чисел и возвращающий новый, отфильтрованный список.
    В новом списке должны быть только те числа из старого списка, которые соответствуют всем условиям:
    четные, больше 10 и меньше 100
    Для фильтрации используйте Stream API
 */

public class SortNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1,33,12,152,29,55,-20,10,100,0,44,16);

        System.out.println("Old numbers list (all): " + numbers);

        System.out.println("New numbers list (10-100): " + filterNumbers(numbers));
    }

    private static List<Integer> filterNumbers(List<Integer> numbers) {
        return  numbers.stream()
                .filter(nmb -> nmb % 2 == 0 && nmb > 10 && nmb < 100)
                .collect(Collectors.toList());
    }
}
