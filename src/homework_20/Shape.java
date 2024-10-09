package homework_20;

public abstract class Shape {
    public final String name;
    public String color;

    public Shape(String name) {
        this.name = name;
    }

    public void displayInfo(){
        System.out.println("Name: " + name + " | Color: " + color);
    }

    public void setColor(String color){
        this.color = color;
        displayInfo();
    }
}

class Rectangle extends Shape{
    private double width;
    private double height;

    public Rectangle(String name) {
        super(name);
    }

    public void setDimensions(double width, double height){
        this.width = width;
        this.height = height;
    }

    public void calculateArea(){
        System.out.println("Area: " + (width * height));
    }
}

class Circle extends Shape{
    private double radius;

    public Circle(String name) {
        super(name);
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    public void calculateArea(){
        System.out.println("Area: " + Math.PI * radius * radius);
    }
}

//class Main{
//    public static void main(String[] args) {
//        Rectangle rectangle = new Rectangle("First rectangle");
//        rectangle.setDimensions(4,5);
//        rectangle.calculateArea();
//        rectangle.setColor("red");
//
//        System.out.println();
//
//        Circle circle = new Circle("First circle");
//        circle.setRadius(10);
//        circle.calculateArea();
//        circle.setColor("blue");
//    }
//}