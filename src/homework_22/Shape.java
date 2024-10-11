package homework_22;

abstract class Shape {
    protected double side;

    public Shape(double side) { this.side = side; }

    abstract void calculateArea();
}

class Circle extends Shape{
    public Circle(int side) {
        super(side);
    }
    @Override
    public void calculateArea(){
        double circleArea = side * side * Math.PI;
        System.out.printf("Площа кола: %.0f (cм)^2\n", circleArea);
    }
}

class Square extends Shape{
    public Square(int side) {
        super(side);
    }
    @Override
    public void calculateArea(){
        double squareArea = side * side;
        System.out.printf("Площа квадрату: %.0f (cм)^2\n", squareArea);
    }
}

class Triangle extends Shape{
    private double height;
    public Triangle(double side, double height) {
        super(side);
        this.height = height;
    }

    @Override
    public void calculateArea(){
        double triangleArea = 0.5 * side * height;
        System.out.printf("Площа трикутника: %.0f (cм)^2\n", triangleArea);
    }
}

// 3
class Main{
    public static void main(String[] args) {
        Shape[] shapes = {
          new Circle(10),
          new Square(4),
          new Triangle(5,4),
        };
        for (Shape shape : shapes) {
            shape.calculateArea();
        }
    }
}