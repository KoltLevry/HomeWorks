package lesson_38;

public class Car implements Comparable <Car>{
    private String model;
    private int year;
    private int speed;

    public Car(String model, int year, int speed) {
        this.model = model;
        this.year = year;
        this.speed = speed;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public int getSpeed() {
        return speed;
    }

    @Override
    public String toString() {
//        return "Car {" +
//                "model = '" + model + '\'' +
//                ", year = " + year +
//                ", speed = " + speed +
//                '}';
        return String.format("Car {model = %-8s | year = %-4d | speed = %-3d}", model, year, speed);
    }

    @Override
    public int compareTo(Car auto) {
        return this.year - auto.year;
    }

    public static void printCars(Car[] cars){
        for(Car car : cars) {
            System.out.println(car);
        }
    }
}
