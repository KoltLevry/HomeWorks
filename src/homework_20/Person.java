package homework_20;

public class Person {
    protected final String name;

    public Person(String name) {
        this.name = name;
    }
    public String toString(){
        return "Person name: " + name;
    }
}

class Employee extends Person{
    protected final double salary;

    public Employee(String name, double salary) {
        super(name);
        this.salary = salary;
    }
}

class Teacher extends Employee{
    public Teacher(String name, double salary) {
        super(name, salary);
    }
    @Override
    public String toString(){
        return "Person name: " + name + " | I teach! | Salary: " + salary;
    }
}

class Security extends Employee{
    public Security(String name, double salary) {
        super(name, salary);
    }
    @Override
    public String toString(){
        return "Person name: " + name + " | I guard! | Salary: " + salary;
    }
}

class Main {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("John", 4000);
        Security security = new Security("Mike", 3000);

        System.out.println(teacher);
        System.out.println(security);
    }
}