// Q4: Object Array, Loop and Local Variable
class Patient {
    int patientId;
    String patientName;
    int age;

    Patient(int patientId, String patientName, int age) {
        this.patientId = patientId;
        this.patientName = patientName;
        this.age = age;
    }

    void displayPatient() {
        System.out.println("ID: " + patientId + ", Name: " + patientName + ", Age: " + age);
    }
}

class PatientManager {
    void displayAllPatients(Patient[] patients) {
        for (int i = 0; i < patients.length; i++) { // i is a local variable
            patients[i].displayPatient();
        }
    }
}

public class PatientMain {
    public static void main(String[] args) {
        Patient[] patients = {
            new Patient(1, "Aman", 25),
            new Patient(2, "Riya", 30),
            new Patient(3, "Rahul", 42),
            new Patient(4, "Neha", 19),
            new Patient(5, "Karan", 55)
        };
        PatientManager manager = new PatientManager();
        manager.displayAllPatients(patients);
    }
}
