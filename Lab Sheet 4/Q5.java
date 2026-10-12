class Patient {
    int age;

    Patient(int age) {
        this.age = age;
    }

    void checkEligibility() {
        if (age >= 18) System.out.println("Patient is an adult.");
        else System.out.println("Patient is a minor.");
    }
}

public class Q5 {
    public static void main(String[] args) {
        Patient p = new Patient(20);
        p.checkEligibility();
    }
}
