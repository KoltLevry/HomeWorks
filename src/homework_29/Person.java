package homework_29;

public class Person {
    private final String email;
    private final String password;

    public Person(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
}
