package homework_28;

import java.util.Objects;

public class RectangleEquals {
    private double length;
    private double width;

    public RectangleEquals(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        RectangleEquals rectangle = (RectangleEquals) obj;
        return Double.compare(rectangle.length, length) == 0 &&
                Double.compare(rectangle.width, width) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(length, width);
    }

    @Override
    public String toString() {
        return String.format("Rectangle [length=%.2f, width=%.2f]", length, width);
    }
}

class RectangleTestEquals {
    public static void main(String[] args) {
        RectangleEquals rect1 = new RectangleEquals(5.0, 3.0);
        RectangleEquals rect2 = new RectangleEquals(5.0, 3.0);
        RectangleEquals rect3 = new RectangleEquals(4.0, 2.0);

        // Сравнение объектов
        System.out.println(rect1.equals(rect2)); // Должно быть true, так как размеры совпадают
        System.out.println(rect1.equals(rect3)); // Должно быть false, так как размеры разные
    }
}
