package ai_tasks;

import java.util.Arrays;
import ai_tasks.IntStreamTasks;

public class Main {

    public static void main(String[] args) {

        int[]myArray = {1,2,3,4,5};
        IntStreamTasks firstArray = new IntStreamTasks(myArray);
        firstArray.findAvg();

        int[]myArray2 = {2,4,5};
        IntStreamTasks secondArray = new IntStreamTasks(myArray2);
        secondArray.findAvg();

        IntStreamTasks thirdArray = new IntStreamTasks(new int[]{7,8,9}); 
        thirdArray.findAvg();
    }
}