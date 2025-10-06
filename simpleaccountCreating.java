class Account {
    int ac;
    int bal;

    public Account(int ac, int bal) {
        this.ac = ac;
        this.bal = bal;
    }

    void display() {
        System.out.println("Account number: " + ac);
        System.out.println("Balance: " + bal);
    }
}

class Customer {
    int id;
    private Account acc; // HAS-A relationship

    // Now we receive Account object instead of creating it
    public Customer(int id, Account acc) {
        this.id = id;
        this.acc = acc; // use the object passed from outside
    }

    void displayAgain() {
        System.out.println("Customer ID: " + id);
        acc.display(); // call Account's display
    }
}

public class simpleaccountCreating {
    public static void main(String[] args) {
        // Create Account object separately
        Account a1 = new Account(2020, 5000);

        // Pass the object to Customer
        Customer c = new Customer(10, a1);

        c.displayAgain();
    }
}
