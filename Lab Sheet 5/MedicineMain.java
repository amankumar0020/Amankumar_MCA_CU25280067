// Q2: Parameterized Constructor and this
class Medicine {
    String medicineName;
    String batchNo;
    double price;

    Medicine(String medicineName, String batchNo, double price) {
        this.medicineName = medicineName;
        this.batchNo = batchNo;
        this.price = price;
    }

    void displayMedicine() {
        System.out.println("Medicine: " + medicineName);
        System.out.println("Batch No: " + batchNo);
        System.out.println("Price: " + price);
        System.out.println();
    }
}

public class MedicineMain {
    public static void main(String[] args) {
        Medicine m1 = new Medicine("Paracetamol", "B101", 25.50);
        Medicine m2 = new Medicine("Cetirizine", "B202", 40.00);
        m1.displayMedicine();
        m2.displayMedicine();
    }
}
