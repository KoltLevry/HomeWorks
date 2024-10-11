package homework_22;

abstract class Vehicle {
    protected String engineType;

    public Vehicle() { }

    public Vehicle(String engineType) { this.engineType = engineType; }

    abstract void startEngine();
}

class Car extends Vehicle{

    public Car() { }

    public Car(String engineType) { super(engineType); }

    @Override
    public void startEngine(){
        if (engineType == null || engineType.isEmpty()){
            System.out.println("Запускаю двигун авто!");
        } else{
            System.out.println("Запуск двигуна авто. Тип: " + engineType);
        }
    }
}

class Bicycyle extends Vehicle{

    public Bicycyle() { }

    public Bicycyle(String engineType) { super(engineType); }

    @Override
    public void startEngine(){
        if (engineType == null || engineType.isEmpty()){
            System.out.println("Запускаю двигун електро велосипеду!");
        } else{
            System.out.println("Запуск двигуна електро велосипеда. Тип: " + engineType);
        }
    }
}

class Motorcycle extends Vehicle{

    public Motorcycle() {
    }

    public Motorcycle(String engineType) { super(engineType); }

    @Override
    public void startEngine(){
        if (engineType == null || engineType.isEmpty()){
            System.out.println("Запускаю двигун мотоциклу!");
        } else{
            System.out.println("Запуск двигуна мотоцикла. Тип: " + engineType);
        }
    }
}

    // 2
//class Main{
//    public static void main(String[] args) {
//        Vehicle[] vehicles = {
//                new Car("V8"),
//                new Bicycyle(),
//                new Motorcycle("V2"),
//        };
//        for (Vehicle vehicle : vehicles){
//            vehicle.startEngine();
//        }
//    }
//}