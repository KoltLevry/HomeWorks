package ai_tasks;

public class Car {
    private String brand;
    private String model;
    private int year;

    public Car(String brand, String model, int year){
        this.brand = brand;
        this.model = model;
        setYear(year);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year > 0){
            this.year = year;
        } else {
            System.out.println("Error. Number isn't correct!");
        }

    }

    public void startEngine(){
        System.out.println("Двигун " + brand + " " + model + " запущено.");
    }
}
