class BankAccount {
    protected double balance;

    BankAccount(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Invalid withdrawal");
        }
    }

    public double getBalance() {
        return balance;
    }
}

class SavingsAccount extends BankAccount {
    SavingsAccount(double balance) {
        super(balance);
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && balance - amount >= 100) {
            balance -= amount;
            System.out.println("Withdrawal successful");
        } else {
            System.out.println("Withdrawal denied: minimum balance of 100 must remain");
        }
    }
}

public class BankAccountMain {
    public static void main(String[] args) {
        SavingsAccount account = new SavingsAccount(500);
        account.deposit(200);
        account.withdraw(550);
        System.out.println("Current balance: " + account.getBalance());
    }
}
