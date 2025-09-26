/*
Create customer and bankAccount objects. 
And only using the customer object, deposit or withdraw money.
*/

// BankAccount.java
class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        if (initialBalance >= 0) {
            this.balance = initialBalance;
        } else {
            System.out.println("Invalid initial balance! Setting to 0.");
            this.balance = 0;
        }
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Deposit amount must be positive!");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: " + amount);
        } else {
            System.out.println("Invalid withdraw amount!");
        }
    }

    public double getBalance() {
        return balance;
    }
}
// Customer.java
class Customer {
    private String name;
    private BankAccount account; // Composition

    public Customer(String name, double initialBalance) {
        this.name = name;
        this.account = new BankAccount(initialBalance);
    }

    public void depositMoney(double amount) {
        account.deposit(amount);
    }

    public void withdrawMoney(double amount) {
        account.withdraw(amount);
    }

    public void showBalance() {
        System.out.println(name + "'s Balance: " + account.getBalance());
    }
}
public class BankSystem {
    public static void main(String[] args) {
        Customer c1 = new Customer("Alice", 500);

        c1.showBalance();

        c1.depositMoney(200);
        c1.showBalance();

        c1.withdrawMoney(100);
        c1.showBalance();

        c1.withdrawMoney(1000);
        c1.depositMoney(-50);
    }
}
