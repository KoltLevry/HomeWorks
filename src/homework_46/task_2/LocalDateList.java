package homework_46.task_2;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.List;

/*  Task 2
    Написать метод, принимающий список из нескольких дат типа LocalDate
    и возвращающий количество дней между самой ранней и поздней датами в этом списке
 */
public class LocalDateList {
    public static void main(String[] args) {
        List<LocalDate> dates = List.of(
                LocalDate.of(2023,3,3),
                LocalDate.of(2024,3,3),
                LocalDate.of(2024,3,3)
        );

        long daysBetween = calculateDaysBetween(dates);

        System.out.println("количество дней между самой ранней и поздней датами в списке: " + daysBetween);
    }

    private static long calculateDaysBetween(List<LocalDate> dates) {
        LocalDate min = dates.stream().min(LocalDate::compareTo).get();
        LocalDate max = dates.stream().max(LocalDate::compareTo).get();
        return ChronoUnit.DAYS.between(min, max);
    }
}
