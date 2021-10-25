package lab5_1.Payments;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PayPalPaymentStrategyTest {
    PayPalPaymentStrategy paypalCardPaymentStrategy;
    @BeforeEach
    void setUp() {
        paypalCardPaymentStrategy = new PayPalPaymentStrategy();
    }

    @Test
    void pay() {
        assertTrue(paypalCardPaymentStrategy.pay(20.9));
    }
}