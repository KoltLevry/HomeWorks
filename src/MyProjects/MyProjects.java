package MyProjects;

import java.text.DateFormat;
import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class MyProjects {

    public static void PlayWithNumbers(){

        String octalNumber = "456";

        int decimalNumber = Integer.parseInt(octalNumber);
        System.out.println("Десяткове число: "+ decimalNumber);

        String binaryNumber = Integer.toBinaryString(decimalNumber);
        System.out.println("Двійкове число: " + binaryNumber);

        String hexNumber = Integer.toHexString(decimalNumber).toUpperCase();
        System.out.println("Шістнадцяткове число: " + hexNumber);
    }

    public static void SquareArea() {

        // A method for calculating the area of a square based on its side

        Scanner scanner = new Scanner(System.in);

        System.out.print("\nWrite a size of square's side: ");
        int sideOfSquare = scanner.nextInt();

        int squareArea = sideOfSquare * sideOfSquare;

        System.out.println("Your square area = " + squareArea);
    }

    public static void CircleArea() {
        // A method for calculating the area of a circle based on its radius;

        Scanner scanner = new Scanner(System.in);

        System.out.println("\nCircle area = pi * r^2");

        System.out.print("Write your circle's radius: ");
        int radiusCircle = scanner.nextInt();

        double circleAreaResult = Math.PI * radiusCircle * radiusCircle;

        DecimalFormat df = new DecimalFormat("#.##");

        System.out.println("\nThe circle area = " + df.format(circleAreaResult));
    }

    public static void RectanglePerimeter(){
        // A method for calculating the perimeter of a rectangle based on two sides;

        Scanner scanner = new Scanner(System.in);

        System.out.println("\nWrite a size of a first side: ");
        int firstSideSize = scanner.nextInt();
        System.out.println("Write a size of a second side: ");
        int secondSideSize = scanner.nextInt();

        int rectanglePerimeter = (firstSideSize + secondSideSize) * 2;

        System.out.println("The rectangle perimeter = " + rectanglePerimeter);
    }

    public static void TriangleAngle(){
        // The value of the 3rd angle of a triangle based on the first two.

        Scanner scanner = new Scanner(System.in);

        System.out.print("Write first angle of a triangle: ");
        double firstAngle = scanner.nextDouble();

        System.out.print("Write second angle of a triangle: ");
        double secondAngle = scanner.nextDouble();

        double thirdAngle = 180 - firstAngle - secondAngle;

        System.out.print("Result of the third angle of a triangle = " + thirdAngle);

    }

    public static void TriangleArea(){
    // The area of a triangle based on the side and height of the triangle. (1/2 * h * c)

        Scanner scanner = new Scanner(System.in);

        System.out.println("Write the length of the side of the triangle: ");
        double triangleSide = scanner.nextDouble();

        System.out.println("Write the height of the triangle: ");
        double triangleHeight = scanner.nextDouble();

        double triangleArea = 0.5 * triangleHeight * triangleSide;
        System.out.println("Area of the triangle = " + triangleArea);

    }

    public static void HypotenuseBasedOnPythagorasTheorem(){
    // The hypotenuse based on two legs (Pythagoras' theorem).

    Scanner scanner = new Scanner(System.in);

        System.out.println("Write the length of side a: ");
        int aSide = scanner.nextInt();

        System.out.println("Write the length of side b: ");
        int bSide = scanner.nextInt();

        double hypotenuse = Math.sqrt(Math.pow(aSide,2) + Math.pow(bSide,2) );
        System.out.println("The hypotenuse based on two legs: " + hypotenuse);
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

    public static void DecimalNumberFormat(){
        DecimalFormat df = new DecimalFormat("#.#");
        double a = 20f / 7f;

        System.out.println(df.format(a));
    }

    public static void AIwhileTry1(){
        /* Завдання 1: Введення позитивного числа
        Напишіть програму, яка запитує у користувача введення позитивного числа.
        Якщо користувач вводить від’ємне число або нечислове значення, програма повинна продовжувати
        запитувати введення, поки не буде введено дійсне позитивне число.
         */
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введення позитивного числа: ");

        int userInputNumber = -1;
        boolean isValid = false;


        while (!isValid){
            System.out.println("Введення позитивного числа: ");
            try{
                userInputNumber = scanner.nextInt();
                if (userInputNumber > 0){
                    System.out.println("Ви ввели позитивне число. Вітаю!");
                    isValid = true;
                } else{
                    System.out.println("Error! Число должно быть позитивным! Try again.");
                }
            } catch (InputMismatchException e){
                System.out.println("Користувач вводить від’ємне число або нечислове значення! ");
                scanner.next();
            }
        }
    }

    public static void isPrime(){
        int[] myArray = new int[5];

        for (int i = 0; i < myArray.length; i++){
            myArray[i] = ThreadLocalRandom.current().nextInt(1,101);
        }
        for (int n = 0; n < myArray.length; n++){
            boolean isPrime = true;
            double valueSqrt = Math.sqrt(myArray[n]);
            int r = 2;
            while (r <= valueSqrt && isPrime){
                if (myArray[n] % r == 0){
                    isPrime = false;
                }
                r++;
            }
            System.out.print(isPrime ? myArray[n] + " " : "");
        }
    }

    public static void main(String[] args) {

    }







}