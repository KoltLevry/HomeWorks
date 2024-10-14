package homework_23;

abstract class Shape {
    abstract double calculateArea();
    abstract double calculatePerimeter();
}

class Circle extends Shape {
    private final int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}

class Rectangle extends Shape {
    private final int sideA;
    private final int sideB;

    public Rectangle(int sideA, int sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public double calculateArea() {
        return sideA * sideB;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (sideA + sideB);
    }
}

class Triangle extends Shape {
    private final int side1;
    private final int side2;
    private final int side3;

    public Triangle(int side1, int side2, int side3) {
        // Додана перевірка, чи є трикутник дійсним
        if (side1 + side2 > side3 && side2 + side3 > side1 && side1 + side3 > side2) {
            this.side1 = side1;
            this.side2 = side2;
            this.side3 = side3;
        } else {
            throw new IllegalArgumentException("Трикутник з такими сторонами не може існувати.");
        }
    }

    @Override
    public double calculateArea() {
        double s = calculatePerimeter() / 2; // Напівпериметр
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3)); // Формула Герона
    }

    @Override
    public double calculatePerimeter() {
        return side1 + side2 + side3;
    }
}

//class Main {
//    public static void main(String[] args) {
//        Shape[] shapes = {
//                new Circle(10),
//                new Circle(5),
//                new Circle(1),
//                new Rectangle(4, 2),
//                new Rectangle(5, 3),
//                new Triangle(3, 4, 5),
//                new Triangle(5, 6, 5),
//                new Triangle(4, 2, 5)
//        };
//
//        double totalArea = 0;
//        double totalPerimeter = 0;
//
//        for (Shape shape : shapes) {
//            totalArea += shape.calculateArea();
//            totalPerimeter += shape.calculatePerimeter();
//        }
//
//        System.out.println("Общая площадь всех фигур в массиве: " + totalArea);
//        System.out.println("Общий периметр всех фигур в массиве: " + totalPerimeter);
//    }
//}
