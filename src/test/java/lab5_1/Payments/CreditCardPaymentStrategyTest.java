package lab5_1.Payments;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CreditCardPaymentStrategyTest {
CreditCardPaymentStrategy creditCardPaymentStrategy;
    @BeforeEach
    void setUp() {
        creditCardPaymentStrategy = new CreditCardPaymentStrategy();
    }

    @Test
    void pay() {
        assertTrue(creditCardPaymentStrategy.pay(200));
    }
}