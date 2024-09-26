package Lesson_01;

import java.io.Console;
import java.util.Random;
import java.util.Scanner;

public class Hello {

    public static void HelloClaSss() {
        /* Написать класс Калькулятор. Объект класса Калькулятор должен внутри себя содержать два целых числа.
            Объект Калькулятора должен уметь возвращать (каждая операция должна быть в виде отдельного метода):
            сумму двух чисел
            разность двух чисел
            произведение двух чисел
            частное двух чисел
            Написать класс Main, в методе main создать объект Калькулятора, передав ему через конструктор два числа.
            Получить в методе main результаты всех четырёх операций и вывести их в консоль.
         */
    }

    public static void MyPerson(){
        Person person1 = new Person();
        person1.name = "Alica";
        person1.age = 25;

        System.out.println("Name: " + person1.name + ". Age = " + person1.age);
    }


    public static void main(String[] args) {
        MyPerson();
    }
}

class Calculator {
    int firstValue;
    int secondValue;
}

class Person{
    String name;
    int age;
}


