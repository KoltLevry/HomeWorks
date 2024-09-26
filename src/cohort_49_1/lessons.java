package cohort_49_1;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.atomic.LongAccumulator;

public class lessons {

    public static void lesson_01_03(){

        System.out.println("\n 1-3 tasks --> ");

        System.out.println("Max byte: " + Byte.MAX_VALUE);
        System.out.println("Max short: " + Short.MAX_VALUE);
        System.out.println("Max int: " + Integer.MAX_VALUE);
        String maxValueLength = Long.toString(Long.MAX_VALUE);
        int maxValueLengthToInt = maxValueLength.length();
        System.out.println("Max long: " + Long.MAX_VALUE + " Character length = " + maxValueLengthToInt);
        System.out.println("Max float: " + Float.MAX_VALUE);
        System.out.println("Max double: " + Double.MAX_VALUE);
        System.out.println("Max char: " + (int)Character.MAX_VALUE);
        System.out.println("Max boolean: " + Boolean.TRUE);

        System.out.println("\n 4,5 tasks --> ");

        String octalNumber = "456";

        int decimalNumber = Integer.parseInt(octalNumber);
        System.out.println("Десяткове число: "+ decimalNumber);

        String binaryNumber = Integer.toBinaryString(decimalNumber);
        System.out.println("Двійкове число: " + binaryNumber);

        String hexNumber = Integer.toHexString(decimalNumber).toUpperCase();
        System.out.println("Шістнадцяткове число: " + hexNumber);
    }

    /* TODO write Clas lesson 01_04 */

    public static void lesson_01_04(){

    }

//    Class Calculator{
//
//    }

    public static boolean lesson_01_05(){ // => public static boolean canWalk()
        /*
        Задача: можно ли идти гулять?
        в методе main задать логическую переменную isWeekend (сегодня выходной?)
        задать логическую переменную isRain (идёт дождь?) поместить в эти переменные какие-либо значения
        написать метод public static boolean canWalk(), который в качестве входящих параметров принимает обе этих переменных
        метод должен возвращать true, если можно гулять (то есть если выходной и нет дождя), в противном случае - false
        в методе main вызвать этот метод и вывести его результат на консоль
         */

        LocalDate today = LocalDate.now();

        // boolean isWeekend = today.getDayOfWeek() == DayOfWeek.SATURDAY || today.getDayOfWeek() == DayOfWeek.SUNDAY;
        // System.out.println("Сьогодні вихідний? " + isWeekend);

        boolean isWeekend = true;
        boolean isRain = true;

//        if(!isWeekend && isRain){
//            return false;
//        }
//        else{
//            return true;
//        }

        return !(isWeekend && !isRain);
    }

    public static String lesson_02_05(int firstSide, int secondSide, int thirdSide) { // => public static String getTriangleType()
        /*  System.out.println(lesson_02_05(4,3,5));
        Задача: какой треугольник?
        в методе main задать три целочисленные переменные - длины сторон треугольника
        написать метод public static String getTriangleType(), который в качестве входящих параметров принимает три длины сторон треугольника
        задача метода - в зависимости от длин сторон вернуть тип треугольника - "равносторонний", "равнобедренный" или "разносторонний"
        вызвать этот метод в методе main и вывести результат его работы в консоль
         */
        if (firstSide == secondSide && firstSide == thirdSide) {
            return "равносторонний";
        }
        if (firstSide == secondSide || firstSide == thirdSide || secondSide == thirdSide) {
            return "равнобедренный";
        }
        return "разносторонний";
    }

    public static void lesson_02_06(){
        /*
        Есть улица, на которой расположены 5 домов. Задайте переменную, содержащую номер дома.
        В зависимости от номера дома в консоль должна выводиться фраза - "Письмо доставлено в
        первый дом", "Письмо доставлено во второй дом" и т.д.
        Если номер дома указан неправильно, должна выводиться фраза "Письмо не доставлено".
        В каждом доме живёт одна семья, кроме четвёртого дома, в котором живёт две семьи -
        Ивановы и Петровы.
        Задайте вторую переменную, содержащую адресата. Если адресат - "Иванов", фраза должна
        быть "Письмо доставлено в четвёртый дом семье Ивановых". Аналогично для семьи Петровых.
        Если адресат указан неверно, при помощи тернарного оператора выведите в консоль фразу
        "Строка адресата содержит чётное/нечётное количество символов".
         */
        int a = 5;
        while(a > 0){
            System.out.println("\u001B[93m" + "\n\nYou have " + "\u001B[0m" + "\u001B[31m" + a + "\u001B[0m" +
                    "\u001B[93m" + " attempts to send a letter -->" + "\u001B[0m");
            a--;
            Scanner scanner = new Scanner(System.in);
            System.out.print("\nВведите номер дома для отправки письма (1-5): ");
            int houseNumer = scanner.nextInt();

            int house1 = 1;
            int house2 = 2;
            int house3 = 3;
            int house4 = 4;
            int house5 = 5;

            if (houseNumer == house1){
                System.out.println("Письмо доставлено в " + houseNumer + " дом");
            }
            else if (houseNumer == house2){
                System.out.println("Письмо доставлено в " + houseNumer + " дом");
            }
            else if (houseNumer == house3){
                System.out.println("Письмо доставлено в " + houseNumer + " дом");
            }
            else if (houseNumer == house4){
                System.out.print("Укажите получателя: ");
                String recipient = scanner.next();
                if (recipient.equals("Ивановы")){
                    System.out.println("Письмо доставлено в " + houseNumer + " дом семье Ивановых");
                }
                else if (recipient.equals("Петровы")) {
                    System.out.println("Письмо доставлено в " + houseNumer + " дом семье Петровых");
                }
                else{
                    System.out.println("\u001B[31m" + "Письмо не доставлено, получатель домa #" + houseNumer + " указан неправильно" + "\u001B[0m"); // Зміна кольору тексту
                }
            }
            else if (houseNumer == house5){
                System.out.println("Письмо доставлено в " + houseNumer + " дом");
            }
            else{
                //System.out.println("Письмо не доставлено, номер дома указан неправильно ");
                System.out.println("\u001B[31m" + "Письмо не доставлено, номер дома #" + houseNumer + " указан неправильно (1-5)" + "\u001B[0m"); // Зміна кольору тексту
            }
        }


    }

    public static void lesson_01_07(){
        /*  Есть задача: вывести в консоль в обратном порядке чётные числа от 30 до 0.
            Решить данную задачу первым способом - используя проверку на чётность внутри цикла.
            Решить эту же задачу вторым способом - при помощи уменьшения индекса цикла на 2.
         */

        System.out.println("\u001B[93m" + "\nTask 1. Lesson 7" + "\u001B[0m");

        System.out.println("\nFirst method");

        for (int i = 30; i > 0; i--){
            if (i % 2 == 0) {
                System.out.println("Чётное число: " + i);
            }
        }

        System.out.println("\nSecond method");
        for (int i = 30; i > 0; i = i - 2){
            System.out.println("Чётное число: " + i);
        }
    }

    public static void lesson_02_07(){
        /* Игра в кости. Есть две обычные игральные кости - с числами от 1 до 6 на гранях. Программа должна делать следующее:
           Производится бросок костей, то есть вычисляется случайным образом, какое число выпало на каждой кости.
           Выводится в консоль, какие значения выпали на костях.
           При этом если выпал дубль, дополнительно выводится в консоль фраза "Дубль!".
           Если на костях выпало 3 и 5, игра прекращается и выводится фраза "Конец игры".
         */
        System.out.println("\u001B[93m" + "\nTask 2. Lesson 7" + "\u001B[0m");

        Random random = new Random();

        while (true) {
            int firstDice = random.nextInt(6) + 1;
            int secondDice = random.nextInt(6) + 1;

            System.out.println("1 игральная кость = " + firstDice);
            System.out.println("2 игральная кость = " + secondDice);

            if (firstDice == secondDice) {
                System.out.println("Дубль!");
                break;
            } else if ((firstDice == 3 || firstDice == 5) && (secondDice == 3 || secondDice == 5)) {
                System.out.println("Конец игры");
                break;
            } else {
                System.out.println(" ");
            }
        }
    }

    public static void lesson_01_08(){
        /*

         */
    }

    public static void lesson_02_08(){
        /*

         */
    }

    public static void lesson_03_08(){
        /*

         */
    }


    public static void main(String[] args) {
//        lesson_01_03();

//        boolean result = lesson_01_05();
//        System.out.println("Сегодня можно гулять? " + result);

//        System.out.println(lesson_02_05(4,3,5));

//        lesson_02_06();

//        lesson_01_07();
//        lesson_02_07();

//        lesson_01_08();
//        lesson_02_08();
//        lesson_03_08();

//        lesson_01_09();
    }

}
