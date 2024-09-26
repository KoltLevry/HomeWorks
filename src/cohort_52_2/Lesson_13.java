package cohort_52_2;

import java.util.Random;
import java.util.stream.IntStream;

public class Lesson_13 {

    enum CoinSide{
        HEADS, TAILS
    }

    public static CoinSide tossCoin(){
        Random random = new Random();
        return random.nextInt(2) == 0 ? CoinSide.HEADS : CoinSide.TAILS;
    }

    public static void task1(){
        //  Подбросьте монетку 100 раз и подсчитайте, сколько раз выпал орел и сколько решка.
        //  Запишите результаты в массив. Рассчитайте вероятность выпадения орла и решки.

        System.out.println("\u001B[93m" + "\nTask 1" + "\u001B[0m");

        CoinSide[] results = new CoinSide[100];
        IntStream.range(0,100).forEach(i -> results[i] = tossCoin());

        long heads = IntStream.range(0,100).filter(i -> results[i] == CoinSide.HEADS).count();
        long tails = 100 - heads;

        System.out.println("К-ть випадання орла: " + heads);
        System.out.println("К-ть випадання решки: " + tails);

        double headsPercent = (double)heads / 100;
        double tailsPercent = (double)tails / 100;

        System.out.println("Ймовірність випадання орла: " + headsPercent );
        System.out.println("Ймовірність випадання решки: " + tailsPercent );
    }

    public static void main(String[] args) {
        task1();
    }

}

