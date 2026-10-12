class InsufficientFundsException extends Exception {
    InsufficientFundsException(String message) { super(message); }
}
class BankAccount {
    private double balance;
    BankAccount(double balance) { this.balance = balance; }
    void withdraw(double amount) throws InsufficientFundsException {
        if (amount < 0) throw new IllegalArgumentException("Amount cannot be negative.");
        if (amount > balance) throw new InsufficientFundsException("Insufficient account balance.");
        balance -= amount;
        System.out.println("Withdrawal successful.");
        System.out.println("Remaining balance = " + balance);
    }
}
public class Q10 {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(5000);
        try {
            account.withdraw(6000);
        } catch (InsufficientFundsException | IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
