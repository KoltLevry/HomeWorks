package homework_14;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.Scanner;
import java.util.stream.IntStream;

public class HomeWork_14 {

    public static void task2(){
        // Task 2. Сумма четных чисел. Напишите метод, который вычисляет сумму всех четных чисел в массиве.

        int arrayElementsSum = IntStream.of(1,2,3,4,5,6,7,8,9,10).filter(n -> n % 2 == 0).sum();
    }

    public static void task3Optional(){
        // Task 3 * (Опционально). Найти второе по величине число в массиве
        // Напишите метод, который находит второе по величине число в массиве целых чисел.

        int[] newArr = {5, 8, 3, 6, 19, 1};

        int nextMax = Arrays.stream(newArr)
                .boxed()
                .sorted((a,b) -> b-a)
                .skip(1)
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Array must have at least two elements"));
    }

    public static void task4Optional(String userStr) {
        // Task 4 * (Опционально). Подсчет гласных и согласных
        // Напишите программу, которая просит пользователя ввести слово и подсчитывает количество гласных и согласных букв в этом слове.

        String vowels = "AOUIEYaouiey";
        int vowelCount = 0;
        int consonantCount = 0;

        for (int i = 0; i < userStr.length(); i++) {
            char c = userStr.charAt(i);
            if (vowels.indexOf(c) != -1) {
                vowelCount++;
            } else if (Character.isLetter(c)) {
                consonantCount++;
            }
        }
        System.out.println("В этом слове, количество гласных: " + vowelCount + ", количество согласных: " + consonantCount);
    }

    public static void main(String[] args) {
        task2();
        
        task3Optional();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите слово: ");
        String userString = scanner.nextLine();
        task4Optional(userString);
    }
}
