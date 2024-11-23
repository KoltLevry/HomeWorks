package homework_38.task_3;

import java.util.Arrays;
import java.util.Comparator;


class MyComparator2 implements Comparator<Integer> {
    /*
    Напишите MyComparator2 с методом сравнения для сортировки массива целых чисел в следующем порядке:

    Четные целые числа должны идти перед нечетными числами в порядке возрастания.
    Нечетные целые числа должны идти после четных в порядке убывания
    Integer[] integers = { 1, 6, 5, 4, 7, 8, 9, 2, 7, 3 };
    // Сортировка массива с использованием компаратора
    [2, 4, 6, 8, 9, 7, 7, 5, 3, 1] // Output
     */

    @Override
    public int compare(Integer int1, Integer int2) {
        // Якщо обидва числа парні або обидва непарні - сортуємо за їх значенням
        if (int1 % 2 == 0 && int2 % 2 == 0) {
            return Integer.compare(int1, int2);
        } else if (int1 % 2 != 0 && int2 % 2 != 0) {
            return Integer.compare(int2, int1);
        }
        // Якщо одне з чисел парне, а інше непарне - парне йде першим
        else if (int1 % 2 == 0) {
            return -1;
        } else {
            return 1;
        }
    }
}

class Maincheck {
    public static void main(String[] args) {
        Integer[] integers = {1, 6, 5, 4, 7, 8, 9, 2, 7, 3};

        // Сортування масиву з використанням MyComparator2
        Arrays.sort(integers, new MyComparator2());

        // Друк відсортованого масиву
        System.out.println(Arrays.toString(integers));
    }
}

//    public static void main(String[] args) {
//        Integer[] integers = { 1, 6, 5, 4, 7, 8, 9, 2, 7, 3 };
//
//        Comparator<Integer> comparator = (int1, int2) ->
//                (int1 % 2 == 0 && int2 % 2 != 0) ? -1 :
//                (int1 % 2 != 0 && int2 % 2 == 0) ? 1 :
//                Integer.compare(int1,int2);
//
//    }

