package homework_05;

import java.util.Scanner;

public class Homework_05 {

    public static void main(String[] args)
    {
        Task1();
        Task2();
        Task2_2();
        Task3Optional();
        // Task3OptionalMy();
    }

    public static void Task1(){
        /*  Task 1
            Напишите программу, которая будет просить у пользователя ввести его имя с клавиатуры.
            Используя Scanner, сохраните имя в переменную типа String.
            Выведите на экран количество символов в имени пользователя.
            Создайте две переменные типа char: одна должна хранить первый символ имени, другая — последний.
            Выведите на экран десятичный код (код символа в десятичной системе счисления) первого и последнего символа имени.
         */

        System.out.println("\nTask 1");

        System.out.print("Введите \"имя\" с клавиатуры: ");

        Scanner scanner = new Scanner(System.in);

        String userName = scanner.nextLine();

        System.out.println("Количество символов в имени пользователя: " + userName.length());

        char firstLetter = userName.charAt(0);
        char lastLetter = userName.charAt(userName.length() - 1);

        System.out.println("Код первого символа имени в десятичной системе счисления: " + (int)firstLetter);
        System.out.println("Код последнего символа имени в десятичной системе счисления: " + (int)lastLetter);

    }

    public static void Task2(){
        /*
            Task 2
            Создайте строки:
            "Java"
            "is"
            "a"
            "powerful"
            "language"
            Склейте эти строки двумя разными способами, чтобы получить строку: "Java is a powerful language".
            Выведите на экран получившуюся строку и её длину.
         */

        System.out.println("\nTask 2");

        String str1 = "Java";
        String str2 = "is";
        String str3 = "a";
        String str4 = "powerful";
        String str5 = "language";

        System.out.println("First method:");
        String strFirstMethod = str1 + " " + str2 + " " + str3 + " " + str4 + " " + str5;
        System.out.println(strFirstMethod);
        System.out.println("String length = " + strFirstMethod.length());

        System.out.println("Second method:");
        String strSecondMethod = str1.concat(" ").concat(str2).concat(" ").
                concat(str3).concat(" ").concat(str4).concat(" ").concat(str5);
        System.out.println(strSecondMethod);
        System.out.println("String length = " + strSecondMethod.length());
    }

    public static void Task2_2(){
        /*
            Task 2.2
            Замените в результирующей строке слово "powerful" на "super".
            Создайте переменную типа boolean с ответом на вопрос: содержит ли строка подстроку "age"?
            Выведите на экран значение этой переменной.
         */

        System.out.println("\nTask 2.2");

        String str = "Java is a powerful language";

        String strModified = str.replace("powerful","super");
        System.out.println("Modified string: " + strModified);

        boolean containsAge = strModified.contains("age");
        System.out.println("Contains 'age' = " + containsAge);

        // my
        // boolean containsAge2 = strModified.contains(" age"); // false
        // System.out.println("Contains 'age' = " + containsAge2);
    }

    public static void Task3Optional() {
        /*
            Task 3* (Опционально)
            Попросите пользователя ввести строку чётной длины с клавиатуры.
            Распечатайте два средних символа строки.
         */
        System.out.println("\nTask 3 (Optional)");

        System.out.print("Введите строку чётной длины с клавиатуры: ");
        Scanner scanner = new Scanner(System.in);
        String userString = scanner.next();

        if (userString.length() % 2 == 0){
            char firstMiddleIndex = userString.charAt(userString.length() / 2 - 1);
            char secondMiddleIndex = userString.charAt(userString.length() / 2);

            System.out.println("Два средних символа строки: " + firstMiddleIndex + secondMiddleIndex);
        }
        else{
            System.out.println("Строка не чётной длины. Пожалуйста, попробуйте еще раз!");
        }
    }

    // my
    public static void Task3OptionalMy() {
        /*

        * Есть 3 попытки написать строку

            Task 3* (Опционально).
            Попросите пользователя ввести строку чётной длины с клавиатуры.
            Распечатайте два средних символа строки.
         */
        int a = 3;
        while (a > 0) {

            System.out.println("\nУ вас есть " + a + " попытки");
            a--;

            System.out.println("\nTask 3 (Optional)");

            System.out.print("Введите строку чётной длины с клавиатуры: ");
            Scanner scanner = new Scanner(System.in);
            String userString = scanner.next();

            if (userString.length() % 2 == 0){
                char firstMiddleIndex = userString.charAt(userString.length() / 2 - 1);
                char secondMiddleIndex = userString.charAt(userString.length() / 2);

                System.out.println("Два средних символа строки: " + firstMiddleIndex + secondMiddleIndex);
            }
            else{
                System.out.println("Строка не чётной длины. Пожалуйста, попробуйте еще раз!");
            }
            // clearConsole();

            // TODO clearConsole не работает
        }
    }

    public static void clearConsole() {
        // ANSI escape code to clear the console
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
