package homework_19;
/*
•	Объявите переменную final int MAX_USERS = 100;.
•	Попробуйте изменить значение MAX_USERS в коде после её инициализации.
•	Объясните, что произошло при попытке изменения значения.

 */
public class Task_2 {
    public final int MAX_USERS = 100;

    public Task_2() {
        // MAX_USERS = 5;
        // Cannot assign a value to final variable 'MAX_USERS'
    }
}
