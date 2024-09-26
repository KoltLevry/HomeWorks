package homework_09;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class HomeWork_09 {

    public static void Task0(){
        /* Task 0. Написать метод, принимающий на вход строку.
        Метод должен вывести на экран число, соответсвующее количеству символов в строке.
        Например: Если в метод пришла строка "hello" - метод должен вывести число 5 (так как в строке hello 5 символов)
         */
        System.out.println("\u001B[93m" + "\nTask 0" + "\u001B[0m");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String userInput = scanner.nextLine();
        System.out.println("Вы введи " + userInput.length() + " символов!");
    }

    public static void Task1(int[] myArray){
        /* Task 1
            Написать метод, принимающий массив целых чисел и распечатывающий массив в обратной последовательности.
            {1, 4, 3, 6, 7} -> распечатывает [7, 6, 3, 4, 1]

            Перегрузить метод, если в него приходит индекс, то часть массива слева до этого индекса распечатывается в обычном порядке, а начиная с этого индекса в обратном:
            {1, 4, 3, 6, 7} + индекс 2 - > распечатывает [1, 4, 7, 6, 3]

            Еще одна перегрузка: метод принимает массив и булевый флаг. Если флаг == true -> печатает массив в обратном порядке Если флаг == false -> печатает массив в прямом порядке
         */
        System.out.println("\u001B[93m" + "\nTask 1 first part" + "\u001B[0m");

        System.out.println("My first array: ");
        for (int j : myArray) {
            System.out.print(j + " ");
        }

        System.out.println("\nMy reversed array: ");
        for(int i = myArray.length - 1; i >= 0; i--){
            System.out.print(myArray[i] + " ");
        }
    }

    public static void Task1(int[] myArray, int index){
        /*  Task 1
            Перегрузить метод, если в него приходит индекс, то часть массива слева до этого индекса
            распечатывается в обычном порядке, а начиная с этого индекса в обратном:
            {1, 4, 3, 6, 7} + индекс 2 - > распечатывает [1, 4, 7, 6, 3]
         */
        System.out.println("\u001B[93m" + "\nTask 1 second part" + "\u001B[0m");

        System.out.println("My array:");

        for (int j : myArray){
            System.out.print(j + " ");
        }

        System.out.println("\nMy fixed array:");

        for (int i = 0; i < index; i++){
            System.out.print(myArray[i] + " ");
        }

        for (int k = myArray.length - 1; k >= index; k--){
            System.out.print(myArray[k] + " ");
        }
    }

    public static void Task1(int[] myArray, boolean printArrayReverse){
        /*  Task 1
            Еще одна перегрузка: метод принимает массив и булевый флаг.
            Если флаг == true -> печатает массив в обратном порядке
            Если флаг == false -> печатает массив в прямом порядке
         */
        System.out.println("\u001B[93m" + "\nTask 1 third part" + "\u001B[0m");

        if (!printArrayReverse){
            for (int i = 0; i < myArray.length; i++){
                System.out.print(myArray[i] + " ");
            }
        } else {
            for (int j = myArray.length - 1; j >= 0; j--){
                System.out.print(myArray[j] + " ");
            }
        }

    }

    public static void Task2(int a){
        /* Task 2
            Написать метод, принимающий на вход целое число. Метод должен вывести на экран 2 в степени этоЧисло
            Например: Если в метод пришло число 3 - метод должен вывести число 8 (так как 2 в степени 3 = 8)
            класс Math для нахождения степени числа использовать нельзя ;)
         */
        System.out.println("\u001B[93m" + "\nTask 2" + "\u001B[0m");

        int value = 2;

        int result = 1;

        for (int i = 0; i < a; i++){
            result *= value;
        }

        System.out.println("2^" + a + " = " + result);

    }

    public static void Task3Optional(){
        /* Task 3
        Заполните массив 50 случайными числами от 1 до 100.
        Программа должна найти, и вывести на экран все простые числа.
        Посчитайте сколько получилось таких чисел в массиве.
        Простое число - число, которое делится на цело только на 1 и само себя.
        Пример простых чисел: 3, 5, 7, 11, 13 и т.д.
         */
        System.out.println("\u001B[93m" + "\nTask 3 Optional" + "\u001B[0m");

        int[] myArray = new int[50];

        for (int i = 0; i < myArray.length; i++){
            myArray[i] = ThreadLocalRandom.current().nextInt(1, 101);
        }
        for (int n = 0; n < myArray.length; n++){
            boolean isPrime = true;
            double squareRoot = Math.sqrt(myArray[n]);
            int r = 2;
            while (r <= squareRoot && isPrime) {
                if (myArray[n] % r == 0) isPrime = false;
                r++;
            }
            System.out.print(isPrime ? (myArray[n] + " ") : "");
        }

    }

    public static void Task4Optional(){
        /* Task 4
            Написать программу, выводящую на экран треугольник, состоящий из цифр от 1 до 6 такого вида:
            1
            12
            123
            1234
            12345
            123456
         */
        System.out.println("\u001B[93m" + "\nTask 4" + "\u001B[0m");

        for (int i = 1; i <= 6; i++){
            for (int j = 1; j <= i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void Task5(){
        /* Task 5
            Написать метод, который принимает массив строк.
            Вывести на экран все символы самой длинной строки из массива.
            Пример: { "One", "Two", "Twenty" } ->
            T
            w
            e
            n
            t
            y
         */
        System.out.println("\u001B[93m" + "\nTask 5" + "\u001B[0m");

        String[] myStringArray = { "One", "Two", "Twenty"};

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
//         Task0();
//
//         int[] myArray = {1,4,3,6,7};
//         Task1(myArray);
//         Task1(myArray, 3);
//         Task1(myArray, true);
//
//         Task2(5);
         Task3Optional();
//         Task4Optional();
//         Task5();
    }
}
