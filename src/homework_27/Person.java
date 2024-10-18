package homework_27;

public class Person {
    private static final String USER_NAME = "Bob";
    private static final String USER_PASSWORD = "qwerty1234";
    private final String name;
    private final String password;

    public Person(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public String checkPassword(){
        if (name.equals(USER_NAME) && password.equals(USER_PASSWORD)){
            return String.format("Доступ дозволено! Вітаємо " + this.name);
        } else{
            return "Запит відхилено! Неправильно введене ім'я чи пароль";
        }
    }
}

class displayUserInfo{
    public static void main(String[] args) {
        Person person1 = new Person("Bob", "de23");
        Person person2 = new Person("Bob", "qwerty1234");
        System.out.println(person1.checkPassword());
        System.out.println(person2.checkPassword());
    }
}