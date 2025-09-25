// payment type code
//prectice
import java.util.Scanner;

// Interface
interface Payment {
    // Final variable (constant)
    final String CURRENCY = "USD";

    // Abstract method (must be implemented)
    void processPayment(double amount);

    // Another abstract method
    void paymentSuccess();
}

// Credit card payment class
class CreditCardPayment implements Payment {

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing credit card payment of " + amount + " " + CURRENCY);
    }

    @Override
    public void paymentSuccess() {
        System.out.println("Credit card payment completed successfully!");
    }
}

// Mobile banking payment class
class MobileBankingPayment implements Payment {

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing mobile banking payment of " + amount + " " + CURRENCY);
    }

    @Override
    public void paymentSuccess() {
        System.out.println("Mobile banking payment completed successfully!");
    }
}

// Main class
public class paymenttype {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Credit card payment
        CreditCardPayment credit = new CreditCardPayment();
        System.out.print("Enter credit card payment amount: ");
        double creditAmount = sc.nextDouble();
        credit.processPayment(creditAmount);
        credit.paymentSuccess();

        // Mobile banking payment
        MobileBankingPayment mobile = new MobileBankingPayment();
        System.out.print("Enter mobile banking payment amount: ");
        double mobileAmount = sc.nextDouble();
        mobile.processPayment(mobileAmount);
        mobile.paymentSuccess();

        sc.close();
    }
}
