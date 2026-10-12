abstract class Employee {
    protected String name;

    Employee(String name) {
        this.name = name;
    }

    public abstract double calculateSalary();
    public abstract void displayInfo();
}

class Manager extends Employee {
    private double basicSalary;
    private double bonus;

    Manager(String name, double basicSalary, double bonus) {
        super(name);
        this.basicSalary = basicSalary;
        this.bonus = bonus;
    }

    public double calculateSalary() { return basicSalary + bonus; }

    public void displayInfo() {
        System.out.println("Manager: " + name + ", Salary: " + calculateSalary());
    }
}

class Programmer extends Employee {
    private double basicSalary;
    private double overtimePay;

    Programmer(String name, double basicSalary, double overtimePay) {
        super(name);
        this.basicSalary = basicSalary;
        this.overtimePay = overtimePay;
    }

    public double calculateSalary() { return basicSalary + overtimePay; }

    public void displayInfo() {
        System.out.println("Programmer: " + name + ", Salary: " + calculateSalary());
    }
}

public class EmployeeAbstractMain {
    public static void main(String[] args) {
        Employee manager = new Manager("Amit", 50000, 10000);
        Employee programmer = new Programmer("Neha", 40000, 5000);
        manager.displayInfo();
        programmer.displayInfo();
    }
}
