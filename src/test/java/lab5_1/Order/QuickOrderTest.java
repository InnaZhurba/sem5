package lab5_1.Order;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QuickOrderTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void createOrder() {
        //assertEquals(new Order(),QuickOrder.createOrder(QuickOrder.TULIP_BUCKET));
        assertNotNull(QuickOrder.createOrder(QuickOrder.TULIP_BUCKET));
    }
}