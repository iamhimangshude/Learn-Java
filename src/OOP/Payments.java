package OOP;

public class Payments {
    static void main(String[] args) {

        PaymentProcessor rupay = new CreditCardProcessor();
        PaymentProcessor bitcoin = new CryptoProcessor();

        CheckoutSystem checkout = new CheckoutSystem(rupay);
        System.out.println("Credit Card Checkout:");
        checkout.completeTransaction(150.50);

        System.out.println();

        CheckoutSystem dynamicCheckout = new CheckoutSystem(bitcoin);
        System.out.println("Bitcoin Checkout:");
        dynamicCheckout.completeTransaction(75.25);
    }
}

interface PaymentProcessor {
    void processPayment(double amount);
}

class CreditCardProcessor implements PaymentProcessor {

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing credit card payment of $" + amount + " with a 2% processing fee.");
    }
}

class CryptoProcessor implements PaymentProcessor {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing cryptocurrency payment of $" + amount + " using secure blockchain verification.");
    }
}

class CheckoutSystem {
    private final PaymentProcessor paymentProcessor;

    public CheckoutSystem(PaymentProcessor paymentProcessor) {
        this.paymentProcessor = paymentProcessor;
    }

    public void completeTransaction(double cartTotal) {
        paymentProcessor.processPayment(cartTotal);
    }
}