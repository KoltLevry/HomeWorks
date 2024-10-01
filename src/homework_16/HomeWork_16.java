package homework_16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class RubberArray<T> {
    private List<T> array;

    public RubberArray() {
        this.array = new ArrayList<>();
    }

    // Конструктор, принимающий в себя обычный массив
    public RubberArray(T[] initialArray) {
        this.array = new ArrayList<>(Arrays.asList(initialArray));
    }

    // Добавление элемента
    public void addElement(T element) {
        array.add(element);
    }

    // Вывести все значения в массиве в консоль
    public void printAllElements() {
        for (T element : array) {
            System.out.println(element);
        }
    }

    // Поиск элемента по значению
    public boolean containsElement(T element) {
        return array.contains(element);
    }

    // Возвращение значения по индексу
    public T getElement(int index) {
        if (index >= 0 && index < array.size()) {
            return array.get(index);
        } else {
            throw new IndexOutOfBoundsException("Индекс выходит за пределы массива");
        }
    }

    // Текущее количество элементов в массиве
    public int getSize() {
        return array.size();
    }

    // Удаление элемента по индексу
    public void removeElementByIndex(int index) {
        if (index >= 0 && index < array.size()) {
            array.remove(index);
        } else {
            throw new IndexOutOfBoundsException("Индекс выходит за пределы массива");
        }
    }

    // Добавление нескольких элементов
    @SafeVarargs
    public final void addElements(T... elements) {
        array.addAll(Arrays.asList(elements));
    }

    // Удаление элемента по значению
    public boolean removeElementByValue(T element) {
        return array.remove(element);
    }

    public static void main(String[] args) {
        // Приклад використання RubberArray
        RubberArray<String> rubberArray = new RubberArray<>(new String[]{"A", "B", "C", "D"});

        rubberArray.addElement("E");
        rubberArray.printAllElements();

        System.out.println("Содержит 'B': " + rubberArray.containsElement("B"));
        System.out.println("Элементов по индексу 3: " + rubberArray.getElement(2));
        System.out.println("Количество элементов: " + rubberArray.getSize());

        System.out.println("\n===\n");
        rubberArray.removeElementByIndex(1);
        rubberArray.printAllElements();

        System.out.println("\n===\n");
        rubberArray.addElements("F", "G", "J");
        rubberArray.printAllElements();

        System.out.println("\n===\n");
        rubberArray.removeElementByValue("F");
        rubberArray.printAllElements();
    }
}