package homework_15;

public class HomeWork_15 {
    public static void main(String[] args) {
        Dog coco = new Dog("Coco");
        coco.animalTyp();
        coco.makeSound();
        coco.sleep();
        coco.eat();
        coco.play();

        Cat girly = new Cat("Girly");
        girly.animalTyp();
        girly.makeSound();
        girly.sleep();

        Cow star = new Cow("Star");
        star.animalTyp();
        star.makeSound();
        star.eat();
    }
}

class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void animalTyp(){
        System.out.println("\n\t == Animal ==");
    }

    public void makeSound(){
        System.out.println("The animal make sound: ");
    }

    public void sleep(){
        System.out.println(name + " is sleeping");
    }

    public void eat(){
        System.out.println(name + " is eating");
    }

    public void play(){
        System.out.println(name + " is playing");
    }
}

class Dog extends Animal {
    public Dog(String name){
        super(name);
    }

    @Override
    public void animalTyp(){
        System.out.println("\n\t == Dog == " + getName() );
    }

    @Override
    public void makeSound(){
        System.out.println("The animal make sound: Bark");
    }
}

class Cat extends Animal {
    public Cat(String name){
        super(name);
    }

    @Override
    public void animalTyp(){
        System.out.println("\n\t == Cat == " + getName());
    }

    @Override
    public void makeSound(){
        System.out.println("The animal make sound: Meow");
    }
}

class Cow extends Animal {
    public Cow(String name){
        super(name);
    }

    @Override
    public void animalTyp(){
        System.out.println("\n\t == Cow == " + getName());
    }

    @Override
    public void makeSound(){
        System.out.println("The animal make sound: Moo");
    }
}
