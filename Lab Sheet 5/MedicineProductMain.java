// Q6: Encapsulation using private fields, getters and setters
class MedicineProduct {
    private String medicineName;
    private String batchNo;
    private double price;

    MedicineProduct(String medicineName, String batchNo, double price) {
        this.medicineName = medicineName;
        this.batchNo = batchNo;
        this.price = price;
    }

    public String getMedicineName() { return medicineName; }
    public String getBatchNo() { return batchNo; }
    public double getPrice() { return price; }

    public void setMedicineName(String medicineName) { this.medicineName = medicineName; }
    public void setBatchNo(String batchNo) { this.batchNo = batchNo; }
    public void setPrice(double price) { this.price = price; }

    void displayProduct() {
        System.out.println("Medicine: " + medicineName);
        System.out.println("Batch: " + batchNo);
        System.out.println("Price: " + price);
    }
}

public class MedicineProductMain {
    public static void main(String[] args) {
        MedicineProduct product = new MedicineProduct("Paracetamol", "P100", 30.0);
        product.setPrice(35.0);
        System.out.println("Updated medicine: " + product.getMedicineName());
        product.displayProduct();
    }
}
