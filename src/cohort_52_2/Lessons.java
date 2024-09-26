package cohort_52_2;

import java.util.Arrays;
import java.util.Random;

public class Lessons {

    public static void l_11_t_1(){
        /* Задача 1
            Задан массив целых чисел: 65, 37, 51, -17, 73, -41, 52, 56, -55, 83.
            Найдите максимальный элемент массива и его индекс.
         */
        System.out.println("\u001B[93m" + "\nTask 1" + "\u001B[0m");

        int[] intArray = {65, 37, 51, -17, 73, -41, 52, 56, -55, 83};

        int max = intArray[0];
        int min = intArray[0];
        int indexByMax = 0;
        int indexByMin = 0;

        for (int i = 0; i <intArray.length; i++){

            if (intArray[i] > max) {
                max = intArray[i];
                indexByMax = i; }
            if (intArray[i] < min) {
                min = intArray[i];
                indexByMin = i; }
        }

        System.out.println("максимальный элемент массива: " + max + " и его индекс: " + indexByMax);
        System.out.println("минимальный элемент массива: " + min + " и его индекс: " + indexByMin);

    }

    public static void l_11_t_2(){
        // У стрелка есть 10 попыток поразить мишень. Смоделируйте 10 выстрелов с помощью датчика случайных чисел.
        // Ответьте на вопрос, сколько очков набрал стрелок? Попал ли он хоть раз в центр мишени?

        System.out.println("\u001B[93m" + "\nTask 2" + "\u001B[0m");

        int shootTry = 10;
        int pointSum = 0;
        int hitCount = 0;
        boolean yesHit = false;

        Random random = new Random();

        for (int i = 0; i < shootTry; i++) {
            int score = random.nextInt(11);
            pointSum += score;
            if (score == 10) {
                yesHit = true;
                hitCount++;
            }
            System.out.println("Залишилося спроб: " + (shootTry - i - 1) + ", Набрано очок: " + score);
        }

        System.out.println("Скільки очок набрав стрілець: " + pointSum);
        System.out.println("Попав він хоч раз в центр мішені: " + (yesHit ? "Так" : "Ні") + ". Кількість влучень в центр: " + hitCount);
    }

    public static void l_11_t_3(int[] array){
        // Написать метод, принимающий массив целых чисел, и возвращающий среднее арифметическое всех его элементов.
        // Проверьте его работу на массиве ageOfGroup = {47, 49, 37, 47, 52, 60, 44, 34, 38, 59, 18, 38, 35, 41, 18, 43};
        System.out.println("\u001B[93m" + "\nTask 3" + "\u001B[0m");

        int elementsSum = 0;
        for (int i = 0; i < array.length; i++){
            elementsSum += array[i];
        }
        System.out.println("Среднее арифметическое массива: " + (elementsSum / array.length));
    }

    public static void l_11_t_4(int[] array){
        // Написать метод, принимающий массив целых чисел, и "разворачивающий" его.
        // Последний элемент становится нулевым, предпоследний, первым, и т. д.
        // Подсказка: этот метод должен изменить полученный массив, а не распечатать его в обратном порядке.

        System.out.println("\u001B[93m" + "\nTask 3" + "\u001B[0m");

        int[] newArray = new int[array.length];

        for (int i = 0, k = array.length - 1; i < array.length; i++, k--){
            newArray[i] = array[k];
            System.out.print(newArray[i] + " ");
        }
    }

    public static void main(String[] args) {
        l_11_t_1();
        l_11_t_2();

        int[] ageOfGroup = {47, 49, 37, 47, 52, 60, 44, 34, 38, 59, 18, 38, 35, 41, 18, 43};
        l_11_t_3(ageOfGroup);

          int[] myArray = {47, 2, 37, 41, 5, 110};
          l_11_t_4(myArray);
    }
}
