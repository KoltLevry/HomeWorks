package homework_24;

interface Swimmer{
    void swim();
}

interface Runner{
    void run();
}

public class Triathlete implements Swimmer, Runner{
    @Override
    public void swim(){
        System.out.println("I`m swimming!");
    }
    @Override
    public void run(){
        System.out.println("I`m running!");
    }
}

//class Main{
//    public static void main(String[] args) {
//        Triathlete triathlete = new Triathlete();
//        triathlete.run();
//        triathlete.swim();
//    }
//}