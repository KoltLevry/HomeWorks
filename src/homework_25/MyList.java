package homework_25;

import java.util.Arrays;

public interface MyList<T> {
    void add(T value);
    void addAll(T... values);
    int size();
    int indexOf(T value);
    int lastIndexOf(T value);
    boolean contains(T value);
    Object[] toArray();
    boolean remove(T value);
    T remove(int index);
    boolean isEmpty();
    T get(int index);
    void set(int index, T value);
}

class MyArrayList<T> implements MyList<T> {
    private T[] array;  // Заміна Object[] на T[]
    private int size;

    @SuppressWarnings("unchecked") // Додавання анотації для ігнорування попереджень про приведення типу
    public MyArrayList() {
        array = (T[]) new Object[10];  // Ініціалізація масиву типу T
        size = 0;
    }

    @Override
    public void add(T value) {
        ensureCapacity();
        array[size++] = value;  // Додавання елемента
    }

    @Override
    public void addAll(T... values) {
        for (T value : values) {
            add(value);
        }
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public int indexOf(T value) {
        for (int i = 0; i < size; i++) {
            if (array[i].equals(value)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public int lastIndexOf(T value) {
        for (int i = size - 1; i >= 0; i--) {
            if (array[i].equals(value)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public boolean contains(T value) {
        return indexOf(value) != -1;
    }

    @Override
    public Object[] toArray() {
        return Arrays.copyOf(array, size);   // Повернення масиву типу T
    }

    @Override
    public boolean remove(T value) {
        int index = indexOf(value);
        if (index != -1) {
            remove(index);
            return true;
        }
        return false;
    }

    @Override
    public T remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of bounds: " + index);
        }
        T oldValue = array[index];
        for (int i = index; i < size - 1; i++) {
            array[i] = array[i + 1];  // Зсув елементів вліво
        }
        size--;
        return oldValue;  // Повернення видаленого значення
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of bounds: " + index);
        }
        return array[index];
    }

    @Override
    public void set(int index, T value) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of bounds: " + index);
        }
        array[index] = value;  // Заміна значення
    }

    private void ensureCapacity() {
        if (size == array.length) {
            array = Arrays.copyOf(array, array.length * 2);  // Подвоєння розміру масиву
        }
    }
}

class Main {
    public static void main(String[] args) {
        MyList<Integer> list = new MyArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.addAll(40, 50, 60);

        System.out.println("List size: " + list.size());  // Виведе: 6
        System.out.println("Index of 30: " + list.indexOf(30));  // Виведе: 2

        list.remove(1);  // Видалити елемент за індексом 1 (20)
        System.out.println("New size after removing: " + list.size());  // Виведе: 5

        System.out.println("Contains 50: " + list.contains(50));  // Виведе: true

        for (Object num : list.toArray()) {
            System.out.println(num);  // Виведе всі елементи списку
        }
    }
}
