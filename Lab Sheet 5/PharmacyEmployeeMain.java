// Q20: Pharmacy Employee Management System
class Employee {
    private int employeeId;
    private String employeeName;
    private double salary;
    static int employeeCount = 0; // Class variable shared by all employees

    protected String department = "Pharmacy"; // Protected member for child classes

    Employee(int employeeId, String employeeName, double salary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        setSalary(salary);
        employeeCount++;
    }

    public int getEmployeeId() { return employeeId; }
    public String getEmployeeName() { return employeeName; }
    public double getSalary() { return salary; }

    public void setEmployeeId(int employeeId) { this.employeeId = employeeId; }
    public void setEmployeeName(String employeeName) { this.employeeName = employeeName; }

    public void setSalary(double salary) {
        if (salary >= 0) {
            this.salary = salary;
        } else {
            System.out.println("Negative salary rejected.");
        }
    }

    // Default-access method: no access keyword
    void displayBasicDetails() {
        System.out.println("ID: " + employeeId + ", Name: " + employeeName
                + ", Salary: " + salary + ", Department: " + department);
    }

    String getRole() {
        return "Employee";
    }
}

class Pharmacist extends Employee {
    private String licenseNo;

    Pharmacist(int employeeId, String employeeName, double salary, String licenseNo) {
        super(employeeId, employeeName, salary);
        this.licenseNo = licenseNo;
    }

    void displayRoleDetails() {
        displayBasicDetails();
        System.out.println("Role: Pharmacist, License: " + licenseNo);
    }

    @Override
    String getRole() {
        return "Pharmacist";
    }
}

class StoreManager extends Employee {
    private int storeSection;

    StoreManager(int employeeId, String employeeName, double salary, int storeSection) {
        super(employeeId, employeeName, salary);
        this.storeSection = storeSection;
    }

    void displayRoleDetails() {
        displayBasicDetails();
        System.out.println("Role: Store Manager, Section: " + storeSection);
    }

    @Override
    String getRole() {
        return "Store Manager";
    }
}

class EmployeeManager {
    void processEmployees(Employee[] employees) {
        int count = 0; // Local variable
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() >= 0) { // Condition for filtering
                count++;
                if (employees[i] instanceof Pharmacist) {
                    ((Pharmacist) employees[i]).displayRoleDetails();
                } else if (employees[i] instanceof StoreManager) {
                    ((StoreManager) employees[i]).displayRoleDetails();
                }
                System.out.println();
            }
        }
        System.out.println("Employees processed: " + count);
        System.out.println("Total Employee objects created: " + Employee.employeeCount);
    }
}

public class PharmacyEmployeeMain {
    public static void main(String[] args) {
        Employee[] employees = {
            new Pharmacist(101, "Rohan", 32000, "PH4567"),
            new StoreManager(102, "Simran", 45000, 3)
        };
        EmployeeManager manager = new EmployeeManager();
        manager.processEmployees(employees);
    }
}
