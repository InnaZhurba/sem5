package lab5_1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class FlowerStoreTest {

    Flower flower = new Flower(FlowerType.Camomile);
    FlowerStore flowerStore = new FlowerStore();
    @BeforeEach
    void setUp() {
        ArrayList<FlowerBucket> flowerBucket = new ArrayList<>();
        FlowerPack flowerPack = new FlowerPack();
        flowerPack.setFlower(new Flower(FlowerType.Tulip));
        FlowerBucket temp = new FlowerBucket();
        temp.addFlowerPack(flowerPack);
        flowerBucket.add(temp);
        flowerStore.setBucket(flowerBucket);
    }

    @Test
    void search() {
        FlowerPack flowerPack = new FlowerPack();
        flowerPack.setFlower(new Flower(FlowerType.Camomile));
        FlowerBucket temp = new FlowerBucket();
        temp.addFlowerPack(flowerPack);
        assertNull(flowerStore.search(flower));
    }
}