// Q8: Encapsulation, this and Local Variable
class BankAccount {
    private String accountNo;
    private String accountHolderName;
    private double balance;

    BankAccount(String accountNo, String accountHolderName, double balance) {
        this.accountNo = accountNo;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful.");
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    void withdraw(double amount) {
        boolean success; // Local variable records withdrawal result
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            success = true;
        } else {
            success = false;
        }

        if (success) {
            System.out.println("Withdrawal successful.");
        } else {
            System.out.println("Withdrawal failed.");
        }
    }

    double getBalance() {
        return balance;
    }

    void displayAccount() {
        System.out.println("Account No: " + accountNo);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Balance: " + getBalance());
    }
}

public class BankAccountMain {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("AC1001", "Aman", 5000.0);
        account.deposit(1000.0);
        account.withdraw(2000.0);
        account.displayAccount();
    }
}
