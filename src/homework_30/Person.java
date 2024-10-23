package homework_30;

public class Person {
    private final String password;

    public Person(String password) {
        this.password = password;
    }

    protected String getPassword() {
        return password;
    }
}
