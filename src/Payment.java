package src;

interface Payment {
    double TAX_RATE = 0.2;

    void processPayment(double amount);

    default double calculateTax(double amount){
        return amount * TAX_RATE;
    }

    static String getPaymentType(){
        return "Digital Payment";
    }
}
