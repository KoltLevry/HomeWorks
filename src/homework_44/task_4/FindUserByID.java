package homework_44.task_4;

import java.util.List;
import java.util.Optional;

public class FindUserByID {
    public static void main(String[] args) {
        List<User> users = List.of(
                new User("Mike", 1),
                new User("Anna", 4),
                new User("Em", 13)
        );

        findUserById(users, 13).ifPresentOrElse(System.out::println, () -> System.out.println("No user found"));

        System.out.println("Display user name by id: " + findUserById(users, 1));
    }

    private static Optional<User> findUserById(List<User> users, int id) {
//        return users.stream()
//                .filter(user -> user.id() == id)
//                .peek(System.out::println)
//                .findFirst(); // terminal method
        for(User user : users) {
            if(user.id() == id) return Optional.of(user);
        }
        return Optional.empty();
    }
}

record User(String name, int id) {}