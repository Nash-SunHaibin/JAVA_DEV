package src;

class CreditCardPayment implements Payment{
    @Override
    public void processPayment(double amount){
        double total = calculateTax(amount);
        System.out.println("Processing credit card payment of: " + total);
    }
}
