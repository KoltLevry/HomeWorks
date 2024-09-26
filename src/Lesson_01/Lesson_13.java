package Lesson_01;

public class Lesson_13 {

    public static int mainIndex(int[] array){
        int min = array[0];
        int minIndex = 0;
        for (int i = 1; i < array.length; i++){
            if (array[i] < min){
                min = array[i];
                minIndex = i;
            }
        }

        return minIndex;
    }

    public static int minIndex(int[] array, int startIndex){
        int min = array[startIndex];
        int minIndex = array[startIndex];
        for (int i = startIndex; i < array.length; i++){
            if (array[i] < min){
                minIndex = array[i];
                minIndex = i;
            }
        }
        return minIndex;
    }

    public static void sortSelection(int[] array){
        for (int i = 0; i < array.length; i++){
            int localMin = minIndex(array, i);

            int temp = array[i];
            array[i] = array[localMin];
            array[localMin] = temp;

        }
    }
}
