package homework_08;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class HomeWork_08 {

    public static void Task1(){
        /* Task 1
            Найдите произведение всех чисел от 1 до 15 включительно.
            Результат выведите на экран
         */

        System.out.println("\u001B[93m" + "\nTask 1" + "\u001B[0m");

        long numbersMultSum = 1;

        for (int i = 1; i <= 15; i++){
            numbersMultSum *= i;
        }
        System.out.println("Произведение всех чисел от 1 до 15 включительно = " + numbersMultSum);

    }

    public static void Task2(){
        /* Task 2
            Используйте цикл while для решения задачи:
            Распечатайте 10 строк: "Task1", "Task2", ..., "Task10".
         */
        System.out.println("\u001B[93m" + "\nTask 2" + "\u001B[0m");

        int i = 1;
        while(i <= 10){
            System.out.println("\"Task" + i + "\"");
            i++;
        }
    }

    public static void Task3(){
        /* Task 3
        Используйте цикл while для решения задачи:
        Распечатайте все числа от 1 до 100, которые делятся на 5 без остатка.
         */

        System.out.println("\u001B[93m" + "\nTask 3" + "\u001B[0m");

        int i = 1;
        while(i <= 100){
            if (i % 5 == 0)
                System.out.println(i);
            i++;
        }
    }

    public static void Task3_1Optional(){
        /*  Task 3.1 * (Опционально)
            Распечатайте первые 7 чисел от 1 до 100, которые делятся на 5 без остатка.
         */

        System.out.println("\u001B[93m" + "\nTask 3.1 Optional" + "\u001B[0m");

        int exitCondition = 5 * 7;

        int i = 1;
        while (i <= 100 && i <= exitCondition) {
            if (i % 5 == 0) {
                System.out.println(i);
            }
            i++;
        }
    }

    public static void Task4Optional(){
        /* Task 4 *(Опционально)
            Напишите программу, которая просит пользователя ввести слово "hello".
            Если пользователь вводит правильное слово, программа благодарит его и завершает работу.
            Если вводится неправильное слово, программа продолжает запрашивать ввод, пока не будет введено правильное слово.
            Дополнительно: Подсчитайте количество попыток, потребовавшихся для ввода правильного слова, и выведите это количество на экран.
         */
        Scanner scanner = new Scanner(System.in);

        System.out.println("\u001B[93m" + "\nTask 4" + "\u001B[0m");

        System.out.println("Введите слово \"hello\".");
        String userInput = scanner.nextLine();

        int userInputCount = 1;
        while(!userInput.equals("hello")){
            userInputCount += 1;
            System.out.println("Введите слово \"hello\"");
            userInput = scanner.nextLine();
        }
        System.out.println("Спасибо! До следующего раза.");
        System.out.println("Количество попыток, потребовавшихся для ввода правильного слова: " + userInputCount);

    }

    public static void Task5Optional(){
        /* Task 5 * (Опционально)
            Программа запрашивает у пользователя ввод произвольного числа. Вывести сумму цифр этого числа.
            Пример: 567432 -> 5+6+7+4+3+2 -> 27
         */
        Scanner scanner = new Scanner(System.in);

        System.out.println("\u001B[93m" + "\nTask 5 * (Опционально)" + "\u001B[0m");

        int userInputNumber = 0;
        boolean validInput = false;

        while (!validInput) {
            System.out.println("Введите произвольное число:");
            try {
                userInputNumber = scanner.nextInt();
                validInput = true;
            } catch (InputMismatchException e) {
                System.out.println("Error! Не число! Try again.");
                scanner.next();
            }
        }

        int numberSum = 0;

        while (userInputNumber > 0) {
            numberSum += userInputNumber % 10;
            userInputNumber = userInputNumber / 10;
        }

        System.out.println("Сумма цифр этого числа: " + numberSum);
    }

    public static void Task6(){
        /* Task 6
        Создать массив целых чисел произвольной длины от 5 до 15.
        Заполнить массив случайными значениями от -50 до 50.
        Вывести на экран:
        Минимальное значение в массиве
        Максимальное значение в массиве
        Среднее арифметическое всех значений в массиве
         */

        System.out.println("\u001B[93m" + "\nTask 6" + "\u001B[0m");

        int randomArrayNmb = ThreadLocalRandom.current().nextInt(5,16);

        System.out.println("Создан массив целых чисел, длины: " + randomArrayNmb);

        int[] myArray = new int[randomArrayNmb];

        int myArrayMinValue = 0;
        int myArrayMaxValue = 0;
        double myArraySum = 0;

        System.out.println("Массив: ");

        for (int i = 0; i < myArray.length; i++){

            myArray[i] = ThreadLocalRandom.current().nextInt(-50, 51);
            System.out.print(myArray[i] + "   ");

            myArraySum += myArray[i];

            if (myArray[i] < myArrayMinValue ){
                myArrayMinValue = myArray[i];
            }
            if (myArray[i] > myArrayMaxValue){
                myArrayMaxValue = myArray[i];
            }
        }

        int myArrayAvg = (int)myArraySum / myArray.length;

        System.out.println("\nМинимальное значение в массиве: " + myArrayMinValue);
        System.out.println("Максимальное значение в массиве: " + myArrayMaxValue);
        System.out.println("Среднее арифметическое всех значений в массиве: " + myArrayAvg);
    }

    public static void Task7(){
        /* Task 7. Дан массив целых чисел.
            Поменять местами элементы с максимальным и минимальным значениями.
            Пример: { 5, 6, -25, 0, 31, -15 } -> { 5, 6, 31, 0, -25, -15 }
         */

        System.out.println("\u001B[93m" + "\nTask 7" + "\u001B[0m");

        int[] myArray = new int[6];

        int myArrayMaxValue = 0;
        int myArrayMinValue = 0;

        int firstArrMaxindex = 0;
        int firstArrMinindex = 0;

        System.out.println("1 массив: ");

        for (int i = 0; i < myArray.length; i++){
            myArray[i] = ThreadLocalRandom.current().nextInt(-50, 51);
            System.out.print(myArray[i] + "   ");

            if (myArray[i] < myArrayMinValue ){
                myArrayMinValue = myArray[i];
                firstArrMaxindex = i;
            }
            if (myArray[i] > myArrayMaxValue){
                myArrayMaxValue = myArray[i];
                firstArrMinindex = i;
            }
        }

//        System.out.println("\nIndex of min value = " + firstArrMaxindex);
//        System.out.println("Index of max value = " + firstArrMinindex);

        System.out.println("\n2 массив: ");

        int[] myNewArray = new int[myArray.length];

        for (int i = 0; i < myArray.length; i++){

            myNewArray[i] = myArray[i];
        }

        myNewArray[firstArrMaxindex] = myArray[firstArrMinindex];
        myNewArray[firstArrMinindex] = myArray[firstArrMaxindex];

        for (int i = 0; i < myNewArray.length; i++){

            System.out.print(myNewArray[i] + "   ");
        }
    }

    public static void Task8(){
        /* Task 8 * (Опционально)
        Написать метод, который принимает массив строк.
        Вывести на экран все символы самой длинной строки из массива.
        Пример:  { "One", "Two", "Twenty" } ->
                T
                w
                e
                n
                t
                y
         */

        System.out.println("\u001B[93m" + "\nTask 8 * (Опционально)" + "\u001B[0m");

        String[] myStringArray = { "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eighth", "Nine", "Ten"};

        String biggestStringInArray = "";

        System.out.println("Массив: ");

        for (int i = 0; i < myStringArray.length; i++) {

            System.out.print(myStringArray[i] + "  ");
            if (myStringArray[i].length() > biggestStringInArray.length()) {
                biggestStringInArray = myStringArray[i];
            }
        }

        System.out.println("\nВыводим на экран все символы самой длинной строки из массива: ");

        for (int i = 0; i < biggestStringInArray.length(); i++){
            System.out.println(biggestStringInArray.charAt(i));
        }
    }

    public static void main(String[] args) {
//         Task1();
//         Task2();
//         Task3();
//         Task3_1Optional();
//         Task4Optional();
//         Task5Optional();
//         Task6();
//         Task7();
//         Task8();
    }

}
