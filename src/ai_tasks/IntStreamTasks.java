package ai_tasks;

import java.util.stream.IntStream;

class IntStreamTasks {
    // Обчислення середнього значення списку цілих чисел
    private int[] myArr;

    public IntStreamTasks(int[] myArr){
        this.myArr = myArr;
    }

    public double findAvg(){
        double average = IntStream.of(myArr).average().orElse(0);
        System.out.println("Середнє значення: " + average);
        return average;
    }

}
