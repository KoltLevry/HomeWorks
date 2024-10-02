package homework_17;

public class Employee {
    private final String firstName;
    private final String lastName;
    private final int age;
    private double salary;

    public Employee(String firstName, String lastName, int age, double salary){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void info(){
        System.out.printf("Name: %s %s | Age: %d | Salary: %.2f%n", firstName, lastName, age, salary);
    }
}
