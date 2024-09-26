package homework_10;

import java.util.Arrays;

public class HomeWork_10 {

    public static void task1(int[] myArray, int arrayMaxIndex){
        /* Task 1
            Написать метод со следующим функционалом:
            На вход метод принимает массив целых чисел и число - длину нового массива.
            Метод должен создать и распечатать массив заданной в параметрах длинны.
            В начало массива должны быть скопированы элементы из входящего массива:
            {0, 1, 2, 3, 4, 5, 6} -> copyOfArray(array, 3) -> вывод на печать {0, 1, 2}
            {0, 1, 2} -> copyOfArray(array, 5) -> вывод на печать {0, 1, 2, 0, 0}
            Arrays.copyOf() использовать нельзя. Суть задачи - написать собственную реализацию этого метода
         */

        System.out.println("\u001B[93m" + "\nTask 1" + "\u001B[0m");

        int[] myNewArray = new int[arrayMaxIndex];

        if (myArray.length > arrayMaxIndex){
            for (int i = 0; i < arrayMaxIndex; i++){
                myNewArray[i] = myArray[i];
            }
        } else{
            for (int i = 0; i < myArray.length; i++){
                myNewArray[i] = myArray[i];
            }
            for (int j = myArray.length; j < arrayMaxIndex; j++){
                myNewArray[j] = 0;
            }
        }
        for (int i = 0; i < myNewArray.length; i++){
            System.out.print(myNewArray[i] + " ");
        }
    }

    public static String[] task2(String[] myStrArray) {
    /* Task 2
        Написать метод, принимающий на вход массив строк.
        Метод должен вернуть массив, состоящий из самой короткой и самой длинной строки изначального массива.
     */
        System.out.println("\u001B[93m" + "\n\nTask 2" + "\u001B[0m");

        if (myStrArray == null || myStrArray.length == 0) {
            return new String[0];
        }

        String minStr = myStrArray[0];
        String maxStr = myStrArray[0];

        for (String str : myStrArray) {
            if (str.length() < minStr.length()) {
                minStr = str;
            }
            if (str.length() > maxStr.length()) {
                maxStr = str;
            }
        }
        return new String[]{minStr, maxStr};
    }

    public static int[] task3(int[] myArray){
        /* Task 3
        Написать метод, принимающий на вход массив целых чисел.
        Метод должен вернуть массив, состоящий только из простых чисел, присутствующих в изначальном массиве
        вход -> {0, 13, -25, 11, 31, 55, 98, 11, 5} -> выход {13, 11, 31, 11, 5}
         */
        System.out.println("\u001B[93m" + "\nTask 3" + "\u001B[0m");

        int[] tempArray = new int[myArray.length];
        int count = 0;

        for (int n : myArray) {
            if (isPrime(n)) {
                tempArray[count++] = n;
            }
        }

        int[] primeNumbers = new int[count];
        System.arraycopy(tempArray, 0, primeNumbers, 0, count);

        return primeNumbers;
    }

    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public static void task4Optional(){
        /* Task 4
        Дано: Два отсортированных массива целых чисел.
        Вам нужно найти элемент, который будет находиться на k-й позиции в объединенном отсортированном массиве.
        Массив 1 - {100, 112, 256, 349, 770}
        Массив 2 - {72, 86, 113, 119, 265, 445, 892}
        k = 7
         */
        System.out.println("\u001B[93m" + "\nTask 4" + "\u001B[0m");

        int[] firstIntSortArray = {100, 112, 256, 349, 770};
        int[] secondIntSortArray = {72, 86, 113, 119, 265, 445, 892};

        int newArrayLengthCount = firstIntSortArray.length + secondIntSortArray.length;
        int[] newIntSortArray = new int[newArrayLengthCount];

        System.arraycopy(firstIntSortArray, 0, newIntSortArray, 0, firstIntSortArray.length);
        System.arraycopy(secondIntSortArray, 0, newIntSortArray, firstIntSortArray.length, secondIntSortArray.length);

        Arrays.sort(newIntSortArray);

        System.out.println("k = 7: " + newIntSortArray[7]);

    }

    public static void main(String[] args) {
        int[] myArray = {0, 1, 2, 3, 4, 5, 6};
        task1(myArray, 3);

        String[] myStrArray = {"Today", "is", "a", "nice", "day!"};
        String[] result = task2(myStrArray);
        System.out.println("Массив из самой короткой и самой длинной строки изначального массива: " + result[0] + " " +  result[1]);

        int[] myIntArray = {0, 13, -25, 11, 31, 55, 98, 11, 5};
        int[] resultTask3 = task3(myIntArray);
        System.out.println(Arrays.toString(resultTask3));

        task4Optional();
    }

}
