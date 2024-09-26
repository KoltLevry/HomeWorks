package homework_06;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.Random;
import java.util.Scanner;

public class HomeWork_06 {

    public static void Task1(){
        /*
            Task 1
            Необходимо написать программу, которая предлагает пользователю ввести число на выбор: 1, 2 или 3.
            Программа должна сказать, какое число ввёл пользователь: Один, Два, или Три (текстом)
         */
        System.out.println("\u001B[93m" + "\nTask 1" + "\u001B[0m");

        System.out.print("Введите число на выбор: 1, 2 или 3: ");

        Scanner scanner = new Scanner(System.in);
        int userNumber = scanner.nextInt();

        switch (userNumber){
            case 1:
                System.out.println("Пользователь ввел один");
                break;
            case 2:
                System.out.println("Пользователь ввел два");
                break;
            case 3:
                System.out.println("Пользователь ввел три");
                break;
            default:
                System.out.println("\u001B[31m" + "Ошибка, пользователь не ввел 1, 2 или 3!" + "\u001B[0m");
        }
    }

    public static void Task2(){
        /*
            Task 2
            Запишите в 4 переменные случайные числа от 0 до 100.
            Выведите все 4 числа на экран.
            Программа должна определить максимальное из этих четырех чисел и вывести результат на экран.
         */
        System.out.println("\u001B[93m" + "\nTask 2" + "\u001B[0m");
        Random random = new Random();

        System.out.println("Четыре случайных числа: ");

        int firstValue = random.nextInt(101);
        int secondValue = random.nextInt(101);
        int thirdValue = random.nextInt(101);
        int fourthValue = random.nextInt(101);

        int[] myNewArray = {firstValue, secondValue, thirdValue, fourthValue};

        System.out.println(firstValue + " - " + secondValue + " - " + thirdValue + " - " + fourthValue);

        int valueMax = Arrays.stream(myNewArray).max().getAsInt();

        System.out.println("Максимальное из этих четырех чисел = " + valueMax);
    }

    public static void Task3Optional(){
        /*  Task 3 (Повышенной сложности, опционально)
            Программа предлагает пользователю ввести четырехзначное число.
            Ввод осуществляется только в формате строки (String).
            Если введенное значение не является четырехзначным числом, должно выводиться сообщение об ошибке, и программа завершает работу.
            Проверить, является ли число "счастливым билетом". Для этого нужно сравнить сумму первых двух цифр с суммой последних двух цифр.
         */

        System.out.println("\u001B[93m" + "\nTask 3 Optional" + "\u001B[0m");

        System.out.print("Введите четырехзначное число: ");
        Scanner scanner = new Scanner(System.in);
        String userString = scanner.next();

        try{
            int userNumber = Integer.parseInt(userString);

            if(userString.length() == 4){
                // System.out.println("Вы ввели четырехзначное число: " + userNumber);

                int digitThousands = userNumber % 10;
                int digitHundreds = (userNumber / 10) % 10;
                int digitTens = (userNumber / 100) % 10;
                int digitNmbFirst = userNumber / 1000;

                int sumFirstNumbers = digitNmbFirst + digitTens;
                int sumLastNumbers = digitHundreds + digitThousands;

                System.out.println("Является ли число \"счастливым билетом\"? - " + (sumFirstNumbers == sumLastNumbers ? "да!" : "нет!"));
            }
            else{
                System.out.println("\u001B[31m" + "Ошибка - введенное значение не является четырехзначным числом!" + "\u001B[0m");
            }
        }
        catch(NumberFormatException e){
            System.out.println("\u001B[31m" + "Ошибка - введенное значение не является четырехзначным числом!" + "\u001B[0m");
        }

    }

    public static void Task4(){
        /*  Task 4
            Попросите пользователя ввести целое число с клавиатуры.
            Ваша программа должна вывести строку в формате.
                Число: 6 четное: true; кратно 3: true; четное и кратное 3: true
                Число: 3 четное: false; кратно 3: true; четное и кратное 3: false
            Проверьте работу вашей программы, вводя разные числа. Убедитесь в правильности выдаваемой строки.
         */
        System.out.println("\u001B[93m" + "\nTask 4" + "\u001B[0m");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите целое число с клавиатуры: ");
        int userNumber = scanner.nextInt();

        boolean isEven = userNumber % 2 == 0;
        boolean isMultipleOfThree = userNumber % 3 == 0;
        boolean isEvenAndMultipleOfThree = isEven && isMultipleOfThree;

        System.out.println("Число: " + userNumber + " четное: " + isEven + ";" + " кратно 3: " + isMultipleOfThree + ";"
                + " четное и кратное 3: " + isEvenAndMultipleOfThree);

        System.out.printf("Число: &d четное: %s; кратно 3: %s; четное и кратное 3: %s", userNumber, isEven, isEvenAndMultipleOfThree);
    }

    public static void main(String[] args){
        Task1();
        Task2();
        Task3Optional();
        Task4();
    }
}
