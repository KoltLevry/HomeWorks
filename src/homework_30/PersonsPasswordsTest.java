package homework_30;

import org.junit.Test;

import java.util.regex.Pattern;

public class PersonsPasswordsTest {
    private final String regex = "^(?=.*[a-zA-Z])(?=.*[\\d])(?=.*[!@#$%^&*()\\-_])[A-Za-z\\d!@#$%^&*()\\-_]{8,}$";

    public boolean isValid(String input, String regex) {
        return Pattern.matches(regex, input);
    }

    private void testValidity(String input, String regex) {
        if (isValid(input, regex)) {
            System.out.println("Password: " + input + " є валідним");
        } else {
            System.out.println("Password: " + input + " не є валідним");
        }
    }

    @Test
    public void PasswordValid() {
        Person[] persons = {
                new Person("yfu"), // Не валідний
                new Person("yFu465"), // Не валідний
                new Person("334yfu_!"), // Валідний
                new Person("%yf657ui_10"), // Валідний
                new Person("DSSdf%yf657u_10"), // Валідний
        };

        for (Person person : persons) {
            testValidity(person.getPassword(), regex);
        }
    }
}
