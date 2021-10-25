package lab5_1.Delivery;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DHLDeliveryStrategyTest {
    DHLDeliveryStrategy dhlDeliveryStrategy;
    @BeforeEach
    void setUp() {
        dhlDeliveryStrategy = new DHLDeliveryStrategy();
    }

    @Test
    void delivery() {
        assertEquals(true, dhlDeliveryStrategy.delivery());
    }
}