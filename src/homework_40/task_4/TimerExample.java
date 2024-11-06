package homework_40.task_4;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class TimerExample {

    private static final int arraysSize = 5000;
    private static final int addNewValues = 2000;
    private static final int deleteValues = 1000;
    private static final Random random = new Random();

    public static void main(String[] args) {
        List<Integer> integersArrayList = new ArrayList<>(arraysSize);
        List<Integer> integersLinkedList = new LinkedList<>();
        fullListsWithNumbers(integersArrayList, integersLinkedList);

        System.out.println("\u001B[93m" + "Метод 1: получение всех значений элементов списка по индексу" + "\u001B[0m");
        long arrayListFirstMethodTime = firstMethod(integersArrayList);
        long linkedListFirstMethodTime = firstMethod(integersLinkedList);
        printResult("First Method", arrayListFirstMethodTime, linkedListFirstMethodTime);
        System.out.println();

        System.out.println("\u001B[93m" + "Метод 2: вставка 2_000 новых значений по случайному индексу" + "\u001B[0m");
        List<Integer> arrayListCopy = new ArrayList<>(integersArrayList);
        List<Integer> linkedListCopy = new LinkedList<>(integersLinkedList);
        long arrayListSecondMethodTime = secondMethod(arrayListCopy);
        long linkedListSecondMethodTime = secondMethod(linkedListCopy);
        printResult("Second Method", arrayListSecondMethodTime, linkedListSecondMethodTime);
        System.out.println();

        System.out.println("\u001B[93m" + "Метод 3: удалить 1_000 элементов по случайному индексу" + "\u001B[0m");
        arrayListCopy = new ArrayList<>(integersArrayList);
        linkedListCopy = new LinkedList<>(integersLinkedList);
        long arrayListThirdMethodTime = thirdMethod(arrayListCopy);
        long linkedListThirdMethodTime = thirdMethod(linkedListCopy);
        printResult("Third Method", arrayListThirdMethodTime, linkedListThirdMethodTime);
        System.out.println();

        System.out.println("\u001B[93m" + "Метод 4: удалить 1_000 элементов по значению" + "\u001B[0m");
        arrayListCopy = new ArrayList<>(integersArrayList);
        linkedListCopy = new LinkedList<>(integersLinkedList);
        long arrayListFourthMethodTime = fourthMethod(arrayListCopy);
        long linkedListFourthMethodTime = fourthMethod(linkedListCopy);
        printResult("Fourth Method", arrayListFourthMethodTime, linkedListFourthMethodTime);
    }

    public static void fullListsWithNumbers(List<Integer> integersArrayList, List<Integer> integersLinkedList) {
        for (int i = 0; i < arraysSize; i++) {
            int randomNumber = random.nextInt(1001);
            integersArrayList.add(randomNumber);
            integersLinkedList.add(randomNumber);
        }
    }

    // Метод 1 - отримання всіх значень за індексом
    private static long firstMethod(List<Integer> list) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < list.size(); i++) {
            int value = list.get(i);
        }
        return System.currentTimeMillis() - startTime;
    }

    // Метод 2 - вставка 2_000 нових значень по випадковому індексу
    private static long secondMethod(List<Integer> list) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < addNewValues; i++) {
            int randomIndex = random.nextInt(list.size() + 1);
            int randomValue = random.nextInt(2001);
            list.add(randomIndex, randomValue);
        }
        return System.currentTimeMillis() - startTime;
    }

    // Метод 3 - видалення 1_000 елементів по випадковому індексу
    private static long thirdMethod(List<Integer> list) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < deleteValues; i++) {
            int randomIndex = random.nextInt(list.size());
            list.remove(randomIndex);
        }
        return System.currentTimeMillis() - startTime;
    }

    // Метод 4 - видалення 1_000 елементів по значенню
    private static long fourthMethod(List<Integer> list) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < deleteValues; i++) {
            int randomValue = random.nextInt(10001);
            list.remove((Integer) randomValue);
        }
        return System.currentTimeMillis() - startTime;
    }

    private static void printResult(String methodName, long arrayListTime, long linkedListTime) {
        System.out.printf("%s: ArrayList - %d ms, LinkedList - %d ms. " + "\u001B[91mFaster: %s%n"  + "\u001B[0m",
                methodName, arrayListTime, linkedListTime,
                arrayListTime < linkedListTime ? "ArrayList" : "LinkedList");
    }
}
