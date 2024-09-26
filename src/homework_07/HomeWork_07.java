package homework_07;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HomeWork_07 {

    public static void Task1() {
        /* Task 1
            Необходимо написать программу, которая предлагает пользователю ввести число на выбор: 1, 2 или 3.
            Программа должна сказать, какое число ввёл пользователь: Один, Два, или Три (текстом)
         */
        Scanner scanner = new Scanner(System.in);

        System.out.println("\u001B[93m" + "\nTask 1" + "\u001B[0m");

        System.out.println("Введите число на выбор: 1, 2 или 3");
        String userPrint = scanner.nextLine();

        switch (userPrint) {
            case "1":
                System.out.println("Пользователь ввёл: Один");
                break;
            case "2":
                System.out.println("Пользователь ввёл: Два");
                break;
            case "3":
                System.out.println("Пользователь ввёл: Три");
                break;
            default:
                System.out.println("Пользователь не ввёл число 1, 2 или 3. " + "\u001B[31m" + "Ошибка!" + "\u001B[0m");
        }
    }

    public static void Task2() {
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

    public static void Task3Optional() {
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

        try {
            int userNumber = Integer.parseInt(userString);

            if (userString.length() == 4) {
                // System.out.println("Вы ввели четырехзначное число: " + userNumber);

                int digitThousands = userNumber % 10;
                int digitHundreds = (userNumber / 10) % 10;
                int digitTens = (userNumber / 100) % 10;
                int digitNmbFirst = userNumber / 1000;

                int sumFirstNumbers = digitNmbFirst + digitTens;
                int sumLastNumbers = digitHundreds + digitThousands;

                System.out.println("Является ли число \"счастливым билетом\"? - " + (sumFirstNumbers == sumLastNumbers ? "да!" : "нет!"));
            } else {
                System.out.println("\u001B[31m" + "Ошибка - введенное значение не является четырехзначным числом!" + "\u001B[0m");
            }
        } catch (NumberFormatException e) {
            System.out.println("\u001B[31m" + "Ошибка - введенное значение не является четырехзначным числом!" + "\u001B[0m");
        }
    }

    public static void Task4() {
        /* Task 4
            Напишите программу с использованием оператора switch:
            Программа просит пользователя ввести число от 1 до 7.
            Если число равно 1, выводим на консоль "Понедельник", 2 — "Вторник" и так далее. Если 6 или 7 — "Выходной".
         */
        Scanner scanner = new Scanner(System.in);

        System.out.println("\u001B[93m" + "\nTask 4" + "\u001B[0m");

        System.out.print("Введите число от 1 до 7: ");
        int userPrintInt = scanner.nextInt();

        switch (userPrintInt) {
            case 1:
                System.out.println("Понедельник");
                break;
            case 2:
                System.out.println("Вторник");
                break;
            case 3:
                System.out.println("Среда");
                break;
            case 4:
                System.out.println("Четверг");
                break;
            case 5:
                System.out.println("Пятница");
                break;
            case 6:
            case 7:
                System.out.println("Выходной");
                break;
            default:
                System.out.println("\u001B[31m" + "Error!" + "\u001B[0m" + " Use digits 1-7.");
        }


    }

    public static void Task5Optional() {
        /* Task 5 * (Опционально) Используйте оператор switch для решения задачи:
    Ваш ребенок принес оценку за контрольную работу по математике. В школе 12-балльная система.
    Запишите в переменную случайное число от 0 до 12.
    Вы разрешаете ребенку смотреть телевизор не более 60 минут в день. На сегодня у него осталось 45 минут.
    Если оценка от 10 до 12 баллов: скажите ребенку, как вы рады, и добавьте к оставшемуся времени 1 час.
    Оценка от 7 до 9 баллов: похвалите ребенка и добавьте 45 минут.
    Оценка от 4 до 6 баллов: нейтрально отнеситесь и добавьте 15 минут.
    Оценка 3 балла: огорчитесь и вычтите 30 минут.
    Оценка меньше 3 баллов: запретите телевизор на сегодня.
    Выведите на экран оставшееся время для просмотра ТВ.

    P.S. Проконтролируйте, чтобы ребенок не смотрел ТВ больше 60 минут в день.
         */
        Random random = new Random();

        System.out.println("\u001B[93m" + "\nTask 5" + "\u001B[0m");

//        int childGrade = random.nextInt(13);
        int childGrade = 3;
        System.out.println("Оценка ребенка за контрольную работу по математике: " + childGrade);

        int watchTimeTVToday = 45;

        switch (childGrade){
            case 12:
            case 11:
            case 10:
                System.out.println("Я очень рада! Ты молодец. Смотри телевизор на 1 час больше.");
                watchTimeTVToday  += 60;
                break;
            case 9:
            case 8:
            case 7:
                System.out.println("Ты молодец. Смотри телевизор на 45 мин больше.");
                watchTimeTVToday  += 45;
                break;
            case 6:
            case 5:
            case 4:
                System.out.println("Хорошо. Смотри телевизор на 15 мин больше.");
                watchTimeTVToday  += 15;
                break;
            case 3:
                System.out.println("Я расстроена. Смотри телевизор на 30 мин меньше = " + (watchTimeTVToday -= 30) + " мин");
                break;
            default:
                System.out.println("Запрещаю телевизор на сегодня.");
                watchTimeTVToday  = 0;
                break;
        }

        if (watchTimeTVToday  >= 45) {
            watchTimeTVToday  = 60;
            System.out.println("\u001B[31m" + "\nВы разрешаете ребенку смотреть телевизор не более 60 минут в день. \n " + "\u001B[0m");
            System.out.println("Оставшееся время для просмотра ТВ: " + watchTimeTVToday  + " мин");
        }
    }

    public static void main(String[] args) {
//        Task1();
//        Task2();
//        Task3Optional();
//        Task4();
        Task5Optional();
    }
}
