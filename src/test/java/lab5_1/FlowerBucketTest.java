package lab5_1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static lab5_1.FlowerType.Camomile;
import static org.junit.jupiter.api.Assertions.*;

class FlowerBucketTest {
    FlowerPack flowerPack;

    @BeforeEach
    void setUp() {
        flowerPack = new FlowerPack();
        flowerPack.setAmount(19);
        flowerPack.setFlower(new Flower(Camomile));
        flowerPack.getFlower().setPrice(10);
    }

    @Test
    void getPrice() {
        assertEquals(19,flowerPack.getPrice());
    }
}