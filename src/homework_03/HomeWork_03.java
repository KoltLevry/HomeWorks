package homework_03;

public class HomeWork_03 {

    public static void main(String[] args) {
        // ctrl + alt + l
        Task2();
        Task3();
        Task3Optional();
    }

    public static void Task1() {
        // Переменная 1 - сколько Вам полных лет
        int myAge = 20;

        // Переменная 2 - должна хранить стоимость 1 литра молока в Вашей стране
        double costOfMilk = 0.99;

        // Переменная 3 - Ваше имя
        String myName = "Tetiana";

    }

    public static void Task2() {
        // Объявите 4 переменных типа int со значениями 0, 1, 2, 3.
        int firstValue = 0;
        int secondValue = 1;
        int thirdValue = 2;
        int fourthValue = 3;

        // Объявите ещё одну переменную int и сохраните в неё сумму этих переменных
        int valuesSum = firstValue + secondValue + thirdValue + fourthValue;
        double numbersDivide = valuesSum / 4f;

        // Выведите на экран значение переменной.
        System.out.println("\nTask 2");
        System.out.println("Среднее арифметическое 4 переменных типа int со значениями 0, 1, 2, 3 = " + numbersDivide);

        // Сколько программа отбросила в дробной части?
        double remnant = numbersDivide - (int)numbersDivide;
        System.out.print("Программа отбросила в дробной части " + remnant);
    }

    public static void Task3(){

        // Пусть цена товара A составляет 1000 Euro, а товара B составляет 500 Euro.

        double A = 1000;
        double B = 500;

        // Если клиент покупает товары вместе, то на них действует скидка 10% на всю покупку.

        double discount = 0.1;

        // Выведите на экран значение переменной, которая соответствует стоимости товаров A+B со скидкой.
        double goodsDiscount = (A + B) * discount;

        System.out.println("\nTask 3");
        System.out.println("Стоимости товаров A (" + A + ") + B (" + B + ") со скидкой 10% на всю покупку = " + (A + B - goodsDiscount) );

        // Отдельно выведите на экран сумму скидки для этой покупки (в деньгах).
        System.out.println("Сумма скидки для этой покупки составляет " + goodsDiscount + " Euro");


    }

    public static void Task3Optional(){

        // Next week temperature of Berlin

        int monday = 15;
        int tuesday = 21;
        int wednesday = 22;
        int thursday = 21;
        int friday = 21;
        int saturday = 20;
        int sunday = 23;

        // Average of temperatures

        float temperatureAvg = (monday+tuesday+wednesday+thursday+friday+saturday+sunday) / 7f;
        System.out.println("\nTask 3 Optional");
        System.out.println("Average temperature in Berlin next week = " + temperatureAvg);
    }

    public static void Task4(){
        // Какие числа могут получаться в качестве остатка от деления какого-либо целого числа на 2? На 3?

        /*
            Остаток от деления на 2:
            0: если число четное
            other: если число нечетное

            Остаток от деления на 3:
            0: если число кратно 3
            other: если число нечетное
         */

    }

}


