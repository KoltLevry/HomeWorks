package homework_43.task_3;

import java.util.List;
import java.util.Objects;

/*  Task 3
    Дан список Person с полями name, age, city. Используйте Stream API для фильтрации людей,
    которые старше определенного возраста и проживают в определенном городе, а затем соберите их в список.
    Например, старше 25 лет и проживающих в городе "Berlin"
 */

public class SortPerson {
    public static void main(String[] args) {
        List<Person> persons = List.of(
                new Person("John", 21, "Berlin"),
                new Person("Jorg", 66, "Berlin"),
                new Person("Anna", 14, "London"),
                new Person("Merry", 33, "Frankfurt"),
                new Person("Bob", 77, "Paris"),
                new Person("Ben", 91, "Berlin"),
                new Person("Don", 40, "Monaco")
        );

        System.out.println("\nOld persons list: " + persons);

        System.out.println("\nNew persons list from Monaco: " + personsSort(persons, "Monaco"));


        System.out.println("\nNew persons list from Berlin: " + personsSort(persons, "Berlin"));
    }

    private static List<Person> personsSort(List<Person> persons, String city) {
        return persons.stream()
                .filter(person -> person.age() > 25 && Objects.equals(person.city(), city))
                .toList();
    }
}

record Person(String name, int age, String city) {

    @Override
    public String toString() {
        return String.format("\nPerson: name = %-5s | age = %-2d | city = %s", name, age, city);
    }
}

