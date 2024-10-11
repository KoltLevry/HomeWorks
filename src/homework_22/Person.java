package homework_22;

abstract class Person {
    protected int speed;
    protected int restTime;

    public Person() {
        this.speed = 10;
        this.restTime = 15;
    }

    protected void run(){
        System.out.println("Біжу зі шв " + speed + " км / год");
        showRestTome();
    }
    protected void showRestTome(){
        System.out.println("Потрібен відпочинок " + restTime + " хв");
    }
}

class AmateurAthlete extends Person {
    public AmateurAthlete() {
        this.speed = 15;
        this.restTime = 10;
    }

    @Override
    protected void run(){
        System.out.println("Атлет аматор біжить зі шв " + speed + " км / год");
        showRestTome();
    }
    @Override
    protected void showRestTome(){
        System.out.println("Атлету аматору потрібен відпочинок " + restTime + " хв");
    }

}

class ProAthlete extends AmateurAthlete{
    public ProAthlete() {
        this.speed = 25;
        this.restTime = 5;
    }
    @Override
    protected void run(){
        System.out.println("Атлет професіонал біжить зі шв " + speed + " км / год");
        showRestTome();
    }
    @Override
    protected void showRestTome(){
        System.out.println("Атлету професіоналу потрібен відпочинок " + restTime + " хв");
    }
}

    // 1
//class Main{
//    public static void main(String[] args) {
//        Person myFriendAmateur = new AmateurAthlete();
//        myFriendAmateur.run();
//
//        Person myFriendPro = new ProAthlete();
//        myFriendPro.run();
//    }
//}