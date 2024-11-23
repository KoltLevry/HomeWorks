package homework_47;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

/*
2.2: Определение дня недели и расчёт интервала между датами
Вторая строка для работы: "30/01/23 1:47" (обратите внимание, что 23 — это год).

Ваши задачи:

Определите, на какой день недели приходится эта дата.
Вычислите количество дней между первой и второй датами из заданий.
P.S. :

Используйте соответствующие классы и методы из Java Time API для парсинга и обработки дат и времени.
При решении обращайте внимание на формат входных строк и используйте соответствующие форматеры.
 */
public class WhatIsTheDayOfWeek_2_2 {
    public static void main(String[] args) {
        // 2_2 task
        String strForWork = "30/01/23 1:47";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yy H:mm");
        LocalDateTime parsedDateTime = LocalDateTime.parse(strForWork, formatter);


        System.out.println("эта дата приходится на день недели - " + parsedDateTime.getDayOfWeek().toString().toLowerCase());

        // 2_1 task
        String dateFromFirstTask = "15-12-2022 20-46";
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("dd-MM-yyyy HH-mm");
        LocalDateTime parsedDateTime1 = LocalDateTime.parse(dateFromFirstTask, formatter1);

        long daysBetween = ChronoUnit.DAYS.between(parsedDateTime1, parsedDateTime);
        System.out.println("количество дней между первой и второй датами из заданий: " + daysBetween);

    }
}
