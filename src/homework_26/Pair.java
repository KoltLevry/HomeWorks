package homework_26;

public class Pair<T> {
    private T first;
    private T second;

    public Pair(T first, T second){
        this.first = first;
        this.second = second;
    }

    public T getFirst(){
        return first;
    }

    public T getSecond(){
        return second;
    }

    private void setFirst(T value){
        first = value;
    }

    private void setSecond(T value){
        second = value;
    }

    public void swap(){
        T temp = first;
        first = second;
        second = temp;
    }

    public static void main(String[] args) {
        Pair<String> pair = new Pair<>("Hello", "World");

        System.out.println("First: " + pair.getFirst());  // Вывод: Hello
        System.out.println("Second: " + pair.getSecond());  // Вывод: World

        pair.swap();

        System.out.println("First after swap: " + pair.getFirst());  // Вывод: World
        System.out.println("Second after swap: " + pair.getSecond());  // Вывод: Hello
    }
}
