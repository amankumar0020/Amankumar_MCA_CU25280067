class MedicineStock {
    String name;
    int quantity;

    MedicineStock(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    void display() {
        System.out.println(name + " - Quantity: " + quantity);
    }
}

class Inventory {
    void displayInventory() {
        MedicineStock[] stock = {
            new MedicineStock("Paracetamol", 50),
            new MedicineStock("Cetirizine", 30),
            new MedicineStock("Vitamin C", 40)
        };
        for (MedicineStock m : stock) m.display();
    }
}

public class Q4 {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        inventory.displayInventory();
    }
}
