// Account class
class Account {
    private int ac, bal;

    public Account(int ac, int bal) {
        this.ac = ac;
        this.bal = bal;
    }

    public int getAc() { return ac; }
    public void setAc(int ac) { this.ac = ac; }

    public int getBal() { return bal; }
    public void setBal(int bal) { this.bal = bal; }

    public void display() {
        System.out.println("Account number: " + ac);
        System.out.println("Balance: " + bal);
    }
}

// Customer class inherits Account
class Customer extends Account {
    private int id;

    public Customer(int id, int ac, int bal) {
        super(ac, bal);
        this.id = id;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public void displayCustomer() {
        System.out.println("Customer ID: " + id);
        display(); // call Account's display
    }
}

// Main class
public class simpleaccountCreating_anotherApporach {
    public static void main(String[] args) {
        Customer c = new Customer(10, 2020, 5000);
        c.displayCustomer();

        // Modify using setters
        c.setId(20);
        c.setBal(10000);

        System.out.println("\nAfter modification:");
        c.displayCustomer();
    }
}
