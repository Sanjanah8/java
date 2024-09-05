// Transaction interface
interface Transaction {
    void deposit(double amount);
    void withdraw(double amount);
    void displayBalance();
}

// SavingsAccount class
class SavingsAccount implements Transaction {
    private double balance;

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited " + amount + " in Savings Account");
    }

    @Override
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrew " + amount + " from Savings Account");
        } else {
            System.out.println("Insufficient balance in Savings Account!");
        }
    }

    @Override
    public void displayBalance() {
        System.out.println("Savings Account Balance: " + balance);
    }
}

// CurrentAccount class
class CurrentAccount implements Transaction {
    private double balance;

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited " + amount + " in Current Account");
    }

    @Override
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrew " + amount + " from Current Account");
        } else {
            System.out.println("Insufficient balance in Current Account!");
        }
    }

    @Override
    public void displayBalance() {
        System.out.println("Current Account Balance: " + balance);
    }
}

// Main class to test the implementation
public class BankTransactions {
    public static void main(String[] args) {
        Transaction savings = new SavingsAccount();
        savings.deposit(1000);
        savings.withdraw(500);
        savings.displayBalance();

        Transaction current = new CurrentAccount();
        current.deposit(2000);
        current.withdraw(2500);  // This will give an insufficient balance message
        current.displayBalance();
    }
}
