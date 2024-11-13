package homework_45.validator;

public class EmailValidateException extends Exception {
    /*
    Если я хочу создать исключение, достаточно наследоваться от одного из двух классов:
    1. Проверяемое исключение - Exception
    2. Не проверяемое - RuntimeException

    getMessage() - возвращает строку с коротким описание исключения
     */

    public EmailValidateException(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return "Email validate exception | " + super.getMessage();
    }
}