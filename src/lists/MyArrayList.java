package lists;

import java.lang.reflect.Array;
import java.util.Iterator;

/*
Iterable - означает, что все объекты этого класса можно перебирать (итерировать). Содержит всего один метод,
который возвращает итератор (тот самый объект-закладку, который позволяет перебирать коллекцию)

Iterator<T> iterator() - возвращает итератор для коллекции

// Iterator - собственно итератор, который позволяет обходить коллекцию.
boolean hasNext() - есть ли следующий элемент
T next() -> возвращает следующий элемент
void remove() - не обязательный. Удаляет последний возвращенный элемент.

 */

public class MyArrayList<T> implements MyList<T>, Iterable<T> {
    private T[] array;
    private int cursor; // присвоено значение по умолчанию = 0;

    @SuppressWarnings("unchecked") // Подавляю предупреждение компилятора о непроверяемом приведении типа
    public MyArrayList() {
        array = (T[]) new Object[10];
    }

    @SuppressWarnings("unchecked")
    public MyArrayList(T[] array) {
        if (array == null || array.length == 0) {
            this.array = (T[]) new Object[10];
        } else {
            this.array = (T[]) new Object[array.length * 2];
            addAll(array);
        }
    }

    // Добавление в массив одного элемента
    public void add(T value) {
        // Проверка. Есть ли вообще свободное место во внутреннем массиве
        // Если места нет - нужно добавить место
        if (cursor == array.length - 1) {
            // Расширить массив перед добавлением нового элемента
            expandArray();
        }

        array[cursor] = value;
        cursor++;
    }

    @Override
    public void addAll(T... numbers) {
        // с numbers я могу обращаться точно также, как со ссылкой на массив int
        // System.out.println("Приняли несколько интов. А именно: " + numbers.length);
        // System.out.println("Есть индекс у каждого инта, как в массиве. По индексом 0: " + numbers[0]);
        for (int i = 0; i < numbers.length; i++) {
            add(numbers[i]);
        }
    }


    // Динамическое расширение массива
    private void expandArray() {
        System.out.println("Расширяем массив! Курсор = " + cursor);
        /*
        1. создать новый массив бОльшего размера (в 2 раза больше)
        2. Переписать в новый массив все значения из старого (до курсора)
        3. Перебросить ссылку
         */

        // 1
        T[] newArray = (T[]) new Object[array.length * 2];

        // 2
        for (int i = 0; i < cursor; i++) {
            newArray[i] = array[i]; // Переписываю все значения из старого массива в новый
        }

        // Перебрасываем ссылку. Переменная array хранит ссылку на "новый" массив
        array = newArray;
        System.out.println("Расширение массива завершено");
    }

    // Возвращает строковое представление массива
    // [1, 14, 16]
    public String toString() {

        if (cursor == 0) return "[]";

        String result = "[";
        for (int i = 0; i < cursor; i++) {
            result = result + array[i] + (i < cursor - 1 ? ", " : "]"); //", " / "]"
        }

        return result;
    }


    // Текущее количество элементов в массиве
    public int size() {
        return cursor;
    }

    // Возвращает значение по индексу
    @Override
    public T get(int index) {
        if (index >= 0 && index < cursor) {
            return array[index];
        }
        // Написать код, если индекс "не корректный"
        return null; //

    }

    // Удаление элемента по индексу
    public T remove(int index) {
        /*
        1. Проверка индекса на валидность
        2. Удалить значение по индексу
        3. Передвинуть курсор (т.к. кол-во элементов уменьшилось)
        4. Вернуть старое значение
        */

        if (index >= 0 && index < cursor) {
            // Логика удаления
            T value = array[index]; // значение, которое я должен вернуть

            // Перебираем элементы начиная с индекса и перезаписываем значениями из соседней правой ячейки
            for (int i = index; i < cursor - 1; i++) { // граница перебора индексов?
                array[i] = array[i + 1];
            }
            cursor--;

            return value; // возвращаем старое значение

        } else {
//           Индекс не валидный
            return null;
        }
    }

    // Удаление элемента по значению
    @Override
    public boolean remove(T value) {
        /*
        1. Есть ли элемент с таким значение в массиве - indexOf
        2. Если элемента нет - вернуть false
        3. Если элемент есть - удалить и вернуть true - вызвать удаление по индексу
         */
        int index = indexOf(value);
        if (index == -1) return false;

        remove(index);
        return true;
    }

    @Override
    public boolean contains(T value) {
        // 3 >= 0 -> true (элемент найден) | -1 >= 0 -> false (не содержится)
        return indexOf(value) >= 0;

//        int index = indexOf(value);
//        if (index >= 0) {
//            // Индекс, который вернулся больше нуля - элемент найден
//            return true;
//        }
//        else {
//            // index меньше нуля (минус 1), значит такое значение не найдено = не содержится в нашем массиве
//            return false;
//        }
    }

    // Перезаписывает значение по указанному индексу
    @Override
    public void set(int index, T value) {
        if (index >= 0 && index < cursor) {
            // Если индекс "правильный" присваиваем новое значение
            array[index] = value;
        }
        // Если нет, ничего не делаем

    }

    // Является ли коллекция пустой
    @Override
    public boolean isEmpty() {
        // Если курсор равен 0 - значит у нас нет элементов во внутреннем массиве
        return cursor == 0;
    }

    // Поиск по значению. Первое вхождение
    // {1, 100, 5, 5, 100} -> 100 метод вернет индекс первого найдено вхождения = 1
    public int indexOf(T value) {
        for (int i = 0; i < cursor; i++) {
            if (array[i].equals(value)) {
                return i;
            }
        }
        return -1;
    }

    // Метод поиска по значению. Поиск последнего вхождения
    // Возвращает индекс последнего вхождения значения в массиве
    // {1, 100, 5, 5, 100} -> 100 метод вернет индекс последнего найдено вхождения = 4
    public int lastIndexOf(T value) {

        for (int i = cursor - 1; i >= 0; i--) {
            if (array[i].equals(value)) {
                return i;
            }
        }

        return -1;
    }

    // Вернуть наш магический массив в виде обычного массива
    @SuppressWarnings("unchecked")
    @Override
    public T[] toArray() {
        /*
        1. Создать новый массив размерностью cursor
        2. Пройтись по нашему Внутреннему массиву и скопировать все элементы в новый массив
        3. Вернуть ссылку на новый массив
         */

        // Взять какой-то объект из моего массива и узнать на стадии выполнение программы тип этого объекта.
        // И потом могу создать массив этого типа данных

        if (cursor == 0) return null;
        // if (cursor == 0) return (T[]) new Object[0]; // ошибка в RunTime

        Class<T> clazz = (Class<T>) array[0].getClass();
//        System.out.println("clazz = " + clazz);

        // Создаю массив того же типа, как и 0-й элемент
        T[] result = (T[]) Array.newInstance(clazz, cursor);

        for (int i = 0; i < result.length; i++) {
            result[i] = array[i];
        }
        return result;

//          Этот код вызывает ошибку
//        T[] result = (T[]) new Object[cursor];
//        for (int i = 0; i < result.length; i++) {
//            result[i] = array[i];
//        }
    }

    @Override
    public Iterator<T> iterator() {
        // написать имплементацию Iterator<T>
        return new MyIterator();
    }

    private class MyIterator implements Iterator<T> {

        int currentIndex = 0;

        // boolean hasNext() - есть ли следующий элемент

        @Override
        public boolean hasNext() {
            return currentIndex < cursor;
        }

        //  T next() -> возвращает следующий элемент
        @Override
        public T next() {
            return array[currentIndex++];
//            T value = array[currentIndex];
//            currentIndex++;
//            return value;
        }
    } // End MyIterator

} // Класс MyArrayList

/*
1. Добавлять в массив элемент (не думая об индексах, размере массива) ++
2. Динамическое изменение размера массива ++
3. Возвращать строковое представление массива (какие элементы тым есть) ++
4. Добавляем в массив сразу несколько значений. ++
5. Текущее количество элементов в массиве ++
6. Возвращает значение по индексу ++
7. Удаляет элемент по индексу ++ (Есть индекс - удалить этот элемент из массива). Вернуть старое значение (удаленное)
8. Конструктор, принимающий массив ++
9. Удаление по значению
10. Поиск по значению. Возвращает индекс ++
11. Написать метод lastIndexOf(int value) возвращающий индекс последнего вхождения значения в массиве.

 */