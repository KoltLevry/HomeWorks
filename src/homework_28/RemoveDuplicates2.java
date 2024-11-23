package homework_28;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

class RectangleTest2 {
    private double length;
    private double width;

    public RectangleTest2(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        RectangleTest2 rectangle = (RectangleTest2) obj;
        return rectangle.length == length && rectangle.width == width;
    }

    @Override
    public int hashCode() {
        return Objects.hash(length, width);
    }

    @Override
    public String toString(){
        return String.format("Прямоугольник [длина = %.2f, ширина = %.2f]", length, width);
    }

    public static void removeDuplicates(List<RectangleTest2> rectangles, RectangleTest2 rectangleToRemove) {
        rectangles.removeIf(rectangle -> rectangle.equals(rectangleToRemove));
    }

}

class displayInfoRemoveRect2{
    public static void main(String[] args) {
        List<RectangleTest2> rectangles = new ArrayList<>();
        rectangles.add(new RectangleTest2(5.0, 3.0));
        rectangles.add(new RectangleTest2(4.0, 2.0));
        rectangles.add(new RectangleTest2(5.0, 3.0)); // Дубликат
        rectangles.add(new RectangleTest2(5.0, 3.0)); // Дубликат
        rectangles.add(new RectangleTest2(6.0, 4.0));
        rectangles.add(new RectangleTest2(5.0, 3.0)); // Дубликат

        System.out.println("Список 2 до удаления дубликатов:");
        rectangles.forEach(System.out::println);

        RectangleTest2 rectangleToRemove = new RectangleTest2(5.0, 3.0);
        RectangleTest2.removeDuplicates(rectangles, rectangleToRemove);

        System.out.println("\nСписок 2 после удаления дубликатов:");
        rectangles.forEach(System.out::println);
    }
}

