class Pharmacy {
    static String name = "City Pharmacy";
    static String location = "Dehradun";

    void display() {
        System.out.println(name + " - " + location);
    }
}

public class Q3 {
    public static void main(String[] args) {
        Pharmacy p1 = new Pharmacy();
        Pharmacy p2 = new Pharmacy();
        p1.display();
        p2.display();

        Pharmacy.name = "Health Pharmacy";
        System.out.println("After changing static name:");
        p1.display();
        p2.display();
    }
}
