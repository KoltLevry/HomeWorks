package homework_18;

/*  Класс "Калькулятор"
        Создайте класс Calculator, который будет предоставлять базовые арифметические операции: сложение, вычитание, умножение и деление
        Класс должен содержать:
        Статические методы для каждой математической операции, принимающие два аргумента и возвращающие результат операции.
*/

public class Calculator {

    public static double addNumbers(double a, double b){
         return a+b;
    }

    public static double multiplyNumbers(double a, double b){
         return a*b;
    }

    public static double subtractNumbers(double a, double b){
         return a-b;
    }

    public static double divideNumbers(double a, double b){
         return a/b;
    }
}

// class Main {
//    public static void main(String[] args) {
//        Calculator calculator = new Calculator();
//
//        System.out.println(Calculator.divideNumbers(6,3));
//        System.out.println(Calculator.subtractNumbers(16,3));
//        System.out.println(Calculator.addNumbers(6,3));
//        System.out.println(Calculator.multiplyNumbers(6,3));
//        System.out.println(Calculator.divideNumbers(6,2));
//    }
//}