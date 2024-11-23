package homework_45.task_1;

/*  Task 1
    Добавить в класс EmailValidator валидацию пароля.
    При провале валидации выбросить исключение: PasswordValidateException
 */

public class EmailValidator {
    private static final String VALID_PASSWORD_REGEX = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[!%$@&*().,-]+)[A-Za-z\\d!%$@&*().,-]{8,}$";
    private static final String VALID_EMAIL_REGEX = "^[a-zA-Z0-9._-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$";

    public static void main(String[] args) {
        System.out.println("Try1");
        try {
            checkEmail("qwe_rty@gmail.com");
            checkPassword("password123");
        } catch (PasswordValidateException e) {
            System.out.println("Caught exception: " + e.getMessage( ));
        }
        System.out.println("Try2");
        try {
            checkPassword("wroNG$21password");
            checkEmail("ql.com");
        } catch (PasswordValidateException e) {
            System.out.println("Caught exception: " + e.getMessage( ));
        }System.out.println("Try3");
        try {
            checkEmail("qwerty@gmail.com");
            checkPassword("coRRect51pa$$word");
        } catch (PasswordValidateException e) {
            System.out.println("Caught exception: " + e.getMessage( ));
        }

    }
    private static void checkEmail(String email) throws PasswordValidateException {
        if (!email.matches(VALID_EMAIL_REGEX) ) {
            throw new PasswordValidateException("Error. Invalid email.");
        } else {
            System.out.println("Valid email!");
        }
    }
    private static void checkPassword(String password) throws PasswordValidateException {
        if (!password.matches(VALID_PASSWORD_REGEX)) {
            throw new PasswordValidateException("Error. Invalid password.");
        } else {
            System.out.println("Valid password!");
        }
    }
}

class PasswordValidateException extends Exception {
    public PasswordValidateException(String message) {
        super(message);
    }
}