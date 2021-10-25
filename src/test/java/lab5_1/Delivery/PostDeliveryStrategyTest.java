package lab5_1.Delivery;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PostDeliveryStrategyTest {
PostDeliveryStrategy postDeliveryStrategy;
    @BeforeEach
    void setUp() {
        postDeliveryStrategy = new PostDeliveryStrategy();
    }

    @Test
    void delivery() {
        assertEquals(true, postDeliveryStrategy.delivery());
    }
}