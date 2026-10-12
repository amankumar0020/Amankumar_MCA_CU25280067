class Employee {
    String name = "Amit";

    void displayEmployee() {
        System.out.println("Employee Name: " + name);
    }
}

class Pharmacist extends Employee {
    void displayRole() {
        System.out.println("Role: Pharmacist");
    }
}

public class Q9 {
    public static void main(String[] args) {
        Pharmacist p = new Pharmacist();
        p.displayEmployee();
        p.displayRole();
    }
}
