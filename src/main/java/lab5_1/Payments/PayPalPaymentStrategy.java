package lab5_1.Payments;

import lab5_1.Payments.Payment;

public class PayPalPaymentStrategy implements Payment {
    @Override
    public boolean pay(double price) {
        System.out.println("Paid by PayPal: "+price);
        return true;
    }
}
