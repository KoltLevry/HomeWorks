package homework_28;

public class Rectangle {
    private double length;
    private double width;

    public Rectangle() {
        this.length = 1.0;
        this.width = 1.0;
    }

    public Rectangle(double length, double width) {
        this.length = validDimension(length, "Довжина повинна бути більше 0");
        this.width = validDimension(width,"Ширина повинна бути більше 0");
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = validDimension(length, "Довжина повинна бути більше 0");
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = validDimension(width,"Ширина повинна бути більше 0");
    }

    public double validDimension(double value, String errorMassage) {
        if (value <= 0){
            throw new IllegalArgumentException(errorMassage);
        }
        return value;
    }

    @Override
    public String toString(){
        return String.format("Прямоугольник [длина = %.2f, ширина = %.2f]", length, width);
    }
}

class createRectangle {
    public static void main(String[] args) {
        try {
            Rectangle rectangle1 = new Rectangle(5,4);
            System.out.println("#1: " + rectangle1);

            Rectangle rectangle2 = new Rectangle(5,4);
            rectangle2.setLength(3);
            rectangle2.setWidth(3);
            System.out.println("#2: " + rectangle2);

            Rectangle rectangle3 = new Rectangle();
            System.out.println("#3: " + rectangle3);

            Rectangle rectangle4 = new Rectangle(2, -4);
            System.out.println("#4: " + rectangle4);

        } catch (IllegalArgumentException e) {
            System.out.println("Помилка: " + e.getMessage());
        }

        try {
            Rectangle rectangle5 = new Rectangle(3, 4);
            rectangle5.setLength(0);
            rectangle5.setWidth(2);
            System.out.println("#5: " + rectangle5);
        } catch (IllegalArgumentException e) {
            System.out.println("Помилка: " + e.getMessage());
        }
    }

}