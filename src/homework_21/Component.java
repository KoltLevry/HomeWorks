package homework_21;

public class Component {
    protected final String brand;
    protected final String model;

    public Component(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public String getBrand(){
        return brand;
    }
    public String getModel(){
        return model;
    }
}

class Processor extends Component {
    public Processor(String brand, String model){
        super(brand, model);
    }
}

class Memory extends Component {
    public Memory(String brand, String model){
        super(brand, model);
    }
}

class Storage extends Component {
    public Storage(String brand, String model){
        super(brand, model);
    }
}

class Computer {
    private Processor processor;
    private Memory memory;
    private Storage storage;

    public Computer(Processor processor, Memory memory, Storage storage) {
        if (processor == null || memory == null) {
            throw new IllegalArgumentException("Processor and Memory are required components.");
        }
        this.processor = processor;
        this.memory = memory;
        this.storage = storage;
    }

    public void displayComponents() {
        System.out.println("Computer Components:");
        System.out.println("Processor: " + processor.getBrand() + " " + processor.getModel());
        System.out.println("Memory: " + memory.getBrand() + " " + memory.getModel());
        if (storage != null) {
            System.out.println("Storage: " + storage.getBrand() + " " + storage.getModel());
        } else {
            System.out.println("Storage: None");
        }
    }
}

class Main {
    public static void main(String[] args) {
        Processor processor = new Processor("Intel", "i9-12900K");
        Memory memory = new Memory("Corsair", "Vengeance LPX 32GB");
        Storage storage = new Storage("Samsung", "970 EVO 1TB");

        Computer computer = new Computer(processor, memory, storage);

        computer.displayComponents();
    }
}