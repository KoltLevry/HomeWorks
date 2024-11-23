package homework_28;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

class RectangleTest3 {
    private double length;
    private double width;

    public RectangleTest3(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        RectangleTest3 rectangle = (RectangleTest3) obj;
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

    public static void removeDuplicates(List<RectangleTest3> rectangles, RectangleTest3 rectangleToRemove) {
        Iterator<RectangleTest3> iterator = rectangles.iterator();
        while(iterator.hasNext()) {{
        RectangleTest3 current = iterator.next();
        if(current.equals(rectangleToRemove)){
            iterator.remove();
        }}
        }
    }

}

class displayInfoRemoveRect3{
    public static void main(String[] args) {
        List<RectangleTest3> rectangles = new ArrayList<>();
        rectangles.add(new RectangleTest3(5.0, 3.0));
        rectangles.add(new RectangleTest3(4.0, 2.0));
        rectangles.add(new RectangleTest3(5.0, 3.0)); // Дубликат
        rectangles.add(new RectangleTest3(5.0, 3.0)); // Дубликат
        rectangles.add(new RectangleTest3(6.0, 4.0));
        rectangles.add(new RectangleTest3(5.0, 3.0)); // Дубликат
        rectangles.add(new RectangleTest3(8.0, 9.0));

        System.out.println("Список 3 до удаления дубликатов:");
        rectangles.forEach(System.out::println);

        RectangleTest3 rectangleToRemove = new RectangleTest3(5.0, 3.0);
        RectangleTest3.removeDuplicates(rectangles, rectangleToRemove);

        System.out.println("\nСписок 3 после удаления дубликатов:");
        rectangles.forEach(System.out::println);
    }
}

