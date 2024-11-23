package homework_47;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/*
2.1: Парсинг и анализ даты и времени
У вас есть строка: "15-12-2022 20-46".

Используя возможности Java Time API, выполните следующие действия:
Распарсите данную строку в объект LocalDateTime.
После успешного парсинга выведите отдельно:
Месяц
День
Час
 */

public class StringParse_2_1 {
    public static void main(String[] args) {
        String dateStr = "15-12-2022 20-46";

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH-mm");
        LocalDateTime parsedDateTime = LocalDateTime.parse(dateStr, formatter);

        String dateMonth = parsedDateTime.getMonth().toString().toLowerCase();
        String dateDay = parsedDateTime.getDayOfMonth() + "";
        String dateTime = parsedDateTime.getHour() + ":" + parsedDateTime.getMinute();

        System.out.println("У вас есть строка: \"15-12-2022 20-46\".");
        System.out.printf("""
                После parse ->
                Месяц: %s
                День: %s
                Час: %s
                """, dateMonth, dateDay, dateTime);
    }
}
