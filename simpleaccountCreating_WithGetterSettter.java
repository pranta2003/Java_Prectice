class Account {
    private int ac;
    private int bal;

    public Account(int ac, int bal) {
        this.ac = ac;
        this.bal = bal;
    }

    // Getter for account number
    public int getAc() {
        return ac;
    }

    // Setter for account number
    public void setAc(int ac) {
        this.ac = ac;
    }

    // Getter for balance
    public int getBal() {
        return bal;
    }

    // Setter for balance
    public void setBal(int bal) {
        this.bal = bal;
    }

    public void display() {
        System.out.println("Account number: " + ac);
        System.out.println("Balance: " + bal);
    }
}

class Customer {
    private int id;
    private Account acc;

    public Customer(int id, int ac, int bal) {
        this.id = id;
        this.acc = new Account(ac, bal);
    }

    // Getter for id
    public int getId() {
        return id;
    }

    // Setter for id
    public void setId(int id) {
        this.id = id;
    }

    // Getter for Account object
    public Account getAccount() {
        return acc;
    }

    // Setter for Account object
    public void setAccount(Account acc) {
        this.acc = acc;
    }

    public void displayCustomer() {
        System.out.println("Customer ID: " + id);
        acc.display();
    }
}

public class simpleaccountCreating_WithGetterSettter {
    public static void main(String[] args) {
        Customer c = new Customer(10, 2020, 5000);

        // Access using getters
        System.out.println("Customer ID (getter): " + c.getId());
        System.out.println("Account number (getter): " + c.getAccount().getAc());
        System.out.println("Balance (getter): " + c.getAccount().getBal());

        // Modify using setters
        c.setId(20);
        c.getAccount().setBal(10000);

        // Display after changes
        c.displayCustomer();
    }
}
