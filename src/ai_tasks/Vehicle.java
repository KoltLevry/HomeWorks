package ai_tasks;

public class Vehicle {
    private String brand;
    private int year;

    public Vehicle(String brand, int year){
        this.brand = brand;
        this.year = year;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void start(){
        System.out.println("Транспортний засіб " + brand + " запущено.");
    }
    public void stop(){
        System.out.println("Транспортний засіб " + brand + " зупинено.");
    }
}

// Похідний клас Car

class SportCar extends Vehicle{

    private int numberOfDoors;

    public SportCar(String brand, int year, int numberOfDoors){
        super(brand, year);
        this.numberOfDoors = numberOfDoors;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public void honk(){
        System.out.println("Автомобіль " + getBrand() + " сигналить");
    }
}

// Похідний клас Bike

class Bike extends Vehicle{
    private boolean hasCarrier;

    public Bike(String brand, int year, boolean hasCarrier){
        super(brand, year);
        this.hasCarrier = hasCarrier;
    }

    public boolean isHasCarrier() {
        return hasCarrier;
    }

    public void setHasCarrier(boolean hasCarrier) {
        this.hasCarrier = hasCarrier;
    }
    public void ringBell() {
        System.out.println("Велосипед " + getBrand() + " дзвонить.");
    }
}

/*
public static void main(String[] args) {
        SportCar car1 = new SportCar("Mercedes", 2020, 4); // кар-кар . хто поняв тот поняв (було: Car car ...)
         System.out.println("\t == Car1 ==");
         car1.start();
         car1.honk();
         car1.stop();

         Bike bike = new Bike("Honda", 2003, false);
         System.out.println("\n\t == Bike ==");
         bike.start();
         bike.ringBell();
         bike.stop();

         Vehicle car2 = new Vehicle("Kia", 2000);
         System.out.println("\n\t == Car2 - Vehicle ==");
         car2.start();
         car2.stop();
     }
 */