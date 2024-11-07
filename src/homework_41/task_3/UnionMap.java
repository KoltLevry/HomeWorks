package homework_41.task_3;

import java.util.*;

/* Task 3.
    Пересечение двух карт: Реализуйте метод, который принимает две карты Map<String, Integer> и возвращает новую карту,
    содержащую только те записи, ключи которых присутствуют в обеих исходных картах.
    Для совпадающих ключей значение можно брать из любой карты
 */

public class UnionMap {

    public static Map<String, Integer> intersection(Map map1, Map map2) {

        Map<String, Integer> unionWords = new LinkedHashMap<>();

        for (Object entry : map1.keySet()) {
            if (map2.containsKey(entry)) {
                unionWords.put((String) entry, (Integer) map1.get(entry));
            }
        }

        return unionWords;
    }

    public static void main(String[] args) {
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("apple", 50);
        map1.put("banana", 20);
        map1.put("cherry", 30);

        Map<String, Integer> map2 = new HashMap<>();
        map2.put("banana", 25);
        map2.put("cherry", 30);
        map2.put("date", 40);

        Map<String, Integer> intersectionMap = intersection(map1, map2);
        intersectionMap.forEach((key, value) -> System.out.println(key + ": " + value));

    }

}
