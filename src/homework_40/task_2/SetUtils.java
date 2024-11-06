package homework_40.task_2;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* Task 2
        Создайте два множества строк (Set<String>),
        каждое из которых будет заполнено различными словами. Некоторые слова должны повторяться в обоих множествах.

        Реализуйте метод union(Set<String> set1, Set<String> set2), который возвращает множество,
        содержащее все уникальные элементы из обоих множеств (объединение множеств).

        Реализуйте метод intersection(Set<String> set1, Set<String> set2), который возвращает множество,
        содержащее только элементы, которые присутствуют в обоих исходных множествах (пересечение множеств).

        Реализуйте метод difference(Set<String> set1, Set<String> set2), который возвращает множество элементов,
        которые есть в первом множестве, но отсутствуют во втором (разность множеств).

        Результат каждого метода необходимо выводить в консоль для наглядности.

        Следует обеспечить, чтобы в исходных множествах были как уникальные,
        так и общие элементы для наглядности результатов операций.
 */
public class SetUtils {

    public static Set<String> union(Set<String> set1, Set<String> set2) {
        Set<String> unionSet = new HashSet<>(set1);

        unionSet.addAll(set2);

        return unionSet;

    }

    public static Set<String> intersection(Set<String> set1, Set<String> set2) {
        Set<String> intersectionSet = new HashSet<>(set1);

        intersectionSet.retainAll(set2);

        return intersectionSet;
    }

    public static Set<String> difference(Set<String> set1, Set<String> set2) {
        Set<String> differencenSet = new HashSet<>(set1);

        differencenSet.removeAll(set2);

        return differencenSet;
    }

    public static void main(String[] args) {
        Set<String> set1 = new HashSet<>(List.of("A", "B", "C", "D"));
        Set<String> set2 = new HashSet<>(List.of("C", "D", "E", "F"));

        System.out.println("set1: " + set1 + " | set2: " + set2);
        System.out.println("union: " + SetUtils.union(set1, set2));
        System.out.println("intersection: " + SetUtils.intersection(set1, set2));
        System.out.println("difference: " + SetUtils.difference(set1, set2));
    }
}
