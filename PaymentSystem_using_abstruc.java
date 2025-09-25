// File: PaymentSystem.java

abstract class Payment {
    // Abstract method
    abstract void processPayment(double amount);

    // Non-abstract method
    void paymentSuccess() {
        System.out.println("Payment completed successfully!");
    }
}

// Subclass for credit card payment
class CreditCardPayment extends Payment {
    @Override
    void processPayment(double amount) {
        System.out.println("Processing credit card payment of $" + amount);
    }
}

// Subclass for mobile banking payment
class MobileBankingPayment extends Payment {
    @Override
    void processPayment(double amount) {
        System.out.println("Processing mobile banking payment of $" + amount);
    }
}

// Main class
public class PaymentSystem_using_abstruc {
    public static void main(String[] args) {
        // Create objects
        Payment creditCard = new CreditCardPayment();
        Payment mobileBanking = new MobileBankingPayment();

        // Process payments
        creditCard.processPayment(500);
        creditCard.paymentSuccess();

        mobileBanking.processPayment(300);
        mobileBanking.paymentSuccess();
    }
}
