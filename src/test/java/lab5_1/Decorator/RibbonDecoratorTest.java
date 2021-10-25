package lab5_1.Decorator;

import lab5_1.Flower;
import lab5_1.FlowerBucket;
import lab5_1.FlowerPack;
import lab5_1.Items;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static lab5_1.FlowerType.Camomile;
import static org.junit.jupiter.api.Assertions.*;

class RibbonDecoratorTest {
Items item;
    @BeforeEach
    void setUp() {
        item = new FlowerBucket();

        FlowerPack flowerPack;
        flowerPack = new FlowerPack();
        flowerPack.setAmount(1);
        flowerPack.setFlower(new Flower(Camomile));
        flowerPack.getFlower().setPrice(10);
        ((FlowerBucket)item).addFlowerPack(flowerPack);

        item = new RibbonDecorator(item);
    }

    @Test
    void price() {
        assertEquals(51,item.price());
    }
    @Test
    void getDescription() {
        assertEquals("Items description",item.getDescription());
    }
}