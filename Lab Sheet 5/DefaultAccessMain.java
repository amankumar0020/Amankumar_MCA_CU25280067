// Q11: Default / Package-Private Access
class Pharmacy {
    // No access keyword means default/package-private access.
    String medicineName;
    double price;

    Pharmacy() { // Default-access constructor
        medicineName = "Vitamin C";
        price = 50.0;
    }

    void displayMedicine() { // Default-access method
        System.out.println("Medicine: " + medicineName);
        System.out.println("Price: " + price);
    }
}

public class DefaultAccessMain {
    public static void main(String[] args) {
        Pharmacy pharmacy = new Pharmacy();
        pharmacy.medicineName = "Paracetamol";
        pharmacy.price = 25.0;
        System.out.println(pharmacy.medicineName);
        System.out.println(pharmacy.price);
        pharmacy.displayMedicine();
    }
}
