package homework_19;

public class Task_1_Calculator {
    private static final double PI = 3.14;
    public static double addNumbers(double a, double b){
        return a + b;
    }
    public static double subtractionNumbers(double a, double b){
        return a - b;
    }
    public static double multiplyNumbers(double a, double b){
        return a * b;
    }
    public static double divideNumbers(double a, double b){
        return a / b;
    }
    public static double circleArea(double radius){
        return PI * radius * radius;
    }
    public static double circleCircumference(double radius){
        return PI * 2 * radius;
    }

    public static void main(String[] args) {
        System.out.println("a + b = " + Task_1_Calculator.addNumbers(3,4));
        System.out.println("a + b = " + Task_1_Calculator.subtractionNumbers(3,4));
        System.out.println("a * b = " + Task_1_Calculator.multiplyNumbers(3,4));
        System.out.println("a / b = " + Task_1_Calculator.divideNumbers(3,4));
        System.out.println("pi * r^2 = " + Task_1_Calculator.circleArea(10));
        System.out.println("pi * r * 2 = " + Task_1_Calculator.circleCircumference(10) );
    }
}

