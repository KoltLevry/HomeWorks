package MyProjects;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class DaysRemaining {

    public static void LeftUntilToTheNewYear(){

        System.out.println("\u001B[93m" + "\nПерша найблища дата" + "\u001B[0m");

        LocalDate today = LocalDate.now();

        LocalDate newYear = LocalDate.of(2024, 12, 31);
        Period period = Period.between(today, newYear);

        int daysRemaining = period.getDays();
        int monthsRemaining = period.getMonths();

        System.out.println("До нового року залишилося: " + monthsRemaining +
                " місяців, " + daysRemaining + " днів.");

        long calendarDays = ChronoUnit.DAYS.between(today, newYear);

        System.out.println("Календарних днів: " + calendarDays);
    }

    public static void LeftUntilToMyBirthday(){

        System.out.println("\u001B[93m" + "\nДруга найблища дата" + "\u001B[0m");

        LocalDate today = LocalDate.now();

        LocalDate myBirthday = LocalDate.of(2025, 1, 17);
        Period period = Period.between(today, myBirthday);

        int daysRemaining = period.getDays();
        int monthsRemaining = period.getMonths();

        System.out.println("До мого дня народження залишилося: " + monthsRemaining +
                " місяців, " + daysRemaining + " днів.");

        long calendarDays = ChronoUnit.DAYS.between(today, myBirthday);

        System.out.println("Календарних днів: " + calendarDays);
    }

    public static void LeftUntilToTheLastDayOfTheUniSemester(){

        System.out.println("\u001B[93m" + "\nТретя найблища дата" + "\u001B[0m");

        LocalDate today = LocalDate.now();

        LocalDate toTheEndOfFirstSemester = LocalDate.of(2025, 1, 25);
        Period period = Period.between(today, toTheEndOfFirstSemester);

        int daysRemaining = period.getDays();
        int monthsRemaining = period.getMonths();

        System.out.println("До кінця 1 семестру залишилося: " + monthsRemaining +
                " місяців, " + daysRemaining + " днів.");

        long calendarDays = ChronoUnit.DAYS.between(today, toTheEndOfFirstSemester);

        System.out.println("Календарних днів: " + calendarDays);
    }

    public static void LeftUntilToTheLastDayOfTheITCourse(){

        System.out.println("\u001B[93m" + "\nЧетверта найблища дата" + "\u001B[0m");

        LocalDate today = LocalDate.now();

        LocalDate toITKurs = LocalDate.of(2025, 4, 9);
        Period period = Period.between(today, toITKurs);

        int daysRemaining = period.getDays();
        int monthsRemaining = period.getMonths();
        int yearsRemaining = period.getYears();

        System.out.println("До кінця ІТ курсу залишилося: " + monthsRemaining +
                " місяців, " + daysRemaining + " днів.");

        long calendarDays = ChronoUnit.DAYS.between(today, toITKurs);

        System.out.println("Календарних днів: " + calendarDays);
    }

    enum DayOfWeek{
        Monday,
        Tuesday,
        Wednesday,
        Thursday,
        Friday,
        Saturday,
        Sunday
    }


    public static void main(String[] args) {
//        System.out.println("\u001B[92m" + "\nToday is: " + LocalDate.now() + "\u001B[0m" + " \t Day: " + LocalDate.of(2024,19,9));
        System.out.println("\u001B[92m" + "\nToday is: " + LocalDate.now()  + " \tDay: " + "Thursday" + "\u001B[0m");
        LeftUntilToTheNewYear();
        LeftUntilToMyBirthday();
        LeftUntilToTheLastDayOfTheUniSemester();
        LeftUntilToTheLastDayOfTheITCourse();

    }

}
