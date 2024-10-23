package homework_28;

import java.util.*;

class RectangleTest {
    private double length;
    private double width;

    public RectangleTest(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        RectangleTest rectangle = (RectangleTest) obj;
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

    public static void removeDuplicates(List<RectangleTest> rectangles, RectangleTest rectangleToRemove) {
//        Iterator<RectangleTest> iterator = rectangles.iterator();
//        while (iterator.hasNext()) {
//            RectangleTest current = iterator.next();
//            if (current.equals(rectangleToRemove)) {
//                iterator.remove();
//            }
//        }

        rectangles.removeIf(rectangle -> rectangle.equals(rectangleToRemove));
    }

}

class displayInfoRemoveRect{
    public static void main(String[] args) {
        List<RectangleTest> rectangles = new ArrayList<>();
        rectangles.add(new RectangleTest(5.0, 3.0));
        rectangles.add(new RectangleTest(4.0, 2.0));
        rectangles.add(new RectangleTest(5.0, 3.0)); // Дубликат
        rectangles.add(new RectangleTest(6.0, 4.0));
        rectangles.add(new RectangleTest(5.0, 3.0)); // Дубликат

        System.out.println("Список до удаления дубликатов:");
        for (RectangleTest rectangle : rectangles) {
            System.out.println(rectangle);
        }

        RectangleTest rectangleToRemove = new RectangleTest(5.0, 3.0);
        RectangleTest.removeDuplicates(rectangles, rectangleToRemove);

        System.out.println("\nСписок после удаления дубликатов:");
        for (RectangleTest rectangle : rectangles) {
            System.out.println(rectangle);
        }
    }
}

