package lab5_1.Payments;

import lab5_1.Payments.Payment;

public class CreditCardPaymentStrategy implements Payment {
    @Override
    public boolean pay(double price) {
        System.out.println("Paid by credit card: "+price);
return true;
    }
}
