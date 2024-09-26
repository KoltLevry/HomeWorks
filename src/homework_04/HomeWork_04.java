package homework_04;

public class HomeWork_04 {

    public static void main(String[] args) {
        task1();
        task2();
        task3Optional();
        task4Optional();
    }

    public static void task1(){
        /* Task 1. Неявное преобразование int в double
            Напишите программу, которая:
            Объявляет переменную типа int и присваивает ей значение 10.
            Присваивает значение этой переменной в переменную типа double с именем myDouble.
            Выводит значение myDouble на экран.
         */

        System.out.println("\nTask 1");

        int newVariable = 10;
        double myDouble = newVariable;
        System.out.println(myDouble);
    }

    public static void task2(){
        /* Task 2. Явное преобразование double в int
            Напишите программу, которая:
            Объявляет переменную double с именем myDouble и присваивает ей значение 5.99.
            Преобразует myDouble в int с помощью явного преобразования и сохраняет результат в переменную int с именем myInt.
            Выводит значение myInt на экран.
         */

        System.out.println("\nTask 2");

        double myDouble = 5.99;
        int myInt = (int)myDouble;
        System.out.println("myInt = " + myInt);
    }

    public static void task3Optional(){
        /* Task 3 * (Опционально). Потеря данных при преобразовании
            Напишите программу, которая:
            Объявляет переменную long с именем bigNumber и присваивает ей значение 15000000000 (15 миллиардов).
            Преобразует bigNumber в int с помощью явного преобразования и сохраняет результат в переменную int с именем smallNumber.
            Выводит значение smallNumber на экран.
         */

        System.out.println("\ntask 3 Optional");

        long bigNumber = 15000000000L;
        int smallNumber = (int) bigNumber;
        System.out.println("smallNumber = " + smallNumber);

        // my
        System.out.println("Int max = " + Integer.MAX_VALUE);

    }

    public static void task4Optional(){
        /* Task 4 * (Опционально)
            Напишите программу на Java, которая преобразует ваше имя, записанное маленькими буквами, в верхний
            регистр. Для каждой буквы имени создайте отдельную переменную типа char, инициализированную
            соответствующей буквой в нижнем регистре. Затем преобразуйте каждую букву в верхний регистр,
            используя только арифметические операции (без использования библиотечных функций), и выведите результат.
         */

        System.out.println("\ntask 4 Optional");

        char ch1 = 't';
        char ch2 = 'e';
        char ch3 = 't';
        char ch4 = 'i';
        char ch5 = 'a';
        char ch6 = 'n';
        char ch7 = 'a';

        ch1 = (char) (ch1 - 32);
        ch2 = (char) (ch2 - 32);
        ch3 = (char) (ch3 - 32);
        ch4 = (char) (ch4 - 32);
        ch5 = (char) (ch5 - 32);
        ch6 = (char) (ch6 - 32);
        ch7 = (char) (ch7 - 32);

        System.out.print(ch1);
        System.out.print(ch2);
        System.out.print(ch3);
        System.out.print(ch4);
        System.out.print(ch5);
        System.out.print(ch6);
        System.out.print(ch7);

        // my
        /*
        public static void main(String[] args) {
            char[] myArray = {'t', 'e', 't', 'i', 'a', 'n', 'a'};
            char[] result = MyHW04Faster(myArray);
        }

        public static char[] MyHW04Faster(char[] myArray){
        char[] myNewArray = new char[myArray.length];
        for(int i = 0; i < myArray.length; i++){
            myArray[i] = (char) (myArray[i] - 32);
            System.out.print(myArray[i]);
            myNewArray[i] = myArray[i];
        }
        return myNewArray;
    }


         */

    }

}
