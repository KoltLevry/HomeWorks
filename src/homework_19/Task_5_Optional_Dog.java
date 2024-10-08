package homework_19;

import java.util.Random;

/*
- Создать 5 объектов класса Dog (из предыдущего ДЗ) со случайным прыжком от 30 до 80
- Создать массив "барьеров" на 7 значений. Заполнить массив случайными значениями от 70 до 170.
- Каждая из собак должна по очереди попробовать преодолеть каждый барьер из массива барьеров.
- Посчитать и вывести на экран сколько барьеров удалось преодолеть каждой собаке
 */
public class Task_5_Optional_Dog {
    Random random = new Random();
    public int[] barriers = new int[7];

    public Task_5_Optional_Dog() {
        for(int i = 0; i < barriers.length; i++){
            barriers[i] = random.nextInt(70,171);
        }
    }
}

class Dog extends Task_5_Optional_Dog{
    Random random = new Random();
    public final String name;
    public int jumpHeight;
    private int barrierCount;

    public Dog(String name) {
        this.name = name;
        jumpHeight = random.nextInt(30,81);
    }
    public void barriers(){
        barrierCount = 0;
        for(int barrier : barriers){
            if (jumpHeight > barrier){
                barrierCount++;
            }
        }
        System.out.printf("Кількість бар'єрів, які %s подолав/ла: %d\n", name, barrierCount);
    }

    public static void main(String[] args) {
        String[] names = {"Box", "Cet", "Red", "Blue", "Doggy", "Cat"};
        for(String name : names){
            Dog dog = new Dog(name);
            dog.barriers();
        }
    }
}