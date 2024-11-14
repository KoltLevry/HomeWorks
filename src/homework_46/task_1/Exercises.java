package homework_46.task_1;

import java.time.LocalDate;
import java.time.LocalTime;

public class Exercises {
    public static void main(String[] args) {
        printCurrentDates();
        printBirthday();
        check2DatesEqual();
        printCurrentTimes();
        createDates();
    }

    private static void printCurrentDates() {
        LocalDate now = LocalDate.now();
        int nowGetYear = LocalDate.now().getYear();
        int nowGetMonth = LocalDate.now().getMonthValue();
        int nowGetDayOfMonth = LocalDate.now().getDayOfMonth();
        System.out.printf("""
                Получить и вывести на экран:
                    текущую дату: %s
                    текущий год: %d, месяц: %d и день: %d
                """, now, nowGetYear, nowGetMonth, nowGetDayOfMonth);
    }

    private static void printBirthday() {
        System.out.println("Создать дату - мой день рождения и вывести на экран: " + LocalDate.of(2004,1,17));
    }

    private static void check2DatesEqual() {
        LocalDate dayToCheck1 = LocalDate.of(2000,9,9);
        LocalDate dayToCheck2 = LocalDate.of(2001,9,9);
        String result = dayToCheck1.equals(dayToCheck2) ? "да" : "нет";
        System.out.printf("Равны ли две даты: (%s) и (%s)? - %s \n",dayToCheck1 ,dayToCheck2, result);
    }

    private static void printCurrentTimes() {
        LocalTime now = LocalTime.now();
        LocalTime nowPlusHours = LocalTime.now().plusHours(3);
        System.out.printf("""
        Получить и вывести на экран:
            текущее время: %s
            текущее время + 3 часа: %s
        """, now, nowPlusHours);
    }

    private static void createDates() {
        LocalDate oneWeekLater = LocalDate.now().plusWeeks(1);
        LocalDate oneYearBefore = LocalDate.now().minusYears(1);
        LocalDate oneYearLater = LocalDate.now().plusYears(1);
        LocalDate tomorrow = LocalDate.now().plusDays(1);
        LocalDate yesterday = LocalDate.now().minusDays(1);
        System.out.printf("""
                Создать дату:
                    которая на неделю позже сегодняшней: %s
                    которая была на год раньше сегодняшней используя метод minus: %s
                    которая на год позже сегодняшней: %s
                tomorrow и yesterday и проверить находятся ли они до или после сегодняшней: 
                    завтра - %s сегодня
                    вчера - %s сегодня
                """, oneWeekLater, oneYearBefore, oneYearLater, beforeOrAfterToday(tomorrow), beforeOrAfterToday(yesterday));
    }

    private static String beforeOrAfterToday(LocalDate day) {
        LocalDate today = LocalDate.now();
        return day.isBefore(today) ? "до" : "после";
    }
}
