package src;

public class Main {
    public static void main(String[] args){
        CreditCardPayment Payment = new CreditCardPayment();
        Payment.processPayment(1000);
        System.out.println("Payment type: " + src.Payment.getPaymentType());
    }
}
