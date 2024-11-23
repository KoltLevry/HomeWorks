package homework_29;

import java.util.regex.Pattern;

public class Person {
    private String email;
    private String password;

    private static final String EMAIL_REGEX = "^[a-zA-Z][\\w.-]*@[\\w-]+\\.[a-zA-Z]{2,}$";
    private static final String PASSWORD_REGEX = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[!%$@&*().,-]+)[A-Za-z\\d!%$@&*().,-]{8,}$";

    public Person(String email, String password) {
        setEmail(email);
        setPassword(password);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (isValidEmail(email)){
            this.email = email;
        } else {
            System.out.println("Invalid email format6: " + email);
        }
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if (isValidPassword(password)){
            this.password = password;
        } else{
            System.out.println("Invalid password format: Password should be at least 8 characters long and contain upper-case, lower-case, digit, and special symbol.");
        }
    }

    private boolean isValidEmail(String email) {
        return Pattern.matches(EMAIL_REGEX, email);
    }

    private boolean isValidPassword(String password){
        return Pattern.matches(PASSWORD_REGEX, password);
    }

    @Override
    public String toString() {
        return "Person{" +
                "email = '" + email + '\'' +
                ", password = '" + password + '\'' +
                '}';
    }
}
