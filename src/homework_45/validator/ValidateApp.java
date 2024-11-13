package homework_45.validator;

public class ValidateApp {

    public static void main(String[] args) {
        // Получаем email от пользователя (Сканером, из другого слоя приложения).
        String email = "te!st@email.com";
        String password = "123456";

        try {
            EmailValidator.isEmailValid(email);
            System.out.println("Email прошел проверку");
        } catch (EmailValidateException e) {
            System.out.println("Email is not valid");
            String message = e.getMessage();
            System.out.println(message);
        }

        try {
            EmailValidator.isPasswordValid(password);
            System.out.println("Password прошел проверку");
        } catch (PasswordValidateException e) {
            System.out.println("Password is not valid");
            System.out.println(e.getMessage());
        }

    }
}