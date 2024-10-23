package homework_29;

import org.junit.jupiter.api.Test;
import java.util.regex.Pattern;

public class PersonsEmailsAndPasswordsValidTests {

    private static final String regexEmail = "^[a-zA-Z][\\w.-]*@[\\w-]+\\.[a-zA-Z]{2,}$";
    private static final String regexPassword = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[!%$@&*().,-]+)[A-Za-z\\d!%$@&*().,-]{8,}$";

    private boolean isValid(String input, String regex) {
        return Pattern.matches(regex, input);
    }

    @Test
    public void validatePersons() {
        Person[] persons = {
                new Person("john.doe@example.com", "Password123!"),  // +
                new Person("a@example.co", "123gyhA."),              // +
                new Person("_user@domain.com", "123ygAS"),           // -
                new Person("user_123@dom.com", "123DFGassed!"),      // +
                new Person("user@com", "A1b@xyz!,"),                 // -
                new Person("user@domain", "7sa,A23k"),               // -
        };

        for (Person person : persons) {
            testValidity(person.getEmail(), regexEmail, "Email");
            testValidity(person.getPassword(), regexPassword, "Password");
            System.out.println();
        }
    }

    private void testValidity(String input, String regex, String type) {
        if (isValid(input, regex)) {
            System.out.println(type + " є валідним: " + input);
        } else {
            System.out.println(type + " не валідний: " + input);
        }
    }

    public static void main(String[] args) {
        PersonsEmailsAndPasswordsValidTests tests = new PersonsEmailsAndPasswordsValidTests();
        tests.validatePersons();
    }
}
