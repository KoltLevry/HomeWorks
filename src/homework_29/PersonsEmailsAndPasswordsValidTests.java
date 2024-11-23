package homework_29;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PersonsEmailsAndPasswordsValidTests {
    @Test
    public void testValidEmail(){
        Person person = new Person("john.doe@example.com", "Password123!");
        assertEquals("john.doe@example.com", person.getEmail());
    }
    @Test
    public void testInvalidEmail(){
        Person person = new Person("invalid_email@", "Password123!");
        assertNotEquals("<EMAIL>", person.getEmail());
    }
    @Test
    public void testValidPassword(){
        Person person = new Person("john.doe@example.com", "Password123!");
        assertEquals("Password123!", person.getPassword());
    }
    @Test
    public void testInvalidPassword(){
        Person person = new Person("john.doe@example.com", "short");
        assertNotEquals("short", person.getPassword());
    }
}
