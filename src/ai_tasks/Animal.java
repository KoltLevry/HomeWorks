package ai_tasks;

public class Animal {
    public void makeSound(){
        System.out.println("\n\t == Animal ==");
        System.out.println("Some sound.");
    }
}
class Dog extends Animal{
    @Override
    public void makeSound(){
        System.out.println("\n\t == Dog ==");
        System.out.println("Bark");
    }
}

class Cat extends Animal{
    @Override
    public void makeSound(){
        System.out.println("\n\t == Cat ==");
        System.out.println("Meow");
    }
}

class Cow extends Animal{
    @Override
    public void makeSound(){
        System.out.println("\n\t == Cow ==");
        System.out.println("Moo");
    }
}