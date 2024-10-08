//package homework_18;
//
//import java.util.Random;
//
//public class Try {
//}
//
///*
//- Создать 5 объектов класса Dog (из предыдущего ДЗ) со случайным прыжком от 30 до 80
//- Создать массив "барьеров" на 7 значений. Заполнить массив случайными значениями от 70 до 170.
//- Каждая из собак должна по очереди попробовать преодолеть каждый барьер из массива барьеров.
//- Посчитать и вывести на экран сколько барьеров удалось преодолеть каждой собаке
// */
// class Task_5_Optional_Dog {
//    Random random = new Random();
//
//    public Task_5_Optional_Dog() {
//        int[] barriers = new int[]{random.nextInt(70, 170)};
//    }
//}
//
//class Dog{
//    Random random = new Random();
//    public final String name;
//    public int jumpHeight;
//    private int newJumpHeight;
//    private final int maxJumpValue;
//
//    public Dog(String name, int jumpHeight) {
//        this.name = name;
//        this.jumpHeight = jumpHeight;
//        newJumpHeight = jumpHeight;
//        maxJumpValue = 2*jumpHeight;
//    }
//
//    public void jump(){
//        System.out.println("Я пригаю");
//    }
//    public void training(){
//        int jumpHighAfterTrain = random.nextInt(30,81);
//        newJumpHeight += jumpHighAfterTrain;
//        if (newJumpHeight > maxJumpValue){
//            System.out.println("Вище пригнути вже не зможу. Висоту: " + newJumpHeight +" не беру");
//        } else{
//            System.out.printf("Я натренувала %dсм. Пригаю на %dсм. Можу ще!\n", jumpHighAfterTrain, newJumpHeight);
//        }
//    }
//
//    public boolean jumpBarrier(int barrierHigh){
//        if (newJumpHeight > barrierHigh){
//            jump();
//            System.out.println("Я взяла бар'єр!");
//            return false;
//        } else if (barrierHigh < maxJumpValue && barrierHigh > newJumpHeight) {
//            System.out.printf("Висота бар'єра: %d, я пригаю: %d. Треба тренуватися\n", barrierHigh, newJumpHeight);
//            training();
//            return true;
//        } else{
//            System.out.println("Не буру висоту. Бар'єр вище за мою макс висоту");
//            return false;
//        }
//    }
//
//}