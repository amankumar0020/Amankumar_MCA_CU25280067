// Q19: Integrated Hospital Staff Management
class Person {
    protected String name;
    protected int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Employee extends Person {
    private int employeeId;
    private double salary;
    static int employeeCount = 0; // Shared count

    Employee(String name, int age, int employeeId, double salary) {
        super(name, age);
        this.employeeId = employeeId;
        setSalary(salary);
        employeeCount++;
    }

    public int getEmployeeId() { return employeeId; }
    public double getSalary() { return salary; }
    public void setEmployeeId(int employeeId) { this.employeeId = employeeId; }

    public void setSalary(double salary) {
        if (salary >= 0) {
            this.salary = salary;
        } else {
            System.out.println("Invalid salary rejected.");
        }
    }

    void displayEmployee() {
        System.out.println("ID: " + employeeId + ", Name: " + name
                + ", Age: " + age + ", Salary: " + salary);
    }
}

class Doctor extends Employee {
    private String specialization;

    Doctor(String name, int age, int employeeId, double salary, String specialization) {
        super(name, age, employeeId, salary);
        this.specialization = specialization;
    }

    void displayDoctor() {
        displayEmployee();
        System.out.println("Role: Doctor, Specialization: " + specialization);
    }
}

class Pharmacist extends Employee {
    private String licenseNo;

    Pharmacist(String name, int age, int employeeId, double salary, String licenseNo) {
        super(name, age, employeeId, salary);
        this.licenseNo = licenseNo;
    }

    void displayPharmacist() {
        displayEmployee();
        System.out.println("Role: Pharmacist, License: " + licenseNo);
    }
}

class StaffManager {
    void displayStaff(Employee[] staff) {
        int i; // Local variable
        for (i = 0; i < staff.length; i++) {
            if (staff[i] instanceof Doctor) {
                ((Doctor) staff[i]).displayDoctor();
            } else if (staff[i] instanceof Pharmacist) {
                ((Pharmacist) staff[i]).displayPharmacist();
            }
        }
    }
}

public class HospitalStaffMain {
    public static void main(String[] args) {
        Employee[] staff = {
            new Doctor("Meera", 38, 101, 65000, "Cardiology"),
            new Pharmacist("Amit", 29, 102, 35000, "PH7788")
        };
        StaffManager manager = new StaffManager();
        manager.displayStaff(staff);
        System.out.println("Total employees: " + Employee.employeeCount);
    }
}
