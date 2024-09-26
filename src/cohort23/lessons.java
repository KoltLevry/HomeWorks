package cohort23;

import java.util.Scanner;

public class lessons {

    public static void main(String[] args){
        lesson_01_08();
    }

    public static void lesson_01_05(){
        // Задача 1. Даны два целые числа a и b. Написать логическое выражение, возвращающее true если они равны

        Scanner scanner = new Scanner(System.in);

        System.out.print("Write a number a = ");
        int a = scanner.nextInt();

        System.out.print("Write a number b = ");
        int b = scanner.nextInt();

        System.out.println("The result of comparing --> ");

        if(a == b){
            System.out.println("a = b");
        }
        else if(a > b){
            System.out.println("a > b");
        }
        else{
            System.out.println("a < b");
        }
    }

    public static void lesson_02_05(){
        boolean Petya = true; // he's sad or glad
        boolean Vasya = false; // he's not glad

        if ((!Petya && !Vasya) || (Petya && Vasya)){
            System.out.println("Boom -_- ");
        }
        else{
            System.out.println("It's all right!");
        }

    }

    public static void lesson_01_06(){
        /*
        Написать программу, которая принимает с клавиатуры имя, фамилию и возраст и выводит в консоль эту информацию в следующем виде:
        First name: John
        Last name: Smith
        Age: 25
         */

        Scanner scanner = new Scanner(System.in);

        System.out.print("Write your first name: ");
        String firstName = scanner.next();
        System.out.print("Write your last name: ");
        String lastName = scanner.next();
        System.out.print("Write your age: ");
        String age = scanner.next();

        System.out.println("\nFirst name: " + firstName);
        System.out.println("Last name: " + lastName);
        System.out.println("Age: " + age);




    }

    public static void lesson_01_07(){
        /*
        Написать программу, выводящую на экран ASCII значение символа (например если символ Z то должно быть напечатано 90)
         */
        char character = 'Z';
        System.out.println("ASCII " + character + " = " + (int)character);
    }

    public static void lesson_01_08(){

    }
}
