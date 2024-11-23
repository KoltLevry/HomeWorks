package homework_28;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

class RectangleTest1 {
    private double length;
    private double width;

    public RectangleTest1(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        RectangleTest1 rectangle = (RectangleTest1) obj;
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

}

class displayInfoRemoveRect1{
    public static void main(String[] args) {
        List<RectangleTest1> rectangles = new ArrayList<>();
        rectangles.add(new RectangleTest1(5.0, 3.0));
        rectangles.add(new RectangleTest1(4.0, 2.0));
        rectangles.add(new RectangleTest1(5.0, 3.0)); // Дубликат
        rectangles.add(new RectangleTest1(6.0, 4.0));
        rectangles.add(new RectangleTest1(5.0, 3.0)); // Дубликат

        System.out.println("Список 1 до удаления дубликатов:");
        rectangles.forEach(System.out::println);

        List<RectangleTest1> uniqueRectangles = rectangles.stream()
                        .distinct()
                                .toList();

        System.out.println("\nСписок 1 после удаления дубликатов:");
        uniqueRectangles.forEach(System.out::println);
    }
}

