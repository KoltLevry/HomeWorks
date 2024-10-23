package homework_27;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Person {
    private final String email;
    private final String password;

//    private static final String regex = "^[\\w-\\.] + @[\\w-\\.] + \\.[a-zA-Z]{2,6}$"; // шаблон для email

    private static final String regexEmail = "^[a-zA-Z][\\w.-]*@[\\w-]+\\.[a-zA-Z]{2,}$";
    private static final String regexPassword = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[!%$@&*().,-]+)[A-Za-z\\d!%$@&*().,-]{8,}$";

    public Person(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public void emailCheck(){
        Pattern pattern = Pattern.compile(regexEmail);
        Matcher matcher = pattern.matcher(email);
        if (matcher.matches()){
            System.out.println("Access allowed! Email є валідним");
        } else {
            System.out.println("Access denied! Email не валідний.");
        }
    }

    public void passwordCheck(){
        Pattern pattern = Pattern.compile(regexPassword);
        Matcher matcher = pattern.matcher(password);
        if (matcher.matches()){
            System.out.println("Access allowed! Password є валідним");
        } else {
            System.out.println("Access denied! Password не валідний.");
        }
    }
}

class displayUserInfo{
    public static void main(String[] args) {
        Person[] persons = {
                new Person("john.doe@example.com", "123"), // +
                new Person("a@example.co", "123gyh."), //  +
                new Person("_user@domain.com", "123ygAS"), // -
                new Person("user_123@dom.com", "123DFGassed!"), // +
                new Person("user@com", "A1b@xyz!,"), // -
                new Person("user@domain", "7sa,A23k"), // -
        };

        for (Person person : persons){
            person.emailCheck();
            person.passwordCheck();
            System.out.println();
        }
    }
}