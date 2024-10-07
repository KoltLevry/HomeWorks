package homework_18;

import java.util.Random;

public class Dog {
    private Random randomHigh = new Random();

    private final String myName;
    private final int startJumpHigh;
    private int newJumpHigh;
    private final int maxJumpValue;

    public Dog(String name, int jumpHigh) {
        myName = name;
        startJumpHigh = jumpHigh;
        newJumpHigh = startJumpHigh;
        maxJumpValue = startJumpHigh * 2;
    }

    public void jump() {
        System.out.println("Я можу пригнути на " + newJumpHigh + "см");
    }

    public void training() {
        int trainToJumpHigh = randomHigh.nextInt(11);
        newJumpHigh += trainToJumpHigh;
        if (newJumpHigh >= maxJumpValue) {
            newJumpHigh = maxJumpValue;
            System.out.println("Я досягла максимуму, вище " + newJumpHigh + "см пригати не можу");
            return;
        } else {
            System.out.println("Я потренувалася, можу пригати на " + newJumpHigh + "см");
        }
    }

    public boolean jumpBarrier(int barrierHeight) {
        if (newJumpHigh >= barrierHeight) {
            System.out.println("Я можу подолати бар'єр висотою " + barrierHeight + "см");
            return true;
        } else {
            System.out.println("Я не можу подолати бар'єр висотою " + barrierHeight + "см");
            while (newJumpHigh < barrierHeight && newJumpHigh < maxJumpValue) {
                training();
            }
            if (newJumpHigh >= barrierHeight) {
                System.out.println("Після тренувань я можу подолати бар'єр висотою " + barrierHeight + "см");
                return true;
            } else {
                System.out.println("Навіть після тренувань я не можу подолати бар'єр висотою " + barrierHeight + "см");
                return false;
            }
        }
    }
}

class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Whisky", 30);

        dog.jump();
        dog.training();
        dog.training();
        dog.training();
        dog.training();
        dog.training();
        dog.training();
        dog.training();
        dog.training();
        dog.training();
        dog.training();

        dog.jumpBarrier(50);
        dog.jumpBarrier(70);
    }
}
