class Medicine {
    String name;
    double price;

    Medicine(String name, double price) {
        this.name = name;
        this.price = price;
    }

    void display() {
        System.out.println("Medicine: " + name);
        System.out.println("Price: " + price);
    }
}

public class Q2 {
    public static void main(String[] args) {
        Medicine m = new Medicine("Paracetamol", 25.50);
        m.display();
    }
}
