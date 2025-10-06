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

// Customer IS an Account (inheritance)
class Customer extends Account {
    int id;

    public Customer(int id, int ac, int bal) {
        super(ac, bal); // call Account constructor
        this.id = id;
    }

    void displayAgain() {
        System.out.println("Customer ID: " + id);
        display(); // call inherited display()
    }
}

public class simpleaccountCreating_WithInheritence {
    public static void main(String[] args) {
        Customer c = new Customer(10, 2020, 5000);
        c.displayAgain();
    }
}
