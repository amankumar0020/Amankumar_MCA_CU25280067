class Employee {
    public void work() {
        System.out.println("Employee is working");
    }

    public double getSalary() {
        return 30000;
    }
}

class HRManager extends Employee {
    @Override
    public void work() {
        System.out.println("HR Manager is managing HR activities");
    }

    public void addEmployee(String name) {
        System.out.println(name + " added as an employee");
    }
}

public class EmployeeMain {
    public static void main(String[] args) {
        HRManager manager = new HRManager();
        manager.work();
        System.out.println("Salary: " + manager.getSalary());
        manager.addEmployee("Rahul");
    }
}
