package homework_11;

import java.util.Arrays;
import java.util.Random;

public class HomeWork_11 {

    public static void task1(){
        /* Task 1
            Написать метод, который считает сумму всех элементов в массиве.
         */

        System.out.println("\u001B[93m" + "\nTask 1" + "\u001B[0m");

        Random random = new Random();

        int[] myArray = new int[5];

        int elementsArraySum = 0;

        for (int i = 0; i < myArray.length; i++){
            myArray[i] = random.nextInt(50);
            elementsArraySum += myArray[i];
        }

        System.out.println("Сумма всех элементов в массиве: " + elementsArraySum);
    }

    public static void task2(){
        /* Task 2
            Написать метод, который находит среднее значение элементов в массиве (среднее арифметическое).
         */

        System.out.println("\u001B[93m" + "\nTask 2" + "\u001B[0m");

        Random random = new Random();

        int[] myArray = new int[5];

        int elementsArraySum = 0;

        for (int i = 0; i < myArray.length; i++){
            myArray[i] = random.nextInt(50);
            elementsArraySum += myArray[i];
        }

        System.out.println("Среднее значение элементов в массиве: " + (elementsArraySum / myArray.length));
    }

    public static void task3Optional(){
        /* Task 3. Optional
            Написать метод, который проверяет, является ли массив палиндромом (читается одинаково с обоих концов).
         */

        System.out.println("\u001B[93m" + "\nTask 3 Optional" + "\u001B[0m");

        int[] myArray = {3, 4, 5, 4, 3};

        boolean isPalindrome = false;

        for (int i = 0, k = myArray.length; i < myArray.length; i++, k--){
            if (myArray[i] == myArray[k-1]){
                isPalindrome = true;
            } else{
                isPalindrome = false;
            }

        }

        System.out.println("Является ли массив палиндромом? - " + isPalindrome);
    }

    public static int[] task4Optional(int[] array, int valueToRemove) {
        /* Task 4. Optional
            Написать метод, который удаляет все вхождения заданного числа из массива и возвращает новый массив без этого числа.
         */

        System.out.println("\u001B[93m" + "\nTask 4 Optional" + "\u001B[0m");

        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != valueToRemove) {
                count++;
            }
        }

        int[] newArray = new int[count];
        int index = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] != valueToRemove) {
                newArray[index] = array[i];
                System.out.print(newArray[index] + " ");
                index++;
            }
        }

        return newArray;
    }

    public static void main(String[] args) {
        task1();
        task2();
        task3Optional();

        int[] array = {1, 2, 3, 2, 4, 2, 5};
        int valueToRemove = 2;
        int[] newArray = task4Optional(array, valueToRemove);

    }
}
