interface BankOperations {
    void deposit(int amount);
    void withdraw(int amount);
}

class Account implements BankOperations {
    private int balance;

    public Account() {
        balance = 0;
    }

    @Override
    public void deposit(int amount) {
        balance += amount;
        System.out.println("Deposited: " + amount + ". New balance: " + balance);
    }

    @Override
    public void withdraw(int amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount + ". Remaining balance: " + balance);
        } else {
            System.out.println("Insufficient funds. Current balance: " + balance);
        }
    }

    public int getBalance() {
        return balance;
    }
}

public class Main {
    public static void main(String[] args) {
        Account myAccount = new Account();
        myAccount.deposit(1000);
        myAccount.withdraw(500);
        myAccount.withdraw(600);  // Insufficient funds
    }
}
