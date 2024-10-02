package homework_17;

public class HomeWork_17 {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Maria", "Neumann", 30, 3400.5);
        Employee employee2 = new Employee("Sem", "Altman", 25, 2700.9);
        Employee employee3 = new Employee("Max", "Red", 40, 1600.16);

        employee1.info();
        employee2.info();
        employee3.info();
    }
}
