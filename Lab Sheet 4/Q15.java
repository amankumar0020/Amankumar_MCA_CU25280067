class Person {
    private String name;

    Person(String name) {
        this.name = name;
    }

    void displayPerson() {
        System.out.println("Name: " + name);
    }
}

class Employee extends Person {
    private int employeeId;

    Employee(String name, int employeeId) {
        super(name);
        this.employeeId = employeeId;
    }

    void displayEmployee() {
        displayPerson();
        System.out.println("Employee ID: " + employeeId);
    }
}

class Pharmacist extends Employee {
    private String department;

    Pharmacist(String name, int id, String department) {
        super(name, id);
        this.department = department;
    }

    @Override
    void displayEmployee() {
        super.displayEmployee();
        System.out.println("Department: " + department);
        System.out.println("Role: Pharmacist");
    }
}

class HospitalSystem {
    void run() {
        Pharmacist p = new Pharmacist("Rahul", 101, "Pharmacy");
        System.out.println("Hospital Staff Record");
        p.displayEmployee();
    }
}

public class Q15 {
    public static void main(String[] args) {
        HospitalSystem system = new HospitalSystem();
        system.run();
    }
}
