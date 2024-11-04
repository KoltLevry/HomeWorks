package homework_38.task_1;

import java.util.Arrays;
import java.util.Comparator;

/* Task 1
Создайте класс Sportsman с тремя полями: name (имя), age (возраст) и score (рейтинг).
Реализуйте интерфейс Comparable в классе Sportsman, чтобы задать “естественный” порядок сортировки, например, по name.
Создайте отдельный класс, реализующий Comparator, чтобы сортировать объекты класса Sportsman по другому критерию, например, по score.
В методе main создайте массив из нескольких объектов Sportsman.

Отсортируйте его с использованием:
- естественного порядка, определенного в Comparable,
- данного класса Comparator,
- анонимного класса Comparator для сортировки по третьему полю (например, age).
Выведите каждый вариант отсортированного массива в консоль.
 */

public class Sportsman implements Comparable <Sportsman>{
    private final String name;
    private final int age;
    private final int score;

    public Sportsman(String name, int age, int score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getScore() {
        return score;
    }

    @Override
    public int compareTo(Sportsman other) {
        return this.name.compareTo(other.name);
    }

    @Override
    public String toString() {
        return String.format("Sportsman. Name: %-15s Age: %-30s Score: %-45s", name, age, score);
    }
}

class CheckSportsman{
    public static void main(String[] args) {
        System.out.println("\u001B[93m" + "\nTask 1" + "\u001B[0m");

        Sportsman[] sportsmans = {
                new Sportsman("Zina", 50, 70),
                new Sportsman("Nolan", 42, 66),
                new Sportsman("Alice", 30, 80),
                new Sportsman("Bob", 25, 90),
                new Sportsman("Charlie", 35, 100),
                new Sportsman("Den", 20, 40),
                new Sportsman("Marly", 10, 15)
        };

        System.out.println("\nBefore sort:");
        for (Sportsman sportsman : sportsmans) {
            System.out.println(sportsman);
        }

        System.out.println("\nAfter sort 1. Sort by name:");
        Arrays.sort(sportsmans);
        for (Sportsman sportsman : sportsmans) {
            System.out.println(sportsman);
        }

        System.out.println("\nAfter sort 2. Sort by score:");
        SportsmanScoreComparator sportsmanScoreComparator = new SportsmanScoreComparator();
        Arrays.sort(sportsmans, sportsmanScoreComparator);
        for (Sportsman sportsman : sportsmans) {
            System.out.println(sportsman);
        }

        // Сортування за допомогою анонімного класу (за віком)
        Arrays.sort(sportsmans, new Comparator<Sportsman>() {
            @Override
            public int compare(Sportsman s1, Sportsman s2) {
                return Integer.compare(s1.getAge(), s2.getAge());
            }
        });
        System.out.println("\nAfter sort 3. Sort by age:");
        for (Sportsman sportsman : sportsmans) {
            System.out.println(sportsman);
        }
    }
}