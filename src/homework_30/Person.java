package homework_30;

import java.util.regex.Pattern;

public class Person {
    private String password;

    private static final String PASSWORD_REGEX = "^(?=.*[a-zA-Z])(?=.*[\\d])(?=.*[!@#$%^&*()\\-_])[A-Za-z\\d!@#$%^&*()\\-_]{8,}$";

    public Person(String password) {
        if (isValidPassword(password)) {
            this.password = password;
        } else {
            throw new IllegalArgumentException("Invalid password format");
        }
    }

    public String getPassword() {
        return password;
    }

    private boolean isValidPassword(String password) {
        return password != null && Pattern.matches(PASSWORD_REGEX, password);
    }
}
