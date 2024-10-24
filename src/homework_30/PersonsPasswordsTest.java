package homework_30;

import org.junit.Test;
import static org.junit.Assert.*;

public class PersonsPasswordsTest {

    @Test
    public void testValidPasswords() {
        // Створюємо користувачів із валідними паролями
        Person person1 = new Person("334yfu_!");
        Person person2 = new Person("%yf657ui_10");
        Person person3 = new Person("DSSdf%yf657u_10");

        // Тести на валідність
        assertEquals("334yfu_!", person1.getPassword());
        assertEquals("%yf657ui_10", person2.getPassword());
        assertEquals("DSSdf%yf657u_10", person3.getPassword());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidPasswordTooShort() {
        // Пароль занадто короткий
        new Person("yfu");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidPasswordNoSpecialCharacter() {
        // Немає спеціального символа
        new Person("yFu465");
    }
}
