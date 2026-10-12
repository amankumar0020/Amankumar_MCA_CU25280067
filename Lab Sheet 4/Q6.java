class MedicineProduct {
    private String name;
    private double price;

    MedicineProduct(String name, double price) {
        this.name = name;
        this.price = price;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
    }
}

public class Q6 {
    public static void main(String[] args) {
        MedicineProduct m = new MedicineProduct("Vitamin C", 100.0);
        m.display();
    }
}
