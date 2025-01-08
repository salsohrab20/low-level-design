package Behavioural.Strategy;

interface PaymentStrategy{
    void processPayment();
}

class CreditCard implements PaymentStrategy{

    @Override
    public void processPayment() {
        System.out.println("Payment Via Credit Card");
    }
}

class DebitCard implements PaymentStrategy{

    @Override
    public void processPayment() {
        System.out.println("Payment Via Debit Card");
    }
}

class PaymentService{
    private PaymentStrategy paymentStrategy;

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void Pay(){
        paymentStrategy.processPayment();
    }
}

public class StrategyPattern {
    public static void main(String[] args) {
        PaymentService paymentService = new PaymentService();
        paymentService.setPaymentStrategy(new CreditCard());
        paymentService.Pay();

        paymentService.setPaymentStrategy(new DebitCard());
        paymentService.Pay();
    }
}
